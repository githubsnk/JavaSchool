public class Medico extends Persone {
    
    // costruttore vuoto
    public Medico() {
       super();
    }
    
    // Metodi
    public Medico(String nome) {
        super(nome);
    }
    
    @Override
    public String toString() {
            return "Medico [nome=" + getNome() + "]";
        }     
    }

