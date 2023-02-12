package SviluppoJava;

import java.util.Scanner;

public class testFunzionario {
    public static void main(String[] args) {
        Scanner leggi=new Scanner(System.in);
        Funzionario fnz =new Funzionario();
        int scelta;

        do {
            System.out.println(fnz.menu());
            scelta=leggi.nextInt();

            switch (scelta) {
                case 1: //inserisci impiegato
                System.out.println("digita nome funzionario");
                fnz.setNome("ImpPippo");
                System.out.println("digita salario");
                fnz.setSalario(100);
                System.out.println("digita n° matricola");
                fnz.setMatricola("pippoxxx");
                System.out.println("digita anni di servizio");
                fnz.setAnniDiServizio(5);
                System.out.println("digita nome progetto");
                fnz.setProgetto("progetto nuovo");
                    break;
            
                case 2://stampa
                    System.out.print(fnz);
                    break;              
            }            
        } while (scelta!=0);

    }
}
