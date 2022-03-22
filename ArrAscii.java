package JavaSchool;

import java.util.Scanner;

public class ArrAscii {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);        
        int  ascii[]={49,48,51,53,50,52,55,54}, scelta=0, charcode=0;        
        char carattere[]={'1','0','3','5','2','4','7','6'};
        
        // domando se si vuole codificare o decodificare
        System.out.println ("Per decodificare digita 1 per codificare digita 2");
        scelta=scn.nextInt();

        // scelta per decodifica
        if (scelta==1){
            System.out.println("inserisci il codice ascii da decodificare (da 49 a 55)");
            charcode=scn.nextInt();           
            for (int i=0;i<ascii.length;i++){
                if (charcode==ascii[i]){                    
                    System.out.println("il carattere corrispondente di "+charcode+ " è "+carattere[i]);
                    break;
                }
            }
        }
        // scelta per codifica
        else if (scelta==2){
            System.out.println("inserisci il carattere da codificare (da 1 a 7)");
            charcode=scn.nextInt();            
            
            for (int i=0;i<carattere.length;i++){
                if (charcode==carattere[i]){                    
                    System.out.println("il codice ascii corrispondente di " +charcode+" è "+ascii[i]);
                    break;
                }
            }
        }
        scn.close();
    }       
}
