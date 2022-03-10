package JavaSchool;
import java.util.Scanner;
/*---------------------------Instructions----------------------------------
Input data the weight and height of a person calculate the body mass index

With body mass expressed in kg and height expressed in meters.
Communicate the person's BMI and if it is
- obese (a person is obese if BMI> 30)
- overweight (22 & lt; = BMI & lt; = 30)
- regular (19 & lt; = BMI & lt; 22)
- underweight (BMI & lt; 19)
*/
public class BodyMass {
    public static void main(String args[]){
    Scanner Scn = new Scanner(System.in);
    String Quit="";

    do{
        double BodyMass;
        double Stature;
        Double Imc; // Body mass index
        String Output = "Something went wrong, please try again!";

        System.out.println("Insert BodyMass in Kg");
        BodyMass=Scn.nextDouble();
        System.out.println("Insert Stature in Mt");
        Stature=Scn.nextDouble();

        Imc= BodyMass/Math.pow(Stature,2);

        if ((Imc>=22) && (Imc<=30)){
            Output="OverWeight";
            }
        else if (Imc>30)  {
            Output="Obese";
        }
        else if ((Imc>=19) && (Imc<=30)){
            Output="Regular";
        }
        else if (Imc<19){
            Output="UnderWeight";
        }
        
        System.out.println("Your body mass index is "+ Output);
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
