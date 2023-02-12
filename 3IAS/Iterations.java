package JavaSchool;
import java.util.*;

/*---------------------------Instructions-----------------------------------
Make a program that calculates the average of "IteratNumb" numbers.
*/

public class Iterations {
    public static void main(String args[]){
        Scanner scn= new Scanner(System.in);
        String Quit="";
        
        do{
            double Sum=0, Output;
            int IteratNumb;

            System.out.println("how many numbers you want to average?");
            IteratNumb=scn.nextInt();

            // I collect the numbers entered by adding them together
            for (int i = 0; i < IteratNumb; i++){                
                System.out.println("Insert the " + IteratNumb + "°"+ " number");
                Sum=Sum + scn.nextInt();
            }
            
            Output=Sum/IteratNumb;// I calculate the average of the numbers entered
            System.out.println("The average for "+IteratNumb+" number is "+ Output);

        /* I ask for an input to ask whether to repeat the execution of the program again
            or finish */
            System.out.println(" ");
            System.out.println("To continue digit any key or to exit digit 'q' and then press enter"); 
            Quit= scn.next().toLowerCase();            
            System.out.println("-------------------------------------------------------------------");            
        }   while (!(Quit.equals("q")));    
    scn.close();
}
}
