public class MyException extends IllegalArgumentException {

    private double saldo;
    private String messaggio;
    
    //Costruttore
    MyException(double amount, String message){        
        super(message);        
        this.saldo=amount;        
    }
    
    public double getSaldo() {
        return saldo;
    }

    @Override // della classe Exception
    public String getMessage() {
        // TODO Auto-generated method stub
        return super.getMessage()+" Saldo: "+getSaldo();
    }
    
}
