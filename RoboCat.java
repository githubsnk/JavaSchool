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
        String matrice[][]= new String [10][10];
        int whilecounter=0, tc=0, tr=0, gc=0, gr=0,gctemp=0,grtemp=0; boolean stopwhile=true;


        System.out.println("dove si vuole posizionare il topo?");
        // usare le variabili tc=0, tr=0, gc=0, gr=0; al posto dell'indice

         gc=2; gr=3; tc=5; tr=9; 
        
        matrice[tc][tr]="T";
        matrice[gc][gr]="G";

        while (stopwhile){ 
            whilecounter++; 
                        
            if (whilecounter>1){
                grtemp++;
                if (grtemp==10){
                    grtemp=0;
                    gctemp=gc+1;
                    if (gctemp==10){
                        gctemp=0;                    
                    }
                }
            }
            else{
                grtemp=gr+1;
                if (grtemp==10){
                    grtemp=0;
                    gctemp=gc+1;
                    if (gctemp==10){
                        gctemp=0;                    
                    }
                }

            }
            
           

            if (matrice[gctemp][grtemp]=="T"){
                System.out.println("Topo radioattivo catturato");
                stopwhile=false;
            }
        }    

    }
    
}
