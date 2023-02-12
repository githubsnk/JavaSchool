public abstract class Risorse {
    private double fdc;
    private String um;  
    private double consumomese;
    // ricordare che una classe astratta non può essere inizializzata nel main

    // costruttore per sottoclasse
    public Risorse(double fdc, String um, double consumomese){ 
        this.fdc=fdc;
        this.um=um;
    }   

    public double calcolaIE(){//N.A.
        return consumomese*fdc;
    }

    public abstract String chiediConsumo();  
    
    public void setConsumomese(double consumomese) {
        this.consumomese = consumomese;
    }    
}
