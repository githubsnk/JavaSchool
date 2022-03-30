package JavaSchool;

import java.util.Scanner;

/*
Terreno: matrice n x m, bordi "solidi".
Un solo topo a (5, 9). Topo immobile. Nessun ostacolo.
Gatto in posizione (2, 3). Vede il topo. Mosse possibili: N, S, W, E
Trovare una strategia per acchiappare il topo (per esempio mosse random, brute force), visualizzare le mosse del gatto.

Estensioni:
Due topi
Ostacoli
Mosse anche in diagonale (NW, NE, SW, SE)

*/
public class RoboCat {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String matrice[][]= new String [11][11]; // 11 elementi per avere il 10mo elemento compreso
        int i=0, tc=0, tr=0, gc=0, gr=0,gctemp=0,grtemp=0; boolean stopwhile=true;

        //#region richiedo le coordinate        
        System.out.println("digita colonna gatto (0-10)");
        gctemp=gc=scn.nextInt();
        System.out.println("digita riga gatto (0-10)");
        grtemp=gr=scn.nextInt();
        System.out.println("digita colonna topo (0-10)");
        tc=scn.nextInt();
        System.out.println("digita riga topo (0-10)");
        tr=scn.nextInt();
        //#endregion
        // assegno le coordinate del gatto e del topo all'interno della matrice
        matrice[gc][gr]="G"; matrice[tc][tr]="T";     // qui è importante l'ordine di inserimento 
                                                      // altrimenti trova "G" al posto di "T" **

            // faccio scorrere l'array con ordine ascendente
            while (stopwhile){     
                
                if (grtemp==11){ // se raggiungo l'ultima riga
                grtemp=0; // riporto alla prima riga
                gctemp++; // passo alla colonna succesiva
                    if (gctemp==11){ // se raggiungo l'ultima colonna
                        gctemp=0;   // passo alla prima colonna               
                    }
                }    
                
                if (matrice[gctemp][grtemp]=="T"){// **
                    System.out.println("--------------------------------------------------------------");
                    System.out.println("robocat ha catturato il topo in posizione ("+gctemp+";"+grtemp+")");
                    stopwhile=false;
                } 
            grtemp++; // aumento la riga del gatto        
        }
    scn.close();
    } 
}

