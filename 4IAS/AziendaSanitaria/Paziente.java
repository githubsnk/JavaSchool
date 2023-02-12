public class Paziente extends Persone {
    private int tessera;
    private Medico rifmedico;

    // costruttore vuoto
    public Paziente(){
        super();
        this.tessera=0;
        this.rifmedico= new Medico();        
    }

    // costruttore main
    public Paziente(String name, int numtessera){
        super(name);
        this.tessera=numtessera;
        this.rifmedico= new Medico();        
    }

    // Metodi
    public int getTessera() {
        return tessera;
    }
    
    public void setTessera(int tessera) {
        this.tessera = tessera;
    }
    
    public Medico getRifmedico() {
        return rifmedico;
    }
    
    public void setRifmedico(Medico rifmedico) {
        this.rifmedico = rifmedico;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        Paziente other = (Paziente) obj;
        if (tessera != other.tessera)
            return false;
        if (rifmedico == null) {
            if (other.rifmedico != null)
                return false;
        } else if (!rifmedico.equals(other.rifmedico))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Paziente [tessera=" + tessera + ", rifmedico=" + rifmedico + "]";
    }

    

   

   
    
}
