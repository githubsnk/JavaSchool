package JavaSchool;
import java.util.*;
/*
Given an input, the measurement of two legs of a right triangle communicating the perimeter and Area of ​​the output
right triangle
*/

public class RightTriangle {
    public static void main(String args[]){
   Scanner Scn = new Scanner(System.in);
   String Quit="";
    do{
        double Cathetus1, Cathetus2, Hypotenuse, Perimeter, Area;
    
        System.out.println("Insert the first and second cathetus separated by the enter key");
        Cathetus1=Scn.nextInt();
        Cathetus2=Scn.nextInt();
        Hypotenuse= (Math.sqrt(Math.pow(Cathetus1,2)+Math.pow(Cathetus2,2)));
        Perimeter= Hypotenuse+Cathetus1+Cathetus2;
        System.out.println("The Perimeter of the triangle is: " + Perimeter);
        Area=(Cathetus1*Cathetus2)/2;
        System.out.println("The Area of ​​the triangle is: " + Area);
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

