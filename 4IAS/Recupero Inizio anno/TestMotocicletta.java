import java.util.Scanner;

public class TestMotocicletta {
    public static void main(String[] args) {
        //istanziare le classi utilizzate
        Scanner read=new Scanner(System.in); //istanza per scanner
        Motocicletta m=new Motocicletta(), m2=null; //istanza motocicletta

        int scelta;

        //stampa elenco delle funzionalità
        System.out.println("1 -accendi");
        System.out.println("2 -spegni");
        System.out.println("3 -rifornimento"); 
        System.out.println("4 -stato motocicletta");
        System.out.println("5 -confronto");
        System.out.println("6 - crea copia istanza di Moto");
        System.out.println("7 - crea nuova istanza di Moto");

        //menu
        do {
             //scelta da parte dell'utente
             scelta=read.nextInt();

             //richiamo delle funzionalità
             switch(scelta){
                case 1:m.accendi();// accende
                break;
                case 2:m.spegni(); //Spegne
                break;
                case 3:// rifornimento
                System.out.println("quanti litri vuoi aggiungere al serbatoio ?");
                float litriRifornimento=read.nextFloat();
                System.out.println(m.rifornisci(litriRifornimento));
                break;
                case 4: // Stato
                System.out.println(m.toString());
                break;
                case 5: //confronto
                if (m2==null) {
                    System.out.println("creare prima un istanza di Moto");
                } else {
                    System.out.println("Confronto: "); 
                    System.out.println(m.equals(m2));
                }            
                break;
                case 6: // copia istanza
                    m2=m.copyMotocicletta();
                    System.out.println("istanza Copia moto creata");
                    break;
                case 7: // Crea nuova istanza
                    m2= new Motocicletta();
                    System.out.println("istanza nuova moto creata");
                    break;

                case -1:
                System.out.println("1 -accendi");
                System.out.println("2 -spegni");
                System.out.println("3 -rifornimento"); 
                System.out.println("4 -stato motocicletta");
                System.out.println("5 -confronto");
                System.out.println("6 - crea copia istanza di Moto");
                System.out.println("7 - crea nuova istanza di Moto");

                 case 0:break;                
             }
                System.out.println("------------------------------");
        } while (scelta!=0);         
        
    }
}
