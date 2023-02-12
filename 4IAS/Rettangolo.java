public class Rettangolo {
    private double l1,l2;

    // costruttori
    Rettangolo(){// parametri i due lati
        setL1(0);;
        setL2(0);;
    }

    Rettangolo(double a, double b){// parametri i due lati
        setL1(a);
        setL2(b);
    }

    //metodi
    public double perimetro(){
        return this.l1*2+this.l2*2;
    }        
        
    public double area(){
        return l1*l2;
    }

    public void setL1(double l1) {
        this.l1 = l1;
    }
    public void setL2(double l2) {
        this.l2 = l2;
    }

    public double getL1() {
        return l1;
    }

    public double getL2() {
        return l2;
    }

    @Override
    public String toString() {
        return"l1: "+l1+" - l2: "+l2;
    }

    
}
