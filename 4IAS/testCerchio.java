package SviluppoJava;

import java.util.Scanner;

public class testCerchio {
    public static void main(String[] args) {
        Scanner leggi= new Scanner(System.in);
                
        boolean exit=true; Cerchio c1=null, c2=null; int scelta=0;
        
        // menù
        System.out.println("1- crea cerchio (senza parametri)");
        System.out.println("2- crea cerchio (raggio e punto)");
        System.out.println("3- crea cerchio (perimetro e punto)");
        System.out.println("4- crea copia cerchio");
        System.out.println("5- confronto");
        System.out.println("6- stato");
        System.out.println("55- stampa menù");
        System.out.println("0- esci");
        

        do {
            System.out.println("----------------------------------------");
            scelta=leggi.nextInt();
            switch (scelta) {
                case 1:// crea cerchio senza parametri
                    c1=new Cerchio();
                    break;
            
                case 2:// crea cerchio con raggio e punto
                    System.out.println("digitare: raggio, punto centro");
                    double raggio=leggi.nextDouble();
                    double x=leggi.nextDouble();
                    double y=leggi.nextDouble();
                    Punto centro=new Punto(x,y);
                    c1=new Cerchio(raggio, centro);
                    break;
                case 3:// crea cerchio con perimetro e punto
                    System.out.println("digitare: perimetro, punto centro");
                    double perimetro=leggi.nextDouble();
                    x=leggi.nextDouble();
                    y=leggi.nextDouble();
                    centro=new Punto(x,y);
                    c1=new Cerchio(perimetro, centro);
                    break;
                case 4:// crea copia cerchio
                    c2=new Cerchio(c1);
                    break;
                case 5:// confronta
                    System.out.println(c1.equals(c2));
                    break;
                case 6:// output stato cerchi
                    if (c1==null || c2==null){
                        System.out.println("Creare entrambi i cerchi");
                       
                    } else {
                        System.out.println("Cerchio 1 "+ c1.toString());
                        System.out.println("Cerchio 2 "+ c2.toString());
                    }
                    break;
                case 55:// stampa menù
                    System.out.println("1- crea cerchio (senza parametri)");
                    System.out.println("2- crea cerchio (raggio e punto)");
                    System.out.println("3- crea cerchio (perimetro e punto)");
                    System.out.println("4- crea copia cerchio");
                    System.out.println("5- confronto");
                    System.out.println("6- stato");
                    System.out.println("55- stampa menù");
                    System.out.println("0- esci");
                    break;
                case 0: // esci dal programma
                    exit=false;
                    break;
            }
            System.out.println("----------------------------------------");
        } while (exit);
    }
}
