package JavaSchool;
import java.util.*;

public class FattorialeQuadrato {    

    public static long fattoriale(long n) {
        long temp=1;
        for (long i=n;i>0;i--){
            temp=temp*i;
        }
        return temp;
    }  

    public static long potenza(long n) {
        n=(int) Math.pow(n,2);
        return n;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Quanti numeri vuoi inserire?");
        int nvolte=scanner.nextInt();
        long num[]=new long[nvolte], fattoriale[]=new long[nvolte], potenza[]=new long[nvolte], n;
        
        for (int i=0;i<nvolte;i++){
            System.out.println("inserisci il "+(i+1)+"° numero..");
            num[i]=n=scanner.nextLong();
            fattoriale[i]=fattoriale(n);
            potenza[i]=potenza(n);        
        }        
        for (int i=0;i<num.length;i++){
            System.out.println("Numero: "+num[i]+" - Fattoriale: "+fattoriale[i]+" - Potenza: "+potenza[i]);
        }
    }    
}
