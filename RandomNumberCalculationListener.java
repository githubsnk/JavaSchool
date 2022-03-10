package JavaSchool;
import java.util.*;
import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/*---------------------------------Pseudocode---------------------------------------------
https://www.delftstack.com/howto/java/java-key-listener/
Extract 50 random numbers between 1 and 100; communicate with respect to the 50 numbers drawn
to. 
a. How many numbers are even and how many odd
b. The percentage of odd and even numbers

/// UPDATE//////////////////////////////////////////////////////////////////////////////////
Continuously extract the sequence of random numbers until a key is pressed
selected from the keyboard which communicates "STOP EXTRACTIONS".

Begin
    Listening 
        boolean Stop   
        if digit "s"
            Stop=false
        End if
            int RandomNum=0, Even=0, Odd=0
                Double EvenPerc=0.0, OddPerc=0.0                            
                    Do
                        i=i+1
                        RandomNum= Random number from 0 to 100
                        Write(RandomNum)
                        if (RandomNum%2==0)
                            Even=Even+1
                        else
                            Odd=Odd+1
                        End If
                    While (Stop)
                        
                EvenPerc=(double) Even
                EvenPerc=(EvenPerc/i)*100
                OddPerc=(double) Odd
                OddPerc=(OddPerc/i)*100

                Write("Even: "+Even+"("+EvenPerc+"%)"+" - Odd: "+Odd+"("+ OddPerc+"%)"+" - Total numbers generated ");
    End Listening
End
*/
public class RandomNumberCalculationListener implements KeyListener {  
    static boolean Stop; //static because otherwise it is not considered in main
    
    @Override
	public void keyTyped(KeyEvent e)
	{

    }
	@Override
	public void keyPressed(KeyEvent e)
	{        
		if(e.isActionKey()){
            
        }        
        if (e.getKeyCode() == KeyEvent.VK_S) {    
			
            Stop=false; // I close the loop that generates random numbers
            System.exit(0); // close the frame
        }      
    }
	@Override
	public void keyReleased(KeyEvent e)
	{

	}  
        public static void main (String args[]){
            
            Scanner Scn = new Scanner(System.in);             
            int RandomNum=0, Even=0, Odd=0,i=0;;
            float EvenPerc=0, OddPerc=0;
            Stop=true; 

            //Setting the Frame and Labels
            Frame f = new Frame("Stop");         
            f.setVisible(true); 
      
                //Creating and adding the key listener
                RandomNumberCalculationListener k = new RandomNumberCalculationListener();
                f.addKeyListener(k);                   
                
                    do {        // loop that generates random numbers         
                        i=i+1;
                        RandomNum= (int) (Math.random() * 100);
                        System.out.println(RandomNum);
                                            
                        if (RandomNum%2==0){ // I count how many odd numbers and how many even numbers
                            Even=Even+1;
                        }
                        else{
                            Odd=Odd+1;
                        }                
                    } while (Stop); // stop if I press "s"
                
                // performs the calculations to know the average of the odd N ° and the even N ° and the total number of N ° extracted.
                EvenPerc=(float) Even;
                EvenPerc=(EvenPerc/i)*100;
                OddPerc=(float) Odd;
                OddPerc=(OddPerc/i)*100;
                System.out.println("------------------------S T O P   E X T R A C T I O N S----------------------------------------");                
                System.out.println("Even: "+Even+"("+EvenPerc+"%)"+" - Odd: "+Odd+"("+ OddPerc+"%)"+" - Total numbers generated "+i);            
                System.out.println("-----------------------------------------------------------------------------------------------");  
                    
        Scn.close();
    }
}

