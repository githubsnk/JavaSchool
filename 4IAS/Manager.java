package  SviluppoJava;

public class Manager extends Impiegato{
    //private Segretaria sgr ; // per semplicità – si dovrebbe aggregare...
    Segretaria sgr= new Segretaria();

    public Manager() {
       
    }

    public Manager(String n, double s, String m, int ads, Segretaria seg) {
        super(n, s, m, ads);
        sgr=seg;      
    }   
    

    public void incrementaSalario(double percentuale) { // metodo arricchito
        // M: Aggiunge alla percentuale lo 0.5% per ogni anno di servizio
        double bonus = 0.5 * getAnniDiServizio();
        super.incrementaSalario(percentuale + bonus); // notare la keyword super, per forzare
        // l’invocazione del metodo definito nella superclasse
    }
    
    public String toString() {        
        return super.toString()+" segretaria: "+sgr.getNome();     
    }
    
}