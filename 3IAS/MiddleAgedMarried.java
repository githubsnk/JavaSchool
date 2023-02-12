package JavaSchool;
import java.util.Scanner;
/*
Input data the ages of husband and wife who marry in one year in a country communicate
- The overall average age of the spouses (overall husbands and wives)
- The average age of the spouses
- The average age of the brides
The number of pairs to be inserted may vary but must still be communicated at the beginning of the program.

//UPDATE/////////////////////////////////////////////// ////////////////////////
Modify the program to work without knowing the number of couples on which you need to calculate the average age.
Warning: we do not only consider traditionally formed couples, but we can also have couples celebrating
the civil union (man-man; woman-woman). // homosexual union
Communicate the overall average age and the average age of men and women.
*/
public class MiddleAgedMarried {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int NumCouple=0, WifeAge=0, HsbandAge=0, MedWife=0, MedHusband=0, UnionType=0,
            Spouse1=0, Spouse2=0, MedMan=0, MedWoman=0, Division=0;
        String Quit="";
            
        do{                
            System.out.println("To enter straight civil union type 1, for homosexual type 2 and press enter ..");
            UnionType=scn.nextInt();
            NumCouple=NumCouple+1;
                
                if (UnionType==1){
                    System.out.println("Enter husband age "+ NumCouple +" ° couple");
                    HsbandAge= scn.nextInt();
                    MedHusband=MedHusband+HsbandAge;
                    System.out.println("Enter wife age "+ NumCouple +" ° couple");
                    WifeAge= scn.nextInt();
                    MedWife=MedWife+WifeAge;
                    Division=Division+2;
                }

                if (UnionType==2){
                    System.out.println("For a woman-woman couple type 1, for a man-man type 2, then press enter");
                    UnionType=scn.nextInt();
                    System.out.println("Enter the age of the 1st spouse and the age of the 2nd spouse separated by the enter key.");
                    Spouse1= scn.nextInt();
                    Spouse2= scn.nextInt();
                    if (UnionType==1)                        
                        MedWoman=MedWoman+Spouse1;                          
                        MedWoman=MedWoman+Spouse2;
                    if (UnionType==2)                        
                        MedMan=MedMan+Spouse1;                                  
                        MedMan=MedMan+Spouse2;
                }
            
            System.out.println("");      
            System.out.println("Type any key to continue or 'q' to end. then press enter");
            Quit=scn.next().toLowerCase();
            System.out.println("----------------------------------------------------------");
        }   while (!(Quit.equals("q")));
            
        System.out.println("Overall average age husbands and wives "+((MedHusband+MedWife)/Division)); // Average Husbands & Wife
        System.out.println("Overall average age husband "+((MedHusband)/NumCouple)); // Average Husbands 
        System.out.println("Overall average age man "+((MedMan+MedHusband)/NumCouple)); // Average Man
        System.out.println("Overall average age wife "+((MedWife)/NumCouple)); // Average Wife
        System.out.println("Overall average age woman "+((MedWife+MedWoman)/NumCouple)); // Average woman
        System.out.println("Overall average age total "+((MedWife+MedWoman+MedHusband+MedMan)/Division)); // Average woman

    scn.close();
    }    
}
