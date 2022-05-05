package JavaSchool;
import java.util.*;
import java.text.*;

public class mylib {

    public static String ParioDispari() {        
        Scanner scn = new Scanner(System.in);
        int pari=0, dispari=0; String esito=" ";  
        
        System.out.println("quanti numeri vuoi inserire");     
        int matrice[] = new int [scn.nextInt()];
        System.out.println("Inserire i numeri/o:");
    
        for (int i=0;i<matrice.length;i++){
            matrice[i]= scn.nextInt();
            if (matrice[i]%2==0){
                pari++;
            }
            else {
                dispari++;
            }            
        }
        if (pari==matrice.length){
            esito="pari";
        }
        else if (dispari==matrice.length) {            
            esito="dispari";
        }        
        return esito;        
    }    

    public static void insGeneralitàImc(int qtaiterazioni,String cognome[], double[] peso, double[] altezza) { 
        Scanner scn = new Scanner(System.in);
        for (int i=0;i<qtaiterazioni;i++){
        System.out.println("-----------------------------------"+(i+1)+"° Persona-----------------------------------");
            System.out.print("Cognome: "); cognome[i]=scn.next();            
            System.out.print("Peso(kg): "); peso[i]=scn.nextDouble();            
            System.out.print("Altezza(m): "); altezza[i]=scn.nextDouble();    
        }
        System.out.println("----------------------------------------------------------------------------------------");
    }

    public static double calcolaImc(int qtaiterazioni, double imc[], double peso[], double altezza[], String outputimc[]) {
        double mediaimc=0;

        for(int i=0;i<qtaiterazioni;i++){
            mediaimc=mediaimc+(imc[i]=peso[i]/Math.pow(altezza[i],2));
            if ((imc[i]>=22) && (imc[i]<=30)){
                outputimc[i]="Sovrappeso";
                }
            else if (imc[i]>30)  {
                outputimc[i]="Obeso";
            }
            else if ((imc[i]>=19) && (imc[i]<=22)){
                outputimc[i]="Regolare";
            }
            else if (imc[i]<19){
                outputimc[i]="Sottopeso";                               
            }            
        }
        return mediaimc=mediaimc/qtaiterazioni;
    }

    public static int richiediQuantità(String messaggio) {
        Scanner scn = new Scanner(System.in);
        int qtà=0;
        
        System.out.print(messaggio); qtà=scn.nextInt();
        return qtà;
        
    }
   
    public static void outputImc(int qtàpersone,String cognome[],double imc[], double peso[], double altezza[],
    String[] outputimc,double mediaimc,int superiori, int inferiori) {
        DecimalFormat decpeso= new DecimalFormat("#0.0");// serve a stabilire quanti decimali utilizzare
        DecimalFormat decaltezza= new DecimalFormat("#0.00");// serve a stabilire quanti decimali utilizzare

        for(int i=0;i<qtàpersone;i++){
            System.out.println("Cognome: "+cognome[i]+" -  Peso: "+decpeso.format(peso[i])+"kg - Altezza: "
            +decaltezza.format(altezza[i])+"m - imc: "+outputimc[i]);
            if (imc[i]>mediaimc){
                superiori++;
            }
            else{
                inferiori++;
            }
        }                
        System.out.println("---------------------------Superiori/Inferiori rispetto alla media-------------------------");
        System.out.println(superiori+" persone sono superiori alla media - "+inferiori+" persone sono inferiori alla media");
        
    }

}