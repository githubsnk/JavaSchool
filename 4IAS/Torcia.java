package SviluppoJava;
public class Torcia {
    // attributi
    private boolean accendi;
    private int batteria;

    //costruttori
    public Torcia (){}

    // copy constructor
    public Torcia(Torcia t){
        t.setAccendi(getAccendi());
        t.setBatteria(getBatteria());
    }
    
    public void setAccendi(boolean b) {
        if (getBatteria()>0) {
            accendi=b;
            setBatteria(getBatteria()-1);
        }
        else if(getBatteria()==0) {
            // setAccendi(false);
            System.out.println("ricarica batteria");            
        }  
        
    }

    public boolean getAccendi() {

        return accendi;
    }

    public void setBatteria(int n){  
       
        batteria=n;

        
    }

    public int getBatteria(){
        return batteria;
    }

    // metodo copy
    public Torcia Copy(Torcia t){
        Torcia t2= new Torcia();
        t2.setAccendi(getAccendi());
        t2.setBatteria(getBatteria());
        return t;
    }

    public  String toString(){
        return "Accensione: "+getAccendi()+" - Batteria: "+getBatteria();
    }

    public boolean equals(Torcia t){
       if (t.getAccendi()==getAccendi()&&t.getBatteria()==getBatteria()) {
        return true;
       } else{
        return false;
       }   
    }

    public String caricaBatteria(int n){
        if ((batteria+n)>-1&&(batteria+n)<11){
            batteria=batteria+n;  
            return "ricarica avvenuta";         
        }    
        else{
            return "valore non ammesso, riprova..";            
        }    
    }

    public String scaricaBatteria(){
        if (this.getBatteria()>0) {
            while (this.getBatteria()>0) {            
                this.setBatteria(this.getBatteria()-1); 
                return "batteria rimanente "+(getBatteria()+1); 
            }   
            setAccendi(false);
        }         
        return "";
    }

       

    

    
}
