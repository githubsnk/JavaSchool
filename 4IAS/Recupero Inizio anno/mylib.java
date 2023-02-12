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

    public static boolean isPrime(int n) {        
    boolean primo=true; int i=2;
        do {            
            if (n%i==0&&n>3||n<2){//divide n con l'indice che parte da 2 fino a n/2,e se è divisibile non è un numeor primo anche se n<2 fa.
                return primo=false;// non è un numero primo                     
            }
            else if (i>(n/2)) { //altrimenti se non è divisibile e l'indice è maggiore di n/2 è un numero primo.                    
                return primo;                   
                } 
            i++;         
        } while (primo);
        return primo;              
    }

    public static String readChar(String messaggio) {
        Scanner scn= new Scanner(System.in);
        System.out.print(messaggio);
        String n=scn.next();
        return n;                
    }

    public static int readInt(String messaggio) {
        System.out.println();
        Scanner scn= new Scanner(System.in);
        System.out.print(messaggio);
        int n=scn.nextInt();
        return n;        
    }

    public static long readLong(String messaggio) {
        Scanner scn= new Scanner(System.in);
        System.out.print(messaggio);
        long n=scn.nextLong();
        return n;
        
    }

    public static double readDouble(String messaggio) {
        Scanner scn= new Scanner(System.in);
        System.out.print(messaggio);
        double n=scn.nextDouble();
        return n;        
    }

    public static String readString(String messaggio) {
        Scanner scn= new Scanner(System.in);
        System.out.print(messaggio);
        String stringa=scn.next();
        return stringa;        
    }

    public static long fattoriale(long n) {
        long temp=1;
        for (long i=n;i>0;i--){ 
            temp=temp*i;
        }
        return temp;
    }

    public static long arraySommaFattoriale (long numeri[]){
        long result=0; 
        for (int i=0;i<numeri.length;i++) {
            result=mylib.fattoriale(numeri[i])+result;            
        }
        return result;
    }

    public static long arrSomma (long numeri[]){
        long result=0; 
        for (int i=0;i<numeri.length;i++) {
            result=numeri[i]+result;            
        }
        return result;
    }

    public static int max2Int(int num[]) {
        if (num[0]>num[1]) {
            return num[0];                                
        } 
        else{                
            return num[1];
        }     
    }

    public static int max3Int(int num[]) {
        num[3]=max2Int(num);
        if (num[3]>num){
            return num[3];
        }
        // if (num[0]>num[1]&&num[0]>num[2]) {            
        //     return num[0];                                
        // } 
        // else if (num[1]>num[0]&&num[1]>num[2]){                
        //     return num[1];
        // }    
        // else{
        //     return num[2];
        // }
    }
      
    public static int max3e2int(int num[]) {
        if (num[0]>num[1]) {
            return num[0];                                
        } 
        else if (num[0]<num[1]){                
            return num[1];
        }
        else{
            return num[2];
        } 
    }

    public static int Vocali(String stringa) {
        int vocali=0; char carattere;

        for (int i=0;i<stringa.length();i++){          
            
            carattere=stringa.toLowerCase().charAt(i);
            
            if (carattere=='a'||carattere=='e'||carattere=='i'||carattere=='o'||carattere=='u'){
                vocali++;
            }           
        }
        return vocali;
        
    }

    public static int[] divisibile3(int numeri[]) {
        int divisibili[]=new int [numeri.length], j=0;
        for (int i = 0; i < numeri.length; i++) {
            if (numeri[i]%3==0) {
                divisibili[j]=numeri[i];   
                j++;                         
            }            
        }
        return divisibili;        
    }

    public static void nDeficente(long numero) {
        long sum=0;
        for (long i=2;i<numero;i++) {
            if (numero%i==0){// se non dà resto
                sum=sum+(numero/i);
            }           
        }
        if (sum<numero) {
            System.out.println(numero+" è un numero deficente");               
        } else{
            System.out.println(numero+" non è un numero deficente");
        }
    }             
    
    public static int[] divisibile5(int numeri[]) {
        int divisibili[]=new int [numeri.length], j=0;
        for (int i = 0; i < numeri.length; i++) {
            if (numeri[i]%5==0) {
                divisibili[j]=numeri[i];   
                j++;                         
            }            
        }
        return divisibili;        
    }

    public static double[] calcolaReddito(double redditoannuo[]) {
        double daversare[]=new double[redditoannuo.length];
        for (int i = 0; i < redditoannuo.length; i++) {
            if (redditoannuo[i]<15001) {
                daversare[i]=((redditoannuo[i]/100)*23); 
            }
            else if (redditoannuo[i]>15000&&redditoannuo[i]<28001) {
                daversare[i]=((redditoannuo[i]/100)*25); 
            }
            else if (redditoannuo[i]>28000&&redditoannuo[i]<50001) {
                daversare[i]=((redditoannuo[i]/100)*35); 
            }
            else if (redditoannuo[i]>50000) {
                daversare[i]=((redditoannuo[i]/100)*43); 
            }
        }
        return daversare;
        
    }
   
    public static int[] arraySortInt(int matrice[], String sortorder) {
        int temp=0;
        if (sortorder=="dis") {//discendente
            for (int i = 0; i < matrice.length; i++) {
                for (int j = 0; j < matrice.length; j++) {
                  if (matrice[i]>matrice[j]) {
                    temp=matrice[i];
                    matrice[i]=matrice[j];
                    matrice[j]=temp;
                    }  
                }
            }  
        }
        else { // ascendente
            for (int i = 0; i < matrice.length; i++) {
                for (int j = 0; j < matrice.length; j++) {
                  if (matrice[i]<matrice[j]) {
                    temp=matrice[i];
                    matrice[i]=matrice[j];
                    matrice[j]=temp;
                    }  
                }
            }  
        }        
        return matrice;     
    }

    public static long[] arraySortLong(long matrice[], String sortorder) {
        long temp=0;
        if (sortorder=="dis") {//discendente
            for (int i = 0; i < matrice.length; i++) {
                for (int j = 0; j < matrice.length; j++) {
                  if (matrice[i]>matrice[j]) {
                    temp=matrice[i];
                    matrice[i]=matrice[j];
                    matrice[j]=temp;
                    }  
                }
            }  
        }
        else { // ascendente
            for (int i = 0; i < matrice.length; i++) {
                for (int j = 0; j < matrice.length; j++) {
                  if (matrice[i]<matrice[j]) {
                    temp=matrice[i];
                    matrice[i]=matrice[j];
                    matrice[j]=temp;
                    }  
                }
            }  
        }        
        return matrice;     
    }

    public static void arrayOutputVert(int matrice[]) {
        System.out.println("------");
        for (int i = 0; i < matrice.length; i++) {
            System.out.println(matrice[i]);
        }
        System.out.println();      
    }

    public static void arrayOutputHorizInt(int matrice[]) {
        System.out.println("--------------------");
        for (int i = 0; i < matrice.length; i++) {
            System.out.print(matrice[i]+" ");
        }      
        System.out.println();   
    }

    public static void arrayOutputHorizLong(long matrice[]) {
        System.out.println("--------------------");
        for (int i = 0; i < matrice.length; i++) {
            System.out.print(matrice[i]+" ");
        }      
        System.out.println();   
    }

    public static int[] arrIntIns(int matrice []) {
        for (int i = 0; i < matrice.length; i++) {            
            matrice[i]=mylib.readInt("inserisci il "+(i+1)+"° numero: "); 
        }
        return matrice;     
    }

    public static long[] arrLongIns(long matrice []) {
        for (int i = 0; i < matrice.length; i++) {            
            matrice[i]=mylib.readLong("inserisci il "+(i+1)+"° numero "); 
        }
        return matrice;     
    }

    public static double[] arrDoubleIns(double matrice []) {
        for (int i = 0; i < matrice.length; i++) {            
            matrice[i]=mylib.readDouble("inserisci il "+(i+1)+"° numero "); 
        }
        return matrice;     
    }

    public static String[] arrStringIns(String matrice[], String messaggio) {
        for (int i = 0; i < matrice.length; i++) {            
            matrice[i]=mylib.readString(messaggio); 
        }
        return matrice;
    }
   
    public static int arrVerValDoppio(int matrice[]) {
        int sort=0, count=0;
        // leggo l'array per verificare quanti valori doppi ci sono..
        for (int i=0;i<matrice.length;i++) {
            sort++;
            for (int j=sort;j<matrice.length;j++) {
                if( (matrice[i]==matrice[j])&&(matrice[i]!=0)){
                    matrice[j]=0000;
                    count++;
                }
            }
        }
        return count;
    }

    public static int[] arrSelCompatta(int matrice[], int matricelength) {
        int finalarray[]=new int[matricelength],z=0;
        for (int k = 0; k < matrice.length; k++) {
            if (matrice[k]!=0000) {
                finalarray[z]=matrice[k]; 
                z++;                 
            }
        }
        return finalarray;
    }

    public static int[] arrCompatta(int matrice[],int valdup) {        
            // sostituisco i valori duplicati con 0000 (così che anche il numero 0 sia utilizzabile)
            int comp[]=arrSelCompatta(matrice, (matrice.length-valdup));            
            return comp; 
    }



}// fine Classe