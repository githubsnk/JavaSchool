package JavaSchool;
import java.util.*;
/*
Develop an algorithm that finds the Multiple of a number given by the user
also asking how many multiples you want to view.
*/
public class Multiple {
    public static void main(String args[]){
        Scanner Scn= new Scanner(System.in);
        int Multiple, MaxMultiple, i, Output;
        String Quit="";
            do {
                System.out.println("What number do you want to find its multiples of?");
                Multiple=Scn.nextInt();
                System.out.println("What should be your maximum Multiple?");
                MaxMultiple=Scn.nextInt();
                for (i=0; i<MaxMultiple; i++){ // divide the numbers from 1 to the maximum multiple entered and show on the screen
                    if (i==0){ // those who as the rest year "0"
                        System.out.println("Here are the multiples of: "+Multiple);
                        System.out.println(i);
                    }
                    else{
                        Output=i * Multiple; 
                        System.out.println(Output);
                    }
                }
                /* I ask for an input to ask whether to repeat the execution of the program again
                or finish */
                System.out.println(" ");
                System.out.println("To continue digit any key or to exit digit 'q' and then press enter"); 
                Quit= Scn.next().toLowerCase();            
                System.out.println("-------------------------------------------------------------------");            
            }  while (!(Quit.equals("q")));   
        Scn.close();        
    }    
}
