/* 
 Scrivere la somma dei numeri fattoriali da uno fino ad un numero dato.
 */

public class Sommafattoriali {
    public static void main(String[] args) {
        //ottengo qtà numeri da memorizzare per conoscere la lunghezza della variabile
        int iterazioni=mylib.readInt("di quanti numeri vuoi sommarne i fattoriali? ");

        long numeri[]=new long[iterazioni], temp=0;
        
        mylib.arrLongIns(numeri); // riempio variabile 
        temp=mylib.arraySommaFattoriale(numeri); // sommo i fattoriali dei numeri
        System.out.println("la somma dei numeri fattoriali è " + temp); //output finale 
    }
}
