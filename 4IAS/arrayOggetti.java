package SviluppoJava;
import java.util.*;
public class arrayOggetti { 
    
  public static void main(String[] args) {
    Scanner t=new Scanner(System.in);
    Punto [] punti=new Punto[20];
    int scelta=0;
    int pos=0, i=0;
    double x,y;
    do{
      System.out.println("C - Aggiunta: 1");
      System.out.println("R - Stampa: 2");
      System.out.println("U - Modifica: 3");
      System.out.println("D - Cancella: 4");
      System.out.println("Chiudi il programma: 0");
      System.out.println("Inserisci la scelta:");
      scelta=t.nextInt();
      switch(scelta){
        //caricamento
        case 1:
          System.out.println("Inserisci la X");
          x=t.nextDouble();
          System.out.println("Inserisci la Y");
          y=t.nextDouble();
          punti[pos]=new Punto(x,y);
          pos++;
          break;
        //stampa
        case 2:
          for(i=0;i<pos;i++){
            System.out.println(punti[i]);
          }
          break;
        //modifica
        case 3:
          System.out.println("Inserisci il punto da ricercare");
          System.out.println("Inserisci la X");
          x=t.nextDouble();
          System.out.println("Inserisci la Y");
          y=t.nextDouble();
          Punto p=new Punto(x,y);
          //ricerca
          i=0;
          boolean trovato=false;
          while (!trovato && i<pos){
            if (punti[i].equals(p)){
              trovato=true;
            }
            else
              i++;        
          }
          //esito ricerca
          if(trovato){
            //modifica
            System.out.println("Inserisci la X");
            x=t.nextDouble();
            System.out.println("Inserisci la Y");
            y=t.nextDouble();
            punti[i].setX(x);
            punti[i].setY(y);
          }
          else {
            System.out.println("elemento non trovato");
          }
          break;
          
           
      }
    }while (scelta!=0);

    
  }
}

