package JavaSchool;
/*
Sviluppare un metodo (funzione) che riceve un intero come parametro, e restituisce un boolean: TRUE se primo, FALSE se non primo.
Utilizzare questo metodo da un main, leggendo 5 numeri dall'utente e dicendogli quanti di questi sono primi.
 n è primo se non è divisibile per nessuno degli interi, k, compresi tra 1 e n, estremi esclusi (1<k<n). 
 Potremmo pensare allora di risolvere il problema verificando proprio ciò.
*/
public class IsPrime {      
    public static void main(String[] args) {       
        boolean primo=true;int si=0;        
        int iter=mylib.dammiInt("quanti numeri vuoi inserire? "); 

        for(int i=0;i<iter;i++){                  
            primo=mylib.numeroPrimo(mylib.dammiInt("Inserire il "+(i+1)+"° numero: "));

            if (primo) {
                si++;                           
            }
        }
            System.out.println(+iter+" numeri digitati, "+si+" sono primi." );
    }    
}
