package SviluppoJava;

public class Quadrato {
    private double length;
    private Punto p;

    //calcolare gli altri 4 punti partendo dal punto principale

    // costruttore vuoto
    public Quadrato(){    
        p=new Punto();
        length=0;
    }

    // costruttore 
    public Quadrato(double length,Punto p){
        this.length=length;
        this.p=p;
    }

    public Quadrato(Quadrato q){
        q.length=this.length;
        q.p=this.p;
    }

    public void trasla(double x, double y) {
        p.trasla(x,y);
    }
    public void setLength(double l){
        this.length=l;
    }

    public double getLength(){
       return length;
    }

    public void setLength(Punto p){
        this.p=p;
    }

    
}
