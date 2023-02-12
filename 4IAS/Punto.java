package SviluppoJava;


class Punto {

    private double x;
    private double y;


    // costruttore
    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // costruttore vuoto
    public Punto() {
        this.x = 0;
        this.y = 0;
    }

    // copy constructor
    public  Punto(Punto p){       
        this.x=p.getX();
        this.y=p.getY();        
    }
    
    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }
    
    public double getY() {
        return y;
    }
    public void setY(double y) {
        this.y = y;
    }

    public double distanza(Punto p) { // calcola distanza fra i due punti
        return Math.sqrt(Math.pow(this.x-p.x, 2)+Math.pow(this.y-p.y,2));        
    }

    public void trasla(double x, double y) { // trasla punto 
        this.x=this.x+x;
        this.y=this.y+y;
    }

    public Punto traslaInNuovoPunto(double x, double y) { // trasla e crea nuovo punto
        return new Punto(this.x+x,this.y+y);        
    }

    public boolean equals(Punto p) {// confronto oggetto Punto
        if (this.x==p.x&&this.y==p.y) {
            return true;
        } else{
            return false; 
        }
    }

    public String toString() { // output attributi
        return "Coordinate punto: "+this.x+","+this.y;
    }

    //public Punto creaNuovoPunto(double x, double y) { // trasla e crea nuovo punto
    //    return new Punto(this.x+x,this.y+y);        
    //}


}