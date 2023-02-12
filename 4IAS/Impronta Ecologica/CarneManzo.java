public class CarneManzo extends Risorse {
    //costruttore vuoto
    public CarneManzo(){
        super(21428.5714, "Kg", 0);               
    }

    //costruttore per passare il consumo
    public CarneManzo(double consumomensile){
        super(21428.5714, "Kg", consumomensile);               
    }

    @Override
    public String chiediConsumo() {
        // TODO Auto-generated method stub
        return "digita kg carne manzo consumati in un mese: ";
    }
}
  
