import java.util.Objects;

public class Animali {
    private String nomeProprio, suono;

    //costruttori
    public Animali() {
    }

    public Animali(String nome, String suono) {
        this.nomeProprio = nome;
        this.suono =suono ;
    }

    //Metodi get e set
    public String getNome() {
        return this.nomeProprio;
    }

    public void setNome(String nome) {
        this.nomeProprio = nome;
    }

    public String getSuono() {
        return this.suono;
    }

    public void setSuono(String suono) {
        this.suono = suono;
    }

    

    //metodi ereditati da object
    @Override// 
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Animali)) {
            return false;
        }
        Animali animali = (Animali) o;
        return Objects.equals(nomeProprio, animali.nomeProprio) && Objects.equals(suono, animali.suono);
    }

    @Override
    public String toString() {
        return "{" +
            " nome='" + getNome() + "'" +
            ", suono='" + getSuono() + "'" +
            "}";
    }

    //metodi
    public String menu(){// menù console
        String s="------------------------------------\n"+
        "        M e n ù         \n"+
        "1 - Inserisci Animale\n"+         
        "2 - Presentati\n"+
        "3 - Stampa\n"+ 
        "------------------------------------\n"+
        "Inserisci la scelta";
        return s;
    }

    public String alertPredatore(Object o){// inserire come metodo senza parametri
        return "";
    }

    public abstract String saluta() {
        return "ciao sono "+ getNome() +" "+getSuono();        
    }
}
