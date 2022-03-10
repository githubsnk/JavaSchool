package JavaSchool;
import java.util.*;
/*---------------------------------Instructions-----------------------------------------------------
Write a program that allows you to input a date (day and month without year);
communicate with respect to this date how many days are left until the end of the month
(for example if it is inserted January 4 I will have to say 27 days to the end of the month; if
I enter November 18, I will have to say there are 12 days left to the end of the month ...)
Remember that:
Thirty days has November, with April, June and September of 28 there is one (February) all the others
they are 31 (do not consider leap years).
*/
public class DayOfMonth {
    public static void main (String args[]){
        Scanner Scn = new Scanner(System.in); 
        String Month="", Quit=""; 
        int MissingDay=0, Day=0;               
            // iterazione per gestire la riesecuzione del programma al suo termine
        do {     
            Month=""; Quit=""; MissingDay=0; Day=0;                         
        
            System.out.println("enter day in numbers");
            Day= Scn.nextInt();
                
            System.out.println("Enter month in letters' ex. 'February'");
            Month= Scn.next().toLowerCase(); // any string entered in month will make it a lower case
        
            // I select the months that year 30 days
            if (Month.equals("november")||Month.equals("april")||Month.equals("june")||
                Month.equals("september")&&(Day>0)&&(Day<31)){     
                if (Day>0&&Day<29){
                MissingDay = 30 - Day;
                System.out.println("There are "+ MissingDay +" days to the end of the Month");
                System.out.println("------------------------------------------------");
                }
            }   
                // I select the months that year 28 days
                else if (Month.equals("february")&&(Day>0)&&(Day<29)){
                    if (Day>0&&Day<29){
                    MissingDay = 28 - Day;              
                    System.out.println("Mancano "+ MissingDay +" days to the end of the Month");  
                    System.out.println("------------------------------------------------");       
                    }
                  
                
                // I select the months that year 31 days
                } else if (Month.equals("january")||Month.equals("march")||Month.equals("may")||
                Month.equals("july")||Month.equals("august")||Month.equals("october")||
                Month.equals("december")){
                    if (Day>0&&Day<32){
                    MissingDay = 31 - Day;           
                    System.out.println("There are "+ MissingDay +" days to the end of the Month");  
                    System.out.println("------------------------------------------------");
                    }                    
                }
            else {
                System.out.println("TRY AGAIN! enter a valid date .."); 
                }          
                                    
            /* I ask for an input to ask whether to repeat the execution of the program again
            or finish */
            System.out.println("To continue digit any key or to exit digit 'q' and then press enter"); 
            Quit= Scn.next().toLowerCase();            
            System.out.println("-------------------------------------------------------------------");
        }   while (!(Quit.equals("q")));   
        Scn.close();      
    }              
}    

