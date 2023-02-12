/*
Scrivere un programma che indica se un numero intero dato è deficente [ovvero strettamente maggiore della somma dei suoi 
divisori propri (includendo 1 ma eslcudendo il numero stesso)].
esempio: 14 è deficente perchè ha come divisori 1,2,7 la cui somma è 10< 14;
12 non è deficente perchè 1+2+3+4+6 non è <12.
Utilizzare almeno un sottoprogramma.
*/

public class NumeroDeficente {
    public static void main(String[] args) {        
        mylib.nDeficente(mylib.readLong("inserisci il numero da verificare: "));  
    }    
}
