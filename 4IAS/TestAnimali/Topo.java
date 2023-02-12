public class Topo extends Animali {

    public Topo() {
    }

    public Topo(String nome) {
        super(nome,"SQUIT!");        
    }

    public String alertPredatore(Object animale) {
        if (animale instanceof Gatto) {
            return getNome()+": Aiuto!! "+getSuono();
        } else {            
            return saluta();
        }        
    }    
}
