package JavaSchool;
import java.text.DecimalFormat;

public class Condensatore {
    /*
        il volt è la riga e il tempo è la colonna

        */   
static String[][] matrice= new String[30][30];
    public static void outputspostamenti() {
        System.out.println("0||||1||||2||||3||||4||||5");
        for (int i=0;i<matrice.length;i++){//colonna
            for (int j=0;j<matrice.length;j++){//riga
             System.out.print(matrice[i][j]+" ");            
            }
            System.out.println("");
        }
        System.out.println("------------------------------");
     }

     public static void inizializzamatrice() {
        for (int i=0;i<matrice.length;i++){
            for (int j=0;j<matrice.length;j++){
                matrice[i][j] = "";
            }
        }       
    }

    public static void main(String[] args) {
        double volt=0,t=0.1,tempt=0.1,e=24,r=30000,c=0.000033,q[]=new double[30],v[]=new double[30],i[]=new double[30], deltaQ[]=new double[30];
      
        DecimalFormat dec= new DecimalFormat("#0.0");// serve a stabilire quanti decimali utilizzare
        inizializzamatrice();//sostituisco null a blank
        //primo elemento corrente
        i[0]=e/r;
        //primo elemento Δ Carica
        deltaQ[0]=i[0]*t;
        //primo elemento Tensione
        v[0]=0;
    
        System.out.println("tempo= "+(0.00)+"s delta q: "+deltaQ[0]+", q: "+q[0]+", v: "+v[0]+", i: "+i[0]);// stampo subito i primi elementi perchè l'indice del for successivo parte da 1
        matrice[0][0]="|";
        for  (int j=1;j<q.length;j++){          
            q[j]=q[j-1]+deltaQ[j-1];// calcola la carica  
            volt=v[j]=q[j]/c; // calcolo la tensione
            i[j]=(e-v[j])/r; // calcolo la   corrente
            deltaQ[j]=t*i[j]; // calcolo il delta di q
            matrice[j][(int)(volt)]="|";          
            System.out.println("tempo= "+dec.format(tempt)+"s delta q: "+deltaQ[j]+", q: "+q[j]+", v: "+v[j]+", i: "+i[j]); // stampo a video i risultati
            tempt=tempt+0.1;// lo utilizzo per stampare a video i secondi
        }   
        outputspostamenti();
          
    }    
}
