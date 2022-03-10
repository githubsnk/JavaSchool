package JavaSchool;
import java.util.*;
/*
Leggere 10 numeri interi. Indicare l'eventuale elemento ripetuto più frequentemente.
Esempio: 4 5 6 8 3 5 2 5 8 9 -> 5
*/

public class NumRipeFreq {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int digit[]= new int[10], digitvaltemp=0, 
                    digitval=0, qtatemp=0, qta=0;
	
	// inserisco il numero digitato nell'array
	for (int i=0;i<10;i++) {
		System.out.println("inserisci numero");
		digit[i]=scn.nextInt();
    }
	
	// verifico se ci sono numeri doppi nell'array digit
	for (int i=0;i<10;i++){
		for (int j=i+1;j<10;j++){            
			if (digit[i]==digit[j]){ //seleziono i numeri doppi
				digitvaltemp=digit[j]; //contiene il valore ripetuto
				qtatemp++; //contiene il tot di volte che digitvaltemp viene ripetuto
        }  
        if (qtatemp>qta){
            digitval=digitvaltemp;
            qta=qtatemp;
        }    
        qtatemp=0;
        }
            //digivaltemp e qtatemp detengono il valore e la qtà dei doppioni per il n° dell'indice di i
              
    }
        
	System.out.println("il numero più freq.te ripetuto è "+digitval);
    scn.close();
    }
}
    

