import SviluppoJava.Rettangolo;

class Quadrato2 extends Rettangolo{
    private double l;

    // costruttore esteso rettangolo
    public Quadrato2(double l){
        super(l,l);
    }
    // metodo esteso rettangolo
    public double perimetro(){
        return getL1()*4;
    }

    




}
