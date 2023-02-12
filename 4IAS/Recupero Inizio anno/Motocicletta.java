/**
 * Classe Motocicletta creata a scopo didattico per la prima lezione su OOP..
 * ricordarsi che gli attributi devono essere sempre privati così da non permettere la modifica senza l'ausilio delle funzioni setter e getter che 
 * vanno create entrambe per ogni attributo dell'oggetto.
 */
 class Motocicletta {

 //attibuti dell'oggetto
 private boolean motore;
 private boolean impenna;
 private float livelloSerbatoio;
 private float capacitàSerb;

 //costruttori dell'oggetto
 public Motocicletta(){ //1° Costruttore
  this.motore=true;
  this.impenna=false;
  this.capacitàSerb=50;
  this.livelloSerbatoio=0;
}

public Motocicletta(boolean motore, boolean impenna,float livelloSerbatoio, float capacitàSerb){ //1° Costruttore
  this.motore=true;
  this.impenna=false;
  this.capacitàSerb=50;
  this.livelloSerbatoio=0;
}



 //metodi dell'oggetto
 public void accendi(){
  motore=true;
 }

 public void spegni(){
  motore=false;
 }

 public void impenna(){
  if (impenna) {
    System.out.println("La moto è già in impennata");
  }
  else{
    impenna=true;
  }
 }


 //metodi accesso per gli attributi


  // metodo set per assegnazione di un valore all'attributo motore
  public void setMotore(Boolean m){
    motore=m;
 }
 // metodo get per query su attributo motore
 public boolean getMotore(){
    return motore;
 }

 public void setImpenna(boolean x) {
  impenna=x; 
}
 public boolean getimpenna(){
  return impenna;
 }

 public float getlivelloSerbatoio(){
  return livelloSerbatoio;
 }

 public void setCapacitàSerb(float l){
  capacitàSerb=l;
 }

 public float getcapacitàSerb(){
  return capacitàSerb;
 }

 public Motocicletta copyMotocicletta() {
  Motocicletta m2=new Motocicletta(motore, impenna, livelloSerbatoio, capacitàSerb);
  // m2.motore=this.motore;
  // m2.impenna=this.impenna;
  // m2.livelloSerbatoio=this.livelloSerbatoio;
  // m2.capacitàSerb=this.capacitàSerb;
  return m2;
}


   //metodo modifier per rifornimento

  public String rifornisci(float l) {
    if (l<=capacitàSerb - livelloSerbatoio){
      livelloSerbatoio+=l;
      System.out.println();
      return "rifornimento completato Tot litri nel serbatoio: "+livelloSerbatoio+"L";
    }
    else{      
      return "Capienza massima serbatoio superata";
    }
    
  }

  //metodo to string
  public String toString(){
    return "Accensione: "+getMotore()+"; Impennata: "+getimpenna()+"; livello serbatoio "+getlivelloSerbatoio()+"L; Capienza Serbatoio "+getcapacitàSerb()+"L";
  }

  //metodo equals
  public boolean equals(Motocicletta m){
    if(m.motore==this.motore&&m.impenna==this.impenna&&m.livelloSerbatoio==this.livelloSerbatoio&&m.capacitàSerb==this.capacitàSerb){
    return true;
    }  
    else{
      return false;
    }
}
}