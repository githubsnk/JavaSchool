package JavaSchool;

import java.util.Scanner;

/*
Sviluppare un programma con i metodi adeguati che consenta di stabilire il numero di
lettere inglesi (J, K, X, Y, W) presenti in una stringa di caratteri. Gestire adeguatamente
l’eventuale presenza di lettere minuscole e maiuscole.
*/
public class LettereInglesi {
    
    public static String leggistringa() {
        
        Scanner scn = new Scanner (System.in).useDelimiter(Character.isDigit(c));
       
        System.out.println("inserisci la stringa di caratteri..");
        
       
        
        return scn.next();      
    }

    public static int verificalettereinglesi(String stringa) {
        int i=0, numingchar=0; Character alfabetoinglese[]={'j','k','x','y','w'};
        while(i<stringa.length()){
            for (int j=0;j<alfabetoinglese.length;j++){
                if (stringa.toLowerCase().charAt(i)==' '){
                    i++;
                }
                if (stringa.toLowerCase().charAt(i)==alfabetoinglese[j]){
                    numingchar++;
                }
                
            } 
            i++;
        }        
        return numingchar;
        
    }

    public static void main(String[] args) {
        String stringa = leggistringa();
        int lettereinglesi=verificalettereinglesi(stringa);
        System.out.println("le lettere inglesi sono: "+lettereinglesi);
    }    
}
