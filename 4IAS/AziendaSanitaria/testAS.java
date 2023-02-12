import java.util.ArrayList;
import java.util.Scanner;

public class testAS {
    public static void main(String[] args) {
        Scanner leggi = new Scanner(System.in);        
        AziendaSanitaria as = new AziendaSanitaria();        
        Medico m = new Medico();
        Paziente p = new Paziente();
        int scelta=0;

        do {
            System.out.println(as.menu());
            scelta=leggi.nextInt();            
            switch (scelta) {
                case 1://aggiungi paziente
                    m=new Medico("mario".toLowerCase());   
                    p=new Paziente("piero".toLowerCase(), 1);
                    try {
                        as.aggPaziente(p,m);
                    } catch (Exception e) {
                        // TODO Auto-generated catch block
                        System.out.println(e.getMessage());
                    }
                    m=new Medico("piero".toLowerCase());   
                    p=new Paziente("giusy".toLowerCase(), 12);        
                    try {
                        as.aggPaziente(p,m);
                    } catch (Exception e) {
                        // TODO Auto-generated catch block
                        System.out.println(e.getMessage());
                    }
                    m=new Medico("piero".toLowerCase());   
                    p=new Paziente("pina".toLowerCase(), 123);        
                    try {
                        as.aggPaziente(p,m);
                    } catch (Exception e) {
                        // TODO Auto-generated catch block
                        System.out.println(e.getMessage());
                    }
                    m=new Medico("piero".toLowerCase());                       
                    p=new Paziente("samantha".toLowerCase(), 1234);        
                    try {
                        as.aggPaziente(p,m);
                    } catch (Exception e) {
                        // TODO Auto-generated catch block
                        System.out.println(e.getMessage());
                    }
                    m=new Medico("marcello".toLowerCase());                       
                    p=new Paziente("miriam".toLowerCase(), 12345);        
                    try {
                        as.aggPaziente(p,m);
                    } catch (Exception e) {
                        // TODO Auto-generated catch block
                        System.out.println(e.getMessage());
                    }
                    break;

                case 2://aggiungi medico
                    m=new Medico("mario".toLowerCase());
                    try {
                        as.aggMedico(m);
                    } catch (Exception e) {
                        // TODO Auto-generated catch block
                        System.out.println(e.getMessage());
                    }   
                    m=new Medico("piero".toLowerCase()); 
                    try {
                        as.aggMedico(m);
                    } catch (Exception e) {
                        // TODO Auto-generated catch block
                        System.out.println(e.getMessage());
                    }        
                    m=new Medico("mino".toLowerCase());       
                    try {
                        as.aggMedico(m);
                    } catch (Exception e) {
                        // TODO Auto-generated catch block
                        System.out.println(e.getMessage());
                    }   
                    m=new Medico("salvo".toLowerCase());       
                    try {
                        as.aggMedico(m);
                    } catch (Exception e) {
                        // TODO Auto-generated catch block
                        System.out.println(e.getMessage());
                    }  
                    break;

                case 3://lista medico
                    //System.out.println("digita nome medico");
                    m=new Medico("mario".toLowerCase());                       
                    try {
                        m=as.trovaMedico(m.getNome());
                    } catch (Exception e) {
                        // TODO Auto-generated catch block
                        System.out.println(e.getMessage());
                    } //  trova medico e restituisce ref del medico trovato                      
                    ArrayList<Paziente> plist=new ArrayList<Paziente>();
                    try {                        
                        plist = as.listaMedico(m);
                    } catch (Exception e) {
                        // TODO Auto-generated catch block
                        System.out.println(e.getMessage());
                    }// fornisce la lista dei pazienti asseganti a quel medico  
                    for (int i = 0; i < plist.size(); i++) {                        
                        System.out.println(plist.get(i).toString());     
                    }                             
                    break;

                case 4://statMedico
                    try {
                        System.out.println("il medico con più pazienti è: "+as.statMedico().toString());
                    } catch (Exception e) {
                        // TODO Auto-generated catch block
                        System.out.println(e.getMessage());
                    }
                    break;

                case 5://stampa
                System.out.println(as.toString());
                break;
            }           
        } while (scelta!=0);
    }
}
