package SviluppoJava;

public class Segretaria extends Impiegato {    
    private int telefono;

    //costruttori

    public Segretaria(){
        
    }
     
    public Segretaria(String nome, double salario, String matricola, int anniDiServizio, int telefono){
        super(nome, salario, matricola, anniDiServizio);
            this.telefono=telefono;
    }
    
    // metodi
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getTelefono() {
        return telefono;
    }
    
    public String toString(){
        return super.toString()+" numero telefono: "+telefono;
    }

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        return super.equals(obj);
    }

   

}
    
    

