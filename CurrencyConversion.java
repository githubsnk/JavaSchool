package JavaSchool;
import java.util.*;
/*-------------------------------------------Instructions-----------------------------------------------------------
The euro / dollar exchange rate today is 1.16; therefore one euro is worth 1.16 dollars. Writing an algorithm in java
which allows to:
• ask the user if he wants to convert a value of euro into dollars or vice versa;
• receives the value to be converted (in euros or dollars in relation to the previous choice);
• output the Converted value (in dollars or euros)
*/
public class CurrencyConversion {
    public static void main(String args[]){
        Scanner Scn = new Scanner(System.in);
        String Quit=" ";

    do {            
        int Choice;
        double Amount;
        double Converted;
        double Usd = 1.16; // Eur value
        double Eur = 0.862; // Dollar value
                
            // Ask in input if you want to convert from Eur to Usd or the other way around
            System.out.println("to convert from Eur/Usd type '1', type '2' for Usd/Eur..");
            Choice = Scn.nextInt();
                
            if (Choice == 1){ // selection for Eur/Usd conversion
                System.out.println("enter the amount in €");
                Amount=Scn.nextDouble();
                Converted= Amount * Usd;
                System.out.println("The amount is "+ Converted+ " $" );
            }
            else if (Choice == 2){ // selection for Usd/Eur conversion
                System.out.println("enter the amount in $");
                Amount=Scn.nextDouble();
                Converted= Amount * Eur;
                System.out.println("The amount is "+ Converted + " €" );            
            } 
        /* I ask for an input to ask whether to repeat the execution of the program again
        or finish */
        System.out.println(" ");
        System.out.println("To continue digit any key or to exit digit 'q' and then press enter"); 
        Quit= Scn.next().toLowerCase();            
        System.out.println("-------------------------------------------------------------------");            
        }   while (!(Quit.equals("q")));   
        Scn.close();
        }         
}
      
        

    

