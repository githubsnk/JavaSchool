public class Radio {
    private boolean isOn;
    private int vol;
    private float ch;

    public Radio() {}
    public Radio(int v, float c) {
        this.vol=vol+v;
        this.ch=c;
        this.isOn=false;
    }

    public Radio(int v, float c, boolean a) {
        this.vol=vol+v;
        this.ch=c;
        this.isOn=a;
    }

    public void accendi() {
        this.isOn=true;
    }

    public void spegni() {
        this.isOn=false;
    }

    public int changeVol(int v) {
        int tempvol=vol+v;
        if (tempvol<100) {
            this.vol=tempvol;
            System.out.println("Volume impostato");
        }
       
        else{
            System.out.println("numero massimo consentito 100");
            System.out.println("Volume non impostato");
        }
        
        return vol;
    }

    public void setCh(float c) {
        this.ch=c;
    }

    public Radio copyRadio() {
        Radio r2=new Radio(vol,ch,isOn);
        // r2.isOn=this.isOn;
        // r2.vol=this.vol;
        // r2.ch=this.ch;
        return r2;
    }

    public void menu() {
                System.out.println("--------------------------------");
                System.out.println("1 - accendi radio");
                System.out.println("2 - volume radio");
                System.out.println("3 - frequenza canale");
                System.out.println("4 - confronta radio");
                System.out.println("5 - spegni radio");
                System.out.println("6 - visualizza stato della radio");
                System.out.println("7 - crea istanza radio identica"); 
                System.out.println("8 - crea istanza radio nuova");
                System.out.println("0 - termina");
                System.out.println("--------------------------------");        
    }

    public String toString() {
        return "Accensione: "+isOn+" - Volume: "+vol+" - Canale "+ch;
    }

    public boolean equals(Radio r) {
        if (
            this.isOn==r.isOn
            &&this.vol==r.vol
            &&this.ch==r.ch
        ) 
        { 
            return true;            
        } else {
            return false;
        }      
        
    }



}
