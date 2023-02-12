/*Leggo 10 interi e li memorizzo in un vettore; lo compatto eliminando i doppioni [consecutivi / tutti];
  visualizzo il vettore prima e dopo la compattazione.*/

 //**per inserimento forzato commentare le righe 9-12 e decommentare le righe 13-14**
public class CompattaInteri {
    public static void main(String[] args) {  

        //in input ricevo la qtà di numeri che verrà digitata
        int array[]= new int[mylib.readInt("Quanti numeri vuoi inserire?: ")];          

        // la prima funzione riempie l'array mentre la seconda restutuisce il numero di valori duplicati al suo interno
        int valdup=mylib.arrVerValDoppio(mylib.arrIntIns(array));
        //int array[]={6,7,4,9,8,1,15,6,8,9};
        //int valdup=mylib.arrVerValDoppio(array);        
        
        // se all'interno dell'array sono contenuti valori duplicati:
        if (valdup>0) {
            //ordino il nuovo array in ordine ascendente
            mylib.arraySort(array, "asc");
            // compatto e mostro in output l'array compattato           
            mylib.arrayOutputHorizInt((mylib.arrCompatta(array, valdup)));
        }
        // altrimenti se all'interno dell'array non ci sono valori duplicati 
        else{ 
             //ordino l'array in ordine ascendente e lo mostro in output
             mylib.arrayOutputHorizInt((mylib.arraySort(array, "asc")));
        }        
    }
}
