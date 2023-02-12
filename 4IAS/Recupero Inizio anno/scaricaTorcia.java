import java.util.*;
public class scaricaTorcia {
    public static void main(String[] args) {
        // attributi
    boolean accendi;
    int batteria;

    Torcia t= new Torcia(), t2=new Torcia(); Scanner read= new Scanner(System.in);
    
    // ricarico 1° torcia
    System.out.println("da 0 a 10 quanto vuoi ricaricare la batteria della 1° torcia?");               
    System.out.println(t.caricaBatteria(read.nextInt()));
    t.setAccendi(true); // accendo

    // ricarico 2° torcia
    System.out.println("da 0 a 10 quanto vuoi ricaricare la batteria della 2° torcia?");               
    System.out.println(t2.caricaBatteria(read.nextInt()));
    t2.setAccendi(true); // accendo

    // scarica 1° torcia
    // while (t.getBatteria()>0){
    //     System.out.println("Torcia 1 "+t.scaricaBatteria());
    // }
    t.scaricaBatteria();
    
    System.out.println("-------------------------------");

    // scarica 2° torcia
    // while (t2.getBatteria()>0){
    //     System.out.println("Torcia 2 "+t2.scaricaBatteria());
    // } 
    t2.scaricaBatteria();
    

    }
    
}
