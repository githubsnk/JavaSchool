import java.util.ArrayList;

public class AziendaSanitaria {
    //inizializzazione
    private ArrayList <Paziente> p;
    private ArrayList <Medico> m;

    //costruttore vuoto
    public AziendaSanitaria() {
        this.p = new ArrayList<Paziente>();
        this.m = new ArrayList<Medico>();        
    }

    //costruttore main
    public AziendaSanitaria(ArrayList <Paziente> p, ArrayList<Medico> m) {
        this.p = p;
        this.m = m;
    }
    
    //aggiunge il nuovo paziente ed il relativo emdico
    public void aggPaziente(Paziente pa, Medico me) throws Exception { 
        verificaDoppi(pa);
        pa.setRifmedico(me);               
        p.add(pa);
        aggMedico(me);                        
}
    
    //aggiunge un nuovo medico
    public void aggMedico(Medico me) throws Exception {        
        if (!m.contains(me)) {// verifica se esiste già 
            m.add(me);                       
        } else{
            throw new Exception("Medico già presente");
        }

    }  

    //Verifica se il paziente esiste già
    private void verificaDoppi(Paziente pa) throws Exception {  
        for (Paziente paziente : p) {
            if (paziente.getTessera()==pa.getTessera()) {
                throw new Exception("Paziente già presente");                
            }             
        }        
    }

    //restituisce il riferimento al medico curante
    public Medico trovaMedico(String nome)throws Exception {   
        Medico me=new Medico();  
        int j=0;

        for (Medico medico : m) {
            if (medico.getNome()==nome) {
                me=medico;
                j=1;
                }
        }        
        if (j==0) {
            throw new Exception("medico non trovato");
        }
        return me;   
    }

    //trova rif paziente da nome
    public Paziente trovaPaziente(int numtessera)throws Exception {  
    Paziente pa = new Paziente();   
    int j=0; 
        for (Paziente paz : p) {
            if ((paz.getTessera())==numtessera) {
                pa=paz;
                j=1;
                }   
        }
        if (j==0) {
            throw new Exception("Paziente non trovato");
        }
        return pa; 
    }    

    //Restituisce un arraylist con tutti i pazienti del medico passato nel parametro    
    public ArrayList <Paziente> listaMedico (Medico me) throws Exception {
        ArrayList <Paziente> newp= new ArrayList<Paziente>(); 
        int j=0;   
        for (Paziente paziente : newp) {
            if ((paziente.getRifmedico()).equals(me) ) {
                newp.add(paziente);            
                j=1;
            }     
        }
        if (j==0) {
            throw new Exception("lista non esistente, questo medico non ha pazienti");
        }
        return newp;
    }

    // restituisce il numero di pazienti per medico fornito
    private int pazientiMedico(Medico me) throws Exception {
        int npaz=0;

        for (Paziente paz : p) {
            if (me==paz.getRifmedico()) {
                npaz++;
            }    
        }
        if (npaz==0) {
            throw new Exception("questo medico non ha pazienti");
        }
        return npaz;
    }

    // restituisce un riferimento al medico avente il maggior numero di pazienti
    public Medico statMedico() throws Exception {
        Medico med = new Medico();         
        int npaz=0;
        for (Medico medico : m) {
            if (npaz<pazientiMedico(medico)) {//restituisce il n° di pazienti di un medico
                npaz=pazientiMedico(medico);
                med=medico;
            }
        }         
        if (npaz==0) {
            throw new Exception("non ci sono medici..");
        }
        return med;
    }

    //stampa menù
    public static String menu() {
    String s=
    "--------------------------\n"+
    "    M   e   n   ù\n"+
    "1 - aggiungi paziente\n"+ 
    "2 - aggiungi medico \n"+ 
    "3 - lista medico \n"+    
    "4 - stat medico \n"+ 
    "5 - stampa \n"+       
    "--------------------------\n"+
    "Inserisci la scelta: ";
    return s;
    }

    @Override
    public String toString() {
        return "AziendaSanitaria [p=" + p + ", m=" + m + "]";
    }
       
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        AziendaSanitaria other = (AziendaSanitaria) obj;
        if (p == null) {
            if (other.p != null)
                return false;
        } else if (!p.equals(other.p))
            return false;
        if (m == null) {
            if (other.m != null)
                return false;
        } else if (!m.equals(other.m))
            return false;               
        return true;
    }
}
