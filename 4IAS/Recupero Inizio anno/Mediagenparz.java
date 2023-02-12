/*Scrivere un programma che trova la media generale di un array e scrive la media parziale di tutti i valori che superano la media generale.
Utilizzare un sottoprogramma, da codificare.
*/

public class Mediagenparz{
    public static void main(String[] args) {
        long mediaparz=0; int count=0;
        long array[]= new long[mylib.readInt("Quanti numeri vuoi inserire?: ")];  
        array=mylib.arrLongIns(array);

        long totalsum=mylib.arrSomma(array);

        long mediagen=totalsum/array.length;

        for (int i = 0; i < array.length; i++) {
            if (array[i]>mediagen) {
                mediaparz=mediaparz+array[i];
                count++;
            }
        }
       System.out.println(mediaparz/count); 
    }
}