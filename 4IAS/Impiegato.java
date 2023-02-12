package SviluppoJava;

public class Impiegato {

    private String nome;
    private int anniDiServizio;
    private double salario;
    private String matricola;


    // costruttori

    public Impiegato(){
        nome = "";
        salario = 0;
        matricola = "";
        anniDiServizio = 0;
    }   
     
    public Impiegato (String n, double s, String m, int ads) {
        nome = n;
        salario = s;
        matricola = m;
        anniDiServizio = ads;
    }


    //metodi Get e set

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public int getAnniDiServizio() {
        return anniDiServizio;
    }

    public String getMatricola() {
        return matricola;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setAnniDiServizio(int anniDiServizio) {
        this.anniDiServizio = anniDiServizio;
    }

    public void setMatricola(String matricola) {
        this.matricola = matricola;
    }

    //metodi

    public void incrementaSalario(double percentuale) {
    salario = salario *(1 + percentuale / 100);
    }
    
    public String toString() {
    return (nome + " " + salario + " " + matricola+ " " + anniDiServizio);
    }   

    public String menu(){
        String s="------------------------------------\n"+
        "        M e n ù         \n"+
        "1 - Inserisci impiegato \n"+ 
        "2 - Inserisci manager+Segretaria  \n"+
        "3 - Stampa              \n"+
        "4 - Incrementa salario imp\n"+
        "5 - Incrementa salario manager\n"+
        "6 - Incrementa salario segretaria\n"+
        // "7 -  \n"+
        // "8 -  \n"+
        // "0 -  \n"+
        "------------------------------------\n"+
        "Inserisci la scelta";
        return s;
    }
}
