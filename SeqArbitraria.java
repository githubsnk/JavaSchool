package JavaSchool;
import java.util.*;
/*---------------------------------Instructions---------------------------------------------------------
Scrivere un programma che riceva in ingresso una sequenza arbitraria di interi terminata da uno zero
e produca come risultato la media dei valori di ingresso (escludendo lo zero) compresi nell'intervallo 
[5..20], esclusi i multipli di 3.
Nel caso di numeri negativi il programma avvisa l'utente (anche ripetutamente) di reintrodurre il numero.
-----------------------------------Pseudocode-----------------------------------------------------------
Begin
    int Num, Media;
    Write("Inserisci un numero..")
    Num=Read

    do{
        Write("Inserisci un numero..");
        Num=Scn.nextInt();
        if (Num>0){
            if ((Num>=5 && Num<=20)&&(!(Num%3==0))){
                Media=Media+Num;
            }
            End if
        }
        else {
            Write("Reintrodurre il numero");
        }
        End if
    } while (!(Num==0));
End

*/

public class SeqArbitraria {
    public static void main(String[] args) {
        Scanner Scn = new Scanner(System.in);
        int Num, Media=0; String Quit="";

    
    do{
        do{
            System.out.println("Inserisci un numero..");
            Num=Scn.nextInt();
            if (Num>0){
                if ((Num>=5 && Num<=20)&&(!(Num%3==0))){
                    Media=Media+Num;
                }
            }
            else {
                System.out.println("Reintrodurre il numero");
            }
        } while (!(Num==0));
        
        System.out.println("La media dei numeri: "+ Media);
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
