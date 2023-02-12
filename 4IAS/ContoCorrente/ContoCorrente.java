import javax.swing.plaf.synth.Region;

public class ContoCorrente {

private String owner;
private double saldo;
private int codiceconto;
private double fido;

    //#region COSTRUTTORI

        //Costruttore vuoto
    public ContoCorrente(){
    }

        //costruttore con saldo
    public ContoCorrente(String owner, double saldo, int codiceconto, double fido) {
    this.owner = owner;
    this.saldo = 0;
    this.codiceconto = codiceconto;
    this.fido = 150;
    }

        //costruttore senza saldo
    public ContoCorrente(String owner,  int codiceconto, double fido) {
        this.owner = owner;
        this.saldo = 0;
        this.codiceconto = codiceconto;
        this.fido = fido;
    }

        //Costruttore con solo nome correntista
    public ContoCorrente(String owner) {
        this.owner = owner;
        this.saldo = 0;
        this.codiceconto = 0;
        this.fido = 0;
    }

        //Copy constructor
    public ContoCorrente(ContoCorrente cc2){
        cc2.owner=getOwner();
        cc2.saldo=this.getSaldo();
        cc2.codiceconto=this.getCodiceconto();
        cc2.fido=this.getFido();
    }

    //#endregion

    //#region METODI SETTER E GETTER

    public String getOwner() {
    return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getCodiceconto() {
        return codiceconto;
    }

    public void setCodiceconto(int codiceconto) {
        this.codiceconto = codiceconto;
    }

    public double getFido() {
        return fido;
    }

    public void setFido(double fido) {    
        this.fido = fido;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double importo) {
        this.saldo=importo;
    }
    //#endregion

    //#region METODI DI CLASSE

    public void preleva(double amount) throws Exception {
        double saldotemp=getSaldo()+getFido()+1;
        boolean condition=true;
        do {
            if (saldotemp>amount) {
                saldo=saldo-amount;  
                condition=false;              
            } else {
                //MyException e= new MyException(getSaldo(), "fondi insufficienti");
                Exception e= new Exception("fondi insufficienti: Saldo "+getSaldo()+" Fido: "+getFido());
                throw e;                
            }            
        } while (condition);
    }

    public void deposita(double amount)throws Exception {        
        if (amount>0) {
            setSaldo(saldo+amount);
        } else {
            throw new Exception("inserire un valore > di 0");          
        }
    }

    // restituisce la copia di una classe
    public ContoCorrente copyCC() {
        ContoCorrente cc2= new ContoCorrente();
        cc2.owner=this.owner;
        cc2.saldo=this.saldo;
        cc2.codiceconto=this.codiceconto;
        cc2.fido=this.fido;
        return cc2;        
    }
    //#endregion

    //#region METODI STATICI

    /**
     * @param ccmittente ContoCorrente Mittente
     * @param ccdestinatario ContoCorrente Destinatario
     * @param importo importo transazione
     * @return esito transazione
     * @throws Exception
     */
    public static void trasferisci(ContoCorrente ccmittente, ContoCorrente ccdestinatario, double importo) throws Exception  {        
        ccmittente.preleva(importo);
        ccdestinatario.deposita(importo);      
    }

    public static boolean deposita(ContoCorrente ccdestinatario, double importo) {        
        boolean successo=false;
        if (importo>0) {
            ccdestinatario.setSaldo(ccdestinatario.getSaldo()+importo);
            successo=true;
            return successo;
        } else {
            return successo=false;
        }        
    }

    public static String menu() {
        String s="--------------------------\n"+
        " M e n ù \n"+
        "1 - Crea Conto 1 \n"+ 
        "2 - Crea Conto 2 \n"+
        "3 - Deposita \n"+
        "4 - Preleva \n"+
        "5 - Trasferimento \n"+
        "6 - Confronta CC (%) \n"+
        "7 - Copia Istanza CC \n"+
        "8 - Nuova Istanza CC \n"+
        "9 - Stato CC \n"+
        "10 -Stampa Menù \n"+
        "0 - Uscita \n"+
        "--------------------------\n"+
        "Inserisci la scelta: ";
        return s;
    }
    //#endregion

    //#region OVERRIDE DI METODI OBJECT

public boolean equals(ContoCorrente cc) {
    boolean successo;
    if (owner==cc.owner&&saldo==cc.saldo&&codiceconto==cc.codiceconto&&fido==cc.fido) {
        return successo=true;
    } else {
        return successo=false;
    }    
}

public String toString() {
    return "Proprieterio: "+owner+", saldo: "+saldo+", codice conto: "+codiceconto+", fido: "+fido ;
}
//#endregion
}