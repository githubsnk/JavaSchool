public class Persona {
    
    private String nome;
    private Risorse[] consumipersona;        

    //costruttore
    public Persona(String nome, Risorse[] consumipersona) {
        this.nome = nome;
        this.consumipersona = consumipersona;
    }

    //metodo calcola Impronta ecologica
    public double calcolaIE() {
        double res=0;
        for (int i = 0; i < consumipersona.length; i++) {
            res +=consumipersona[i].calcolaIE();
        }
        res /=10000;
        return res;
    }     
}
