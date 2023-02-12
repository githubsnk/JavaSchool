package JavaSchool;
import java.util.*;
/*  
Acquisire 10 numeri dall’utente. Calcolarne la media, e sottrarre la
media da ogni elemento dell’array. Visualizzare la nuova media dell’array     
*/


public class Arr10NumMed {
    public static void main(String[] args) {
        
            try (Scanner scn = new Scanner(System.in)) {
                double myarr[] = new double [10], media=0;                
                
                System.out.println("inserire 10 numeri");
                
                for(int i=0;i<10;i++){
                    System.out.println("inserire il "+ i +"° numero");            
                    myarr[i]=scn.nextInt();
                    media= media + myarr[i];
                }
      media = media/myarr.length;
      System.out.println("------------------------------");
      for (int i=0;i<10;i++){
                myarr[i]=myarr[i]-media;       
                System.out.println(myarr[i]);
      }
      scn.close();
            }
}
}
