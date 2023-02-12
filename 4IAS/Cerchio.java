package SviluppoJava;
import java.math.*;
public class Cerchio {
    // il raggio nel set va controllato che sia sempre positivo
    
    private double raggio;
    private Punto centro;

    // costruttore senza paramatri
    public Cerchio() {
        setRaggio(0);
        setCentro(new Punto());
    }

    //costruttore con raggio e centro
    public Cerchio(double raggio, Punto centro) {
        this.raggio = raggio;
        this.centro = centro;
    }
    //costruttore con perimetro e centro
    public Cerchio(Punto c,double p) {
        setCentro(c);
        setRaggio(calcolaRaggio(p));
    }

    //copy constructor
    public Cerchio(Cerchio c){
        c.centro=getCentro();
        c.raggio=getRaggio();
    }

    public double calcolaRaggio(double perimetro) {
        this.setRaggio(perimetro/(2*Math.PI));
        return getRaggio();
    }


    public void setRaggio(double r){ // controllo che il valore immesso sia >=0 altrimentti calcolo il reciproco
        if (raggio>-1) {
            raggio=r;
        } else if(raggio<-1) {
            raggio=r*(-1);
        }
        
    }

    public double getRaggio() {
        return raggio;
    }

    public void setCentro(Punto c){
        centro=c;
    }

    public Punto getCentro(){
        return centro;
    }

    public boolean equals(Cerchio ce) {
        if (this.getRaggio()==getRaggio()&&this.getCentro()==getCentro()) {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        return "punto centro: "+this.centro+" raggio: "+this.raggio;
    }

    public boolean isInside(double punto) {
        
        if (punto<(centro.distanza(this.getCentro()))) {
            return true;
        } else {
            return false;
            
        }
    }


}
