package JavaSchool;
public class StringheUtili {
    private int ju; // Variabile visibile solo in questa classe
        public int yz; // Variabile visibile da ogni classe
        protected int kk; // variabile visibile solo dal package
        // il package è il contenitore delle classi e quindi è visibile anche da tutte le sue sottoclassi.
        
        public static void main(String args[])
    {
        //Commento Linea singola

        /*
        Commento
        Linee
        Multiple
        */
      
        //Gestione Variabili e DataType      
                     
        int e, f, g; // dichiaro più variabili su una riga 
        int h=1, i=2, j=3; // inizializzo più variabili sulla stessa riga

        int a = 5; //Integer
        double b = 5.5; //Double Precision Number
        char c = 'c'; //Characters
        boolean d = true; // Boolean
        String nome = new String("la mia stringa");
        String nome2 = "Ciao";
        System.out.println(nome + " " + nome2); 

        // Gestione Output
        System.out.print("Il mio Testo 1 "); //Lascia il cursore immediatamente dopo l'ultimo valore scritto.
        System.out.println("Il mio Testo 2"); //Porta il cursore su una nuova riga
        System.out.println("Il mio Testo 3");

        // Calcoli Matematici
        System.out.println(h+i);
        /*
        Somma= a+b
        Sottrazione= a-b
        Dividere= a/b
        Resto della divisione= a%b
        aumentare di 1= a++
        Diminuire di 1= a--
        */

      

        // Array (Collezione di elementi dello stesso DataType)
        //il primo elemento di un array è sempre lo "0"
        int[] nomearray; // dichiaro l'array nomearray utilizzando int come DataType, in questo caso lo faccio senza dichiarare il numero di elementi
        nomearray = new int [5];// qui dichiaro anche il numero di elementi ovvero 5
        /* alternativa per dichiarare gli elementi
        int[] nomearray = {a, b, c}
        */
        // è anche possibile modificare un elemento in un array
        int zz =6;
        nomearray[0]=a;

        //Dichiarazione If 
        if (nomearray[1] == nomearray[2]){
            //Fai qualcosa
        }
        else if (nomearray[3]==nomearray[4]){
            //Fai qualcos'altro
        }
        else{
            // fai altro
        }
          
          //Comparazione
          if (nomearray[1]==nomearray[2]){ // comparazione fra numeri
          }
          else if (nome.equals(nome2)){ //comparazione fra stringhe
              // fai qualcosa
          }
  
        //video fermo al 4:10
        //https://www.youtube.com/watch?v=rmGhpb8UWd8

    }
}
