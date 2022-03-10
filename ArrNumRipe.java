package JavaSchool;
import java.util.*;
//Leggere 10 numeri dall'utente. Indicare se esiste un numero ripetuto.
public class ArrNumRipe {
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            int i=0, I=0, myarr[]= new int[10], ripetuti=0, num=0;

            for(i=0;i<10;i++){// riempie l'array
                
                System.out.println("inserire il "+ i +"° numero");            
                num=scn.nextInt(); 
                
                I=0;
                while (I<10){
                    
                if (num==myarr[I]) { 

                    ripetuti=ripetuti+1;
                }
                I=I+1;
                }
                myarr[i]=num;
            }
            System.out.println("la q.ta di numeri ripetuti inseriti sono "+ripetuti);     
            scn.close();
        }      
    }
    
}
