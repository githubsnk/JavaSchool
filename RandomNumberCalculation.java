package JavaSchool;
import java.util.*;

/*---------------------------------Pseudocode---------------------------------------------

Extract 50 random numbers between 1 and 100; communicate with respect to the 50 numbers drawn
to. 
a. How many numbers are even and how many odd
b. The percentage of odd and even numbers

/// AGGIORNARE/////////////////////////////////////////////////////////////////////
Estrarre continuativamente la sequenza di numeri casuali fino a quando non si preme un tasto
prescelto da tastiera che comunica "STOP ESTRAZIONI".

Begin
    int RandomNum=0, Even=0, Odd=0
    Double EvenPerc=0.0, OddPerc=0.0
                
        for (int i=1;i<=50;i++)
            RandomNum= Random number from 0 to 100
            Write(RandomNum)
            if (RandomNum%2==0)
                Even=Even+1
            else
                Odd=Odd+1
            End If
        End for
        Write("Numeri Even: "+Even+", Odd: "+Odd);
        
        EvenPerc=(double) Even
        EvenPerc=(EvenPerc/50)*100
        OddPerc=(double) Odd
        OddPerc=(OddPerc/50)*100

        Write("% N° Even: "+EvenPerc+"% - % N° Odd: "+OddPerc+"%");
End

*/
public class RandomNumberCalculation {    

        public static void main (String args[]){
            
            Scanner Scn = new Scanner(System.in);
            String Quit="";
            
            do{   
                int RandomNum=0, Even=0, Odd=0;
                Double EvenPerc=0.0, OddPerc=0.0;    
                                                 
                for (int i=1;i<=50;i++){
                    RandomNum= (int) (Math.random() * 100);
                    System.out.println(RandomNum);
                                        
                    if (RandomNum%2==0){
                        Even=Even+1;
                    }
                    else{
                        Odd=Odd+1;
                    }
                   // Quit=Scn.next("ciao");

                } 
                System.out.println("Even numbers: "+Even+", Odd: "+Odd);
                
                EvenPerc=(double) Even;
                EvenPerc=(EvenPerc/50)*100;
                OddPerc=(double) Odd;
                OddPerc=(OddPerc/50)*100;

                System.out.println("% N° Even: "+EvenPerc+"% - % N° Odd: "+OddPerc+"%");
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

