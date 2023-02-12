package SviluppoJava;

import java.util.*;
public class testTorcia {
    public static void main(String[] args) {
        Torcia t= new Torcia(),t2=null;Scanner read= new Scanner(System.in);
        int scelta;
       

        //stampa elenco delle funzionalità
        System.out.println("1 - accendi");
        System.out.println("2 - spegni");
        System.out.println("3 - ricarica"); 
        System.out.println("4 - stato torcia");
        System.out.println("5 - confronto");
        System.out.println("6 - crea copia istanza di Torcia");
        System.out.println("7 - crea nuova istanza di Torcia");
        
        

        do {
            //scelta da parte dell'utente
            scelta=read.nextInt();

            //richiamo delle funzionalità
            switch(scelta){
               case 1:  t.setAccendi(true);// Accende
                        System.out.println(t.scaricaBatteria());
               break;
               case 2:  t.setAccendi(false); // Spegne
               break;
               case 3:// ricarica
                System.out.println("da 0 a 10 quanto vuoi ricaricare la batteria ?");               
                System.out.println(t.caricaBatteria(read.nextInt()));
               break;
               case 4: // Stato
                System.out.println(t.toString());
               break;
               case 5: //confronto
                if (t2==null) {
                    System.out.println("creare prima un istanza di Torcia");
                } else {
                    System.out.println("Confronto: "); 
                    System.out.println(t.equals(t2));
                }            
               break;
               case 6: // copia istanza
                   t2=t.Copy(t);
                   System.out.println("istanza copia Torcia creata");
                   break;
               case 7: // Crea nuova istanza
                   t2= new Torcia();
                   System.out.println("istanza nuova Torcia creata");
                   break;

               case -1:
               System.out.println("1 -accendi");
               System.out.println("2 -spegni");
               System.out.println("3 -ricarica"); 
               System.out.println("4 -stato torcia");
               System.out.println("5 -confronto");
               System.out.println("6 - crea copia istanza di Torcia");
               System.out.println("7 - crea nuova istanza di Torcia");

                case 0:break;                
            }
               System.out.println("------------------------------");
               if (t.getAccendi()) {
                    System.out.println(t.scaricaBatteria());
               }
       } while (scelta!=0);         
       
    }

}
