package JavaSchool;
import java.util.Scanner;
/*-------------------------------------Instructions--------------------------------------------
Input data the weight and height of "n" people calculate the body mass index.
The number of people whose BMI is to be calculated does not have to be asked but is determined 
by stopping the program when the data of all the people have been entered.

BMI = Body Mass / Height

With BodyMass expressed in Kg with one decimal and height expressed in meters with two decimals.

Knowing that a person is:
- obese (a person is obese if BMI> 30)
- overweight (25 <= BMI <= 30)
- regular (19 <= BMI <25)
- underweight (BMI <19)

Tell "n" people how many are obese, overweight, regular, underweight
Establish and communicate the average BMI of the "n" people.

*/
public class BmiAverage {
    public static void main(String args[]){
    Scanner scn = new Scanner(System.in);
    String Quit, MedOutput=""; 
        
        double BodyMass, AverBodyMass=0; 
        double Height, MedHeight=0;
        double Bmc, MedBmc=0.0; // Body mass index
        String Output = "Something went wrong, try again!";
        Integer HowManyPeople=0;
        
        do {                    
            System.out.println("Enter body mass in Kilograms");
            BodyMass=scn.nextDouble();
            System.out.println("Enter height in meters");
            Height=scn.nextDouble();
            
            
            AverBodyMass=AverBodyMass+BodyMass; // I collect the sums of the body masses to calculate the average
            MedHeight=MedHeight+Height; // I collect the sums of the heights to calculate the average
            Bmc= BodyMass/Math.pow(Height,2); // Formula for calculating the body mass index

            HowManyPeople=HowManyPeople+1;
            AverBodyMass=AverBodyMass/HowManyPeople;// I calculate the average of the sums of the body mass
            MedHeight=MedHeight/HowManyPeople;// I calculate the average of the sum of the heights
            MedBmc=AverBodyMass/Math.pow(MedHeight,2);// I calculate the average of the sums of the body mass index       
            
            /* I select weight categories based on body mass index and when they were
            entered the data for all 5 people I assign the average weight category in MedOutput */
            if ((Bmc>=25 && Bmc<=30)||(MedBmc>=25 && MedBmc<=30)){
                Output="OverWeight";
                if (MedBmc>=25 && MedBmc<=30){
                    MedOutput="OverWeight";
                    }
                }
            else if (Bmc>30||MedBmc>30)  {
                Output="Obese";
                if (MedBmc>30){
                    MedOutput="Obese";
                    }
            }
            else if ((Bmc>=19 && Bmc<25)||(MedBmc>=19 && MedBmc<25)){
                Output="Regular";
                if (MedBmc>=19 && MedBmc<25){
                    MedOutput="Regular";
                    }
            }
            else if (Bmc<19||MedBmc<19){
                Output="UnderWeight";
                if (MedBmc<19){
                    MedOutput="UnderWeight";
                    }
            }        
            System.out.println(HowManyPeople+"° person: "+Output+" - Medium Bmc: "+MedOutput);
            System.out.println(""); 
            System.out.println("Medium Bmc: "+MedOutput);  
            /* I ask for an input to ask whether to repeat the execution of the program again
            or finish */
            System.out.println("");      
            System.out.println("Type any key to continue or 'q' to end. then press enter");
            Quit=scn.next().toLowerCase();
            System.out.println("----------------------------------------------------------");
    }   while (!(Quit.equals("q")));    
        
    scn.close();
    }
}


