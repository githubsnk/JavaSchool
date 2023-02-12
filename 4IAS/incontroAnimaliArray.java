// Sviluppare UML e codice delle classi Animale, Gatto, Topo – con metodi comeTiChiami (fornisce il suo nome proprio) e parla 
// (emette il suo verso: squitt, miaoo). Includere main di test.

// Integrare l’esercizio precedente sviluppando il metodo incontra (un altro animale). Quando un animale ne incontra 
// un altro, si presenta con il proprio nome, saluta con il nome dell’animale incontrato, poi parla. Se un topo incontra 
// un gatto [può essere utile utilizzare l’operatore instanceOf], tuttavia, dopo essersi presentato, aver salutato 
// e parlato, grida anche “Aiuto!!”. Includere main di test dove topi e gatti sono inseriti in un array.
import java.util.Scanner;

public class incontroAnimaliArray {
    public static void main(String[] args) {
        Scanner leggi =new Scanner(System.in);
        Animali[] a=new Animali[5];
        Gatto g=new Gatto();
        Topo t=new Topo();
        int scelta=0;
        int progr=0;

        do {
            System.out.println(g.menu());            
            scelta=leggi.nextInt();
            switch (scelta) {
                case 1://inserisci Animale
                    System.out.println("inserire: 1)Gatto - 2)Topo ");                    
                    int ins=leggi.nextInt();
                    System.out.println("digita nome proprio animale: ");
                    if (ins==1) {                        
                       a[progr]= g=new Gatto(leggi.next()); 
                       progr++;                   
                        break;                        
                    } else if(ins==2){     
                        a[progr]= t=new Topo(leggi.next()); 
                        progr++;                   
                        break;
                    }                                  
                case 2://presentati
                    System.out.println(g.saluta());
                    System.out.println(t.alertPredatore(g));
                    break;
                case 3://stampa
                    System.out.println("Gatto: "+g+"Topo: "+t+"\n");
            }//switch
        } while (scelta!=0);
    }//main
}//class
