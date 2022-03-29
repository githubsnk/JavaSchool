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
        int tc=0, tr=0, gc=0, gr=0,gctemp=0,grtemp=0; boolean stopwhile=true;

        // richiedo le coordinate
        System.out.println("digita colonna gatto (0-10)");
        gctemp=gc=scn.nextInt();
        System.out.println("digita riga gatto (0-10)");
        grtemp=gr=scn.nextInt();
        System.out.println("digita colonna topo (0-10)");
        tc=scn.nextInt();
        System.out.println("digita riga topo (0-10)");
        tr=scn.nextInt();
        
        // assegno le coordinate del gatto e del topo all'interno della matrice
        matrice[tc][tr]="T"; matrice[gc][gr]="G";       

        // faccio scorrere l'array con ordine ascendente
        while (stopwhile){
            if (tc>5&&gc>5&&tc>gc){ // ottimizzazione per decidere se la ricerca del topo deve essere in ordine ascendente o discendente
                System.out.println("Ordine ascendente");
                grtemp++;
                if (grtemp==11){ // se raggiungo l'ultima riga
                grtemp=0; // riporto alla prima riga
                gctemp++; // passo alla colonna succesiva
                    if (gctemp==11){ // se raggiungo l'ultima colonna
                        gctemp=0;   // passo alla prima colonna               
                    }
                }    
            }
            else if (tc<5&&gc<5&&tc<gc){
            System.out.println("Ordine discendente");
            grtemp--;
                if (grtemp==0){ // se raggiungo la prima riga
                grtemp=11; // riporto alla ultima riga
                gctemp--; // passo alla colonna precedente
                    if (gctemp==0){ // se raggiungo la prima colonna
                        gctemp=10;  // passo all'ultima colonna      
                    }
                }        
            }
                 
            if (matrice[gctemp][grtemp]=="T"){
                System.out.println("--------------------------------------------------------------");
                System.out.println("robocat ha catturato il topo in posizione ("+gctemp+";"+grtemp+")");
                stopwhile=false;
            }
        } 
    }
}
