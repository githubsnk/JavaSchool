package JavaSchool;
import java.util.*;
/*--------------------------------------instructions--------------------------------------
Make a program that in input receives the user's age and in output informs if the user is
adult or minor.
in output also suggest how old the user will be the following year
*/
 public class AdultOrMinor {
         
         public static void main(String[] args) { 
            Scanner Scn = new Scanner(System.in); 
            String Quit="";
         do{
            String name;  
            int age; 
            int adult;
                                      
            System.out.println("Let's go ... what's your name?");  
            name=Scn.next();   
            System.out.println("Ah, ok: let's go "+name +"!"); 
            
            System.out.println("How old are you?");
            age = Scn.nextInt(); 
            adult = age; // I memorize to compare if adult or minor
            age = age + 1; // for next year result


            if (adult > 18) {
               System.out.println("You are of age");
            }
               else {
               System.out.println("You are a minor");
               }
            System.out.println( "Next year you will have "+ age +" years.");     

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
 