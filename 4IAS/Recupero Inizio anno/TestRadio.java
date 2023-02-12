import java.util.Scanner;

public class TestRadio {
    public static void main(String[] args) {
        int scelta;
        Scanner leggi=new Scanner(System.in);
        Radio r = new Radio(5,62), r2=null;

        r.menu();

        do {  
            scelta=leggi.nextInt();
            // oggetto,scelta,
            switch (scelta) {
                case 1: r.accendi();                    
                    System.out.println("Power On");
                    break;
                case 2:  
                    System.out.print("Volume radio: ");                
                    r.changeVol(leggi.nextInt()); 
                    
                    break;  
                case 3:              
                    System.out.print("Canale: ");   
                    r.setCh(leggi.nextFloat());
                    System.out.println("Canale impostato");
                    break;  
                case 4:
                    if (r2==null) {
                        System.out.println("creare prima un istanza radio");
                    } else {
                        System.out.println("Confronto: "); 
                        System.out.println(r.equals(r2));
                    }            
                    break;
                case 5:
                    r.spegni();      
                    System.out.println("Power Off..");
                    break;              
                case 6:
                    System.out.println(r.toString());
                    break;
                case 7:
                    r2=r.copyRadio();                    
                    System.out.println("istanza Copia radio creata");
                    break;
                case 8:
                    r2=new Radio();
                    System.out.println("istanza nuova radio creata");
                    break;
                case 0: 
                    System.out.print("exit");
                    System.exit(0);                    
                case -1://stampa menu
                    r.menu();              
                    break;
                
            }         
            System.out.println("--------------------------------------------------------");            
       } while (scelta!=0);   
         
        
    }
}
