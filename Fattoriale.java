package JavaSchool;
import java.util.*;

public class Fattoriale {
    public static void main(String[] args) {
        int n= Mialibr1.dammiNumero();
        int output= Mialibr1.fattoriale(n);
        System.out.println("il fattoriale di "+n+" è: "+output);
    }
}

class Mialibr1 {
    // function
    public static int fattoriale(int n) {
        int temp=1;
        for (int i=n;i>0;i--){
            temp=temp*i;
        }
        return temp;
    }

    // Function
    public static int dammiNumero() {
        System.out.println("inserisci il numero..");
        Scanner scanner = new Scanner(System.in);
            return (scanner.nextInt());
    }
}

