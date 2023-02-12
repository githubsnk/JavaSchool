package SviluppoJava;

public class Funzionario extends Impiegato {

    private String progetto;

    // costruttori
    public Funzionario(){
     
    }
    public Funzionario(String nome, double salario, String matricola, int anniDiServizio, String progetto){
        super(nome, salario, matricola, anniDiServizio);         
        this.progetto=progetto;
    }


    // metodi
    public void setProgetto(String progetto) {
        this.progetto = progetto;
    }

    public String getProgetto() {
        return progetto;
    }

    public String toString(){
        return super.toString()+" progetto: "+progetto;
    }

    public String menu(){
        String s="--------------------------\n"+
        "        M e n ù         \n"+
        "1 - Inserisci funzionario \n"+ 
        "2 - Stampa                \n"+
        // "3 - Stampa                \n"+
        // "4 -                       \n"+
        // "5 -                       \n"+
        //  "6 -  \n"+
        //  "7 -  \n"+
        // "8 -  \n"+
        //  "0 -  \n"+
        "--------------------------\n"+
        "Inserisci la scelta";
        return s;
    }
    
}
