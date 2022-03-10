package JavaSchool;
import java.util.*;
/*------------------------instructions-------------------------------------
Determine if a read number is Prime or not. Example: 7 is Prime, 8 is not.
 -------------------------Pseudocode---------------------------------------
Begin
    int Num, i=2, Rest=0; String Quit=""; boolean Dividers;
              
    Write("Enter a number");
    Num:=read;
        do   
            Rest=Num%i;
            if (Rest==0){               // if there is only one divider
                Dividers=true;            
            End if

            if (Num==1||Num<0||Num==2)  //I manage the boolean to exclude the numbers with which
                Dividers=false;         // I have a problem with their management
                
            else
                Dividers=true;// Num is 1 and therefore is not a prime number, or Num <0
            End If                  
         
            i = i+1;                    // increment to have "i" updated before testing
        End while ((Num/2)>i) ;         // the cycle stops when Num / 2 is equal to i
                                        // so it is always half of Num and can never be equal to Num
         
        if (Dividers==true)             //if there is at least one divisor
            Write(Num+" is not a prime number");                         
        
        else                            // if there is no divisor
            Write(Num+" is a prime number");
             
End
*/

public class PrimeNumberWhile {
    public static void main(String args[]){
    Scanner Scn = new Scanner(System.in);
    int Num, Num2, i=1, Rest=0; String Quit=""; boolean Dividers;
    
    do{  Dividers=true; i=1;             // "i" starts from 2 otherwise 1%x always gives remainder 0
        System.out.println("Enter a number");
        Num= Scn.nextInt();

        System.out.println("-----------------------------");          
        
        do {  
            i = i+1;  
            Num2=(Num/2); 

            if(Num!=2&&Num2>i){
                Rest=Num2%i;
                if ((Rest==0)&&(Num<=1)){    // if there is only one divider //I manage the boolean to exclude the numbers with which I have a problem with their management 
                    Dividers=false;//quii
                }
            } 
            else{
                
                Dividers=true;
            }
                                  // increment to have "i" updated before testing
        } while ((Dividers)&&(Num2>=i));             // the cycle stops when Num / 2 is equal to i
                                          // so it is always half of Num and can never be equal to Num
         
        if (Dividers==false){              //if there is at least one divisor
            System.out.println(Num+" is not a prime number");                         
        }
        else{                             // if there is no divisor
            System.out.println(Num+" is a prime number");
            } 
              
        
            //#region Loop Program
            /* I ask for an input to ask whether to repeat the execution of the program again
            or finish */        
            System.out.println(" ");
            System.out.println("To continue digit any key or to exit digit 'q' and then press enter"); 
            Quit= Scn.next().toLowerCase();            
            System.out.println("-------------------------------------------------------------------");  
                         
        }   while (!(Quit.equals("q")));  
            //#endregion    
            Scn.close();
    }
}