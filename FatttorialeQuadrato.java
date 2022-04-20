package JavaSchool;
import java.util.*;

public class FatttorialeQuadrato {    

    public static long fattoriale(long n) {
        long temp=1;
        for (long i=n;i>0;i--){
            temp=temp*i;
        }
        return temp;
    }

    // Function
    public static long dammiNumero() {
        System.out.println("inserisci il numero..");
        try (Scanner scanner = new Scanner(System.in)) {
            return (scanner.nextLong());
        }
    }   

    public static long potenza(long n) {
        n=(int) Math.pow(n,2);
        return n;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long num[], fattoriale[], potenza[],n ;
        System.out.println("Quanti numeri vuoi inserire?");
        int nvolte=scanner.nextInt();
        
        for (int i=0;i<nvolte;i++){
            System.out.println("inserisci il "+(i+1)+"° numero..");
            num[i]=n= scanner.nextLong();
            fattoriale[i]=fattoriale(n);
            potenza[i]=potenza(n);        
        }        
        for (int i=0;i<num.length;i++){
            System.out.println("Numero: "+num[i]+" Fattoriale: "+fattoriale[i]+" Potenza: "potenza[i]);
        }
    }
    
}
