package JavaSchool;
import java.util.*;

public class Fattoriale { 
     // function
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
        public static void main(String[] args) {
            long n= dammiNumero();
            long output= fattoriale(n);
            System.out.println("il fattoriale di "+n+" è: "+output);
        }
}