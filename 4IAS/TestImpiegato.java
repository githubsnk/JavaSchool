//https://onlinegdb.com/fJSZZh3rM
package SviluppoJava;
import java.util.Scanner;

public class TestImpiegato {
    public static void main(String[] args) {
        Scanner leggi =new Scanner(System.in);
        int scelta;
        Impiegato imp = new Impiegato();
        Manager mng = new Manager ();

        do {
            System.out.println(mng.menu());
            scelta=leggi.nextInt();

            switch (scelta) {
                case 1: //inserisci impiegato
                System.out.println("digita nome impiegato");
                imp.setNome("ImpPippo");
                System.out.println("digita salario");
                imp.setSalario(100);
                System.out.println("digita n° matricola");
                imp.setMatricola("pippoxxx");
                System.out.println("digita anni di servizio");
                imp.setAnniDiServizio(5);
                    break;
            
                case 2://inserisci manager+segretaria
                System.out.println("digita nome manager");
                mng.setNome("MngTopolino");
                System.out.println("digita salario");
                mng.setSalario(1000);
                System.out.println("digita n° matricola");
                mng.setMatricola("topoyyy");
                System.out.println("digita anni di servizio");
                mng.setAnniDiServizio(10);
                System.out.println("digita nome segretaria");
                mng.sgr.setNome("minnie");                
                System.out.println("digita salario segretaria");
                mng.sgr.setSalario(600);
                System.out.println("digita n° matricola segretaria");
                mng.sgr.setNome("sarazzz");
                System.out.println("digita anni di servizio segretaria");
                mng.sgr.setAnniDiServizio(5);                
                    break;

                case 3://stampa
                    System.out.print("Impiegato: ");
                    System.out.println(imp.toString());
                    System.out.print("Manager: ");
                    System.out.println(mng);
                    System.out.print("Segretaria: ");
                    System.out.println(mng.sgr);
                    break;

                case 4://incrementa salario impiegato
                    System.out.println("digita incremento impiegato in %");
                    imp.incrementaSalario(leggi.nextDouble());
                    break;

                case 5://incrementa salario manager
                    System.out.println("digita incremento manager in %");
                    mng.incrementaSalario(leggi.nextDouble());
                    break;

                case 6:// incrementa salario segretaria
                    System.out.println("digita incremento manager in %");
                    mng.sgr.incrementaSalario(leggi.nextDouble());
                    break;
            }            
        } while (scelta!=0);
    }
}
