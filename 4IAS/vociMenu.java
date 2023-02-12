package SviluppoJava;

public class vociMenu {
   
    private String voci[]=new String[10];
    private 

    public vociMenu(){
       
    }

    public vociMenu(String d1, String d2,String d3,d4,d5,d6,d7,d8,d9){
        voci[0]=d1;
        voci[1]=d2;
        voci[2]=d3;
        voci[3]=d4;
        voci[4]=d5;
        voci[5]=d6;
        voci[6]=d7;
        voci[7]=d8;
        voci[8]=d9;
        voci[9]=d10;
                
    }

    public void setScelta(int scelta) {
        this.scelta = scelta;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public int getScelta() {
        return scelta;
    }

    public String getDescrizione() {
        return descrizione;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return getScelta()+")-"+getDescrizione()+"\n";
    }
    
}
