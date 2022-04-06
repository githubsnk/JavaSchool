package JavaSchool;
import java.util.*;

public class RoboCat2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String matrice[][]= new String [10][10];
        int ct=0, rt=0, cg=0, rg=0, x=0, y=0;

        //#region richiedo le coordinate        
        // System.out.println("digita colonna gatto (0-9)");
        cg=4;//scn.nextInt();
        // System.out.println("digita riga gatto (0-9)");
        rg=6;//scn.nextInt();
        // System.out.println("digita colonna topo (0-9)");
        ct=8;//scn.nextInt();
        // System.out.println("digita riga topo (0-9)");
        rt=9;//scn.nextInt();
        //#endregion

        //inserisco nella matrice gli asterischi per i campi vuoti
        for (int j=0;j<matrice.length;j++){
            for (int i=0;i<matrice.length;i++){
                matrice[i][j]="*";
            }
        }
        // inserisco il gatto e il topo nelle coordinate scelte
        matrice[cg][rg]="G";
        matrice[ct][rt]="T";

        // selezioni per segnalare a video il percorso fatto dal gatto
        
        if (cg<ct){ // colonna gatto minore di colonna topo
            //x=cg+(ct-cg);
            for (int j=ct;j>cg;j--){// da colonna topo a colonna gatto andando indietro  
                matrice[j-1][rt]="."; // colonna diminuisce e riga ferma       
            }
        }

        if (rg<rt){
            //y=rg+(rt-rg);//rt
            for (int j=rt;j>rg;j--){// da riga topo a riga gatto         
                matrice[cg][j]="."; // colonna ferma riga diminuisce      
            }                   
        }

        if (cg>ct){//quii
            //x=cg-(cg-ct);
            for (int j=cg;j>ct;j--){ // da colonna gatto a colonna topo          
                matrice[j][rt]="."; // colonna diminuisce, riga ferma       
            }
        }

        if (rg>rt){
            //y=rg-(rg-rt);
            for (int j=rg;j>rt;j--){ // da riga gatto a riga topo           
                    matrice[cg][j-1]="."; // colonna ferma, riga diminuisce          
            }
        }
        if (cg==ct){
        x=cg;
        matrice[cg][rg]="G+T";
        }
        if (rg==rt){
        y=rg;
        matrice[cg][rg]="G+T";
        }

        System.out.print(" "+matrice[0][0]); System.out.print(" "+matrice[1][0]); System.out.print(" "+matrice[2][0]); System.out.print(" "+matrice[3][0]); System.out.print(" "+matrice[4][0]); System.out.print(" "+matrice[5][0]); System.out.print(" "+matrice[6][0]); System.out.print(" "+matrice[7][0]);System.out.print(" "+matrice[8][0]); System.out.print(" "+matrice[9][0]);
        System.out.println();
        System.out.print(" "+matrice[0][1]); System.out.print(" "+matrice[1][1]); System.out.print(" "+matrice[2][1]); System.out.print(" "+matrice[3][1]); System.out.print(" "+matrice[4][1]); System.out.print(" "+matrice[5][1]); System.out.print(" "+matrice[6][1]); System.out.print(" "+matrice[7][1]);System.out.print(" "+matrice[8][1]); System.out.print(" "+matrice[9][1]);
        System.out.println();
        System.out.print(" "+matrice[0][2]); System.out.print(" "+matrice[1][2]); System.out.print(" "+matrice[2][2]); System.out.print(" "+matrice[3][2]); System.out.print(" "+matrice[4][2]); System.out.print(" "+matrice[5][2]); System.out.print(" "+matrice[6][2]); System.out.print(" "+matrice[7][2]);System.out.print(" "+matrice[8][2]); System.out.print(" "+matrice[9][2]);
        System.out.println();
        System.out.print(" "+matrice[0][3]); System.out.print(" "+matrice[1][3]); System.out.print(" "+matrice[2][3]); System.out.print(" "+matrice[3][3]); System.out.print(" "+matrice[4][3]); System.out.print(" "+matrice[5][3]); System.out.print(" "+matrice[6][3]); System.out.print(" "+matrice[7][3]);System.out.print(" "+matrice[8][3]); System.out.print(" "+matrice[9][3]);
        System.out.println();
        System.out.print(" "+matrice[0][4]); System.out.print(" "+matrice[1][4]); System.out.print(" "+matrice[2][4]); System.out.print(" "+matrice[3][4]); System.out.print(" "+matrice[4][4]); System.out.print(" "+matrice[5][4]); System.out.print(" "+matrice[6][4]); System.out.print(" "+matrice[7][4]);System.out.print(" "+matrice[8][4]); System.out.print(" "+matrice[9][4]);
        System.out.println();
        System.out.print(" "+matrice[0][5]); System.out.print(" "+matrice[1][5]); System.out.print(" "+matrice[2][5]); System.out.print(" "+matrice[3][5]); System.out.print(" "+matrice[4][5]); System.out.print(" "+matrice[5][5]); System.out.print(" "+matrice[6][5]); System.out.print(" "+matrice[7][5]);System.out.print(" "+matrice[8][5]); System.out.print(" "+matrice[9][5]);
        System.out.println();
        System.out.print(" "+matrice[0][6]); System.out.print(" "+matrice[1][6]); System.out.print(" "+matrice[2][6]); System.out.print(" "+matrice[3][6]); System.out.print(" "+matrice[4][6]); System.out.print(" "+matrice[5][6]); System.out.print(" "+matrice[6][6]); System.out.print(" "+matrice[7][6]);System.out.print(" "+matrice[8][6]); System.out.print(" "+matrice[9][6]);
        System.out.println();
        System.out.print(" "+matrice[0][7]); System.out.print(" "+matrice[1][7]); System.out.print(" "+matrice[2][7]); System.out.print(" "+matrice[3][7]); System.out.print(" "+matrice[4][7]); System.out.print(" "+matrice[5][7]); System.out.print(" "+matrice[6][7]); System.out.print(" "+matrice[7][7]);System.out.print(" "+matrice[8][7]); System.out.print(" "+matrice[9][7]);
        System.out.println();
        System.out.print(" "+matrice[0][8]); System.out.print(" "+matrice[1][8]); System.out.print(" "+matrice[2][8]); System.out.print(" "+matrice[3][8]); System.out.print(" "+matrice[4][8]); System.out.print(" "+matrice[5][8]); System.out.print(" "+matrice[6][8]); System.out.print(" "+matrice[7][8]);System.out.print(" "+matrice[8][8]); System.out.print(" "+matrice[9][8]);
        System.out.println();
        System.out.print(" "+matrice[0][9]); System.out.print(" "+matrice[1][9]); System.out.print(" "+matrice[2][9]); System.out.print(" "+matrice[3][9]); System.out.print(" "+matrice[4][9]); System.out.print(" "+matrice[5][9]); System.out.print(" "+matrice[6][9]); System.out.print(" "+matrice[7][9]);System.out.print(" "+matrice[8][9]); System.out.print(" "+matrice[9][9]);
        System.out.println();

        //System.out.println(" il topo è in "+x+y);
    scn.close();
    } 
    
}
