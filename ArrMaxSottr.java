package JavaSchool;
import java.util.*;
/*
Leggere 10 numeri dall'utente, identificare il massimo e sottrarlo da tutti gli elementi. Visualizzare i nuovi numeri ottenuti.
Esempio: 5 3 6 2 5 2 3 7 8 4 -> -3 -5 -2 ...
*/

public class ArrMaxSottr {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int digit[]= new int [10], valmax=0;
        

        // inserisco il numero digitato nell'array
	    for (int i=0;i<10;i++) {
            System.out.println("digita "+(i+1)+"° numero");
            digit[i]=scn.nextInt();
            System.out.println("---------------------------");
        }

        // cerco il valore digitato più grande
        for (int i=0;i<10;i++){
            if (digit[i]>valmax){
                valmax=digit[i];
            } 
        }
        // output di ogni elemento dell'array da cui sottraggo il valmax
        System.out.println("------------Numero massimo sottratto---------------");
        for (int i=0;i<10;i++){
            System.out.println((i+1)+"° numero digitato");
            digit[i]=digit[i]-valmax;
            System.out.println(digit[i]);
            System.out.println("---------------------------");
        }
        System.out.println("----------------------------------------");
        System.out.println("il numero maggiore digitato è "+valmax);
        scn.close();
    }    
}
