public class AutomobileDaSolo extends Risorse {
    // costruttore vuoto per inizializzazione    
    public AutomobileDaSolo(){
        super(21.4286, "Km", 0); 
    }

    //costruttore per passare il consumo
    public AutomobileDaSolo(double consumomese){
        super(21.4286, "Km", consumomese); 
    }

    @Override
    public String chiediConsumo() {
        // TODO Auto-generated method stub     
        return "digita km percorsi con la propria auto in un mese: ";   
    }
}
