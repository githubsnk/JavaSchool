package JavaSchool;
import java.util.Scanner;
/*
Given as input the value of the sides and the height of a rectangle trapezoid communicate

to. The perimeter of the trapezium
b. The area of ​​the trapezius (Area = (b + B) * h / 2
c. The measurement of the diagonals of the trapezoid

*/
public class Trapezium {
    public static void main (String args[]){
        Scanner Scn = new Scanner(System.in);
        String Quit="";
        do{
            double Side1,Side2,b,B,h,d1,d2,Perimeter,Area;
            System.out.println("Enter the side 1");
            Side1= Scn.nextDouble();
            System.out.println("Enter the side 2");
            Side2= Scn.nextDouble();
            System.out.println("insert the smaller base side");
            b= Scn.nextDouble();
            System.out.println("insert the larger base side");
            B= Scn.nextDouble();            
            h= Side1;

            System.out.println();
            System.out.println("-------------------------------- ");
            System.out.println();
            /* a) */ Perimeter= Side1+Side2+b+B;
            System.out.print("Perimeter: "+Perimeter);
            /* b) */ Area=(b+B)*h/2;
            System.out.print(" -Area: "+Area);
            /* c) */
            d2=Math.sqrt(Math.pow(b,2)+Math.pow(Side1,2));
            d1=Math.sqrt(Math.pow(B,2)+Math.pow(Side1,2));
            System.out.print(" -Diagonal 1: "+d1+" -Diagonal 2: "+d2);
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
