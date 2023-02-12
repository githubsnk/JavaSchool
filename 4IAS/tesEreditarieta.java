import java.util.Scanner;

public class tesEreditarieta {
    public static void main(String[] args) {
        Scanner leggi=new Scanner(System.in);
        Rettangolo r = new Rettangolo(); 
        Rettangolo rq = new Quadrato2(0);        
        int scelta=0;

        
        do {
            System.out.println("digita scelta");
            scelta=leggi.nextInt();
            switch (scelta) {
                
                case 1://inserimento rettangolo
                    System.out.println("digita il 1° lato");
                    r.setL1(leggi.nextDouble());
                    System.out.println("digita il 2° lato");
                    r.setL2(leggi.nextDouble());     
                    break;
            
                case 2://inserimento quadrato
                    System.out.println("digita il lato");
                    rq=new Quadrato2(leggi.nextDouble());
                    break;
                
                case 3://stampa
                    System.out.println("rettangolo "+r);
                    System.out.println("quadrato "+rq);
                    break;

                case 4://calcola area 
                    System.out.println("rettangolo: "+r.area()+"m2");
                    System.out.println("quadrato: "+rq.area()+"m2");
                    break;
                case 5:// calcola perimetro
                    System.out.println("rettangolo: "+r.perimetro());
                    System.out.println("quadrato: "+rq.perimetro());
                    break;
            }
            
        } while (scelta!=0);
         
        
    }
    
}
