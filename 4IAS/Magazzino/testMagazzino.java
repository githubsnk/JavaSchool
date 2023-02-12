import java.util.Scanner;

public class testMagazzino{
    public static void main(String[] args) {
        Scanner leggi= new Scanner(System.in);
        Magazzino m=new Magazzino(200);
        String nome;
        int prezzo, pos, scelta=0;
        String menu=m.menu();
        
        do {
            //menu'
            System.out.println(menu);          
            scelta=leggi.nextInt(); 
            
            switch(scelta){
                case 1: // aggiungi                
                    System.out.println("digita nome prodotto: ");         
                    nome=leggi.next();
                    System.out.println("digita prezzo prodotto ");
                    prezzo=leggi.nextInt();
                    Prodotto p=new Prodotto(nome, prezzo);
                    if (m.aggiungi(p)) {
                        System.out.println("Prodotto aggiunto");
                    } else {
                        System.out.println("magazzino pieno");
                    }
                break;

                case 2://stampa
                    System.out.println(m);   
                break;
                case 3://Modifica
                    //ricerca
                    System.out.println("digita nome prodotto: ");         
                    nome=leggi.next();
                    pos=m.ricerca(nome);
                    System.out.println("digita nome prodotto: ");         
                    nome=leggi.next();
                    System.out.println("digita prezzo prodotto ");
                    prezzo=leggi.nextInt();
                    p=new Prodotto(nome, prezzo);
                    m.modifica(p, pos);                         
                break;

                case 4:// cancellazione
                    System.out.println("digita nome prodotto: ");         
                    nome=leggi.next();
                    m.cancella(m.ricerca(nome));                  
                break;

                case 5:// Aumenta Prezzi (%)
                    System.out.println("digita aumento in %");                    
                    m.suPrezzi(leggi.nextDouble());   
                break;

                case 6:// Sconta Prezzi (%)
                    System.out.println("digita sconto in %");                    
                    m.giuPrezzi(leggi.nextDouble());   
                break;

                case 7:// prezzo massimo 
                    System.out.println("digita prezzo massimo"); 
                    m.limPrezziMax(leggi.nextDouble());
                break;

                case 8://sotto prodotti sotto"prezzo"
                //metodo che restituisca un "sotto magazzino" con i prodotti il cui prezzo sia inferiore ad un valore scelto
                    Magazzino m2;                    
                    System.out.println("seleziona minori di: ");
                    m2=m.selPrezzoLim(leggi.nextDouble());
                    System.out.println(m2);
            }            
        } while (scelta!=0);
    }    
}
