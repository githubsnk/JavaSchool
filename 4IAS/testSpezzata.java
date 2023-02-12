package SviluppoJava;
import java.util.Scanner;

public class testSpezzata {
    public static void main(String[] args) {
        Scanner leggi= new Scanner(System.in); 
        double x=0, y=0;

        System.out.println("quanti punti vuoi inserire? ");
        int dim=leggi.nextInt();
        Punto punti[]= new Punto[dim];

        for (int i = 0; i < punti.length; i++) {
            System.out.println("inserire coordinata x: ");
            x=leggi.nextDouble();
            System.out.println("inserire coordinata y: ");
            y=leggi.nextDouble();
            punti[i]=new Punto(x,y);         
                        
        }

        System.out.println(punti[0].toString());
        System.out.println(punti[1].toString());
        
       
        //Punto centro=new Punto(x,y);

        //Spezzata s1= new Spezzata();
        
    }
    
}
