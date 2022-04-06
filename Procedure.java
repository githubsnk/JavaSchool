package JavaSchool;

/**
 * 
 * 
 * 
 * 
 * @(#)ProceduresAndFunctionsBasicsCiao.java
 * Uso di sottoprogrammi (stile funzionale tradizionale, top-down)
 *
 * Obiettivi generali: riuso, semplificazione
 * Criteri fondamentali: cohesion, loose coupling
 *
 * Your turn: sviluppare metodo che legga il nome dell'utente,
 *		il numero di volte che si vuole stampare,
 *		e scrivere n volte "Ciao" <nome>.
**/

import java.util.*;

public class Procedure {

	public static void main(String[] args) {
        String stringa= MiaLibr.dammiNome();
        int nvolte= MiaLibr.dimmiQuanteVolteVuoiStampare();        
		MiaLibr.stampaXNVolte(stringa,nvolte);
        // MiaLibr.stampaCiao10Volte();
		// MiaLibr.stampaCiaoNVolte(3);     
		// MiaLibr.stampaCiaoNVolte(k);
	}
}

class MiaLibr { //notare: e' una classe differente - potrebbe essere in un file separato e quindi utilizzato da altri programmi

// procedures

	public static void stampaCiao10Volte (){

        for (int i=0; i< 10; i++){
			System.out.println("Ciao");
            
		}
	}

	public static void stampaCiaoNVolte (int n){
		for (int i=0; i< n; i++){
			System.out.println("Ciao");
		}
	}

	public static void stampaXNVolte (String x, int n){
		for (int i=0; i< n; i++){
			System.out.println(x);
		}
	}
	
// Function
	public static String dammiNome(){
		System.out.println("inserisci il tuo nome?");
		Scanner scanner = new Scanner(System.in);
            return (scanner.next());
        
        
	}
    public static int dimmiQuanteVolteVuoiStampare(){
		System.out.println("Quante volte vorresti stampare?");
		Scanner scanner = new Scanner(System.in);
            return(scanner.nextInt());
        
	}
    
}


