class Magazzino{
  //attributi 
  private Prodotto p[]; //array prodotto
  
  private int progr; //numero prodotti
  
  

  //costruttori 
  public Magazzino(){
    p =new Prodotto[2]; //istanziare l'array
    progr=0;    
  }

  public Magazzino(int max){
    p=new Prodotto[max];
    progr=0;
  }

  public Magazzino(Prodotto[] prod){
    p =prod; //istanziare l'array
    progr=prod.length;    
  }

  //aggiunta Prodotto
  public boolean aggiungi(Prodotto prod){
    boolean aggiunto=false;
    if (progr<p.length) {//controlla se l'array è pieno
      p[progr]=prod;
      progr++;
      aggiunto=true;
    }
    return aggiunto;    
  }

  // tostring
  public String toString(){
    String s="";
    for (int i = 0; i < progr; i++) {
      s=s+(this.p[i].toString());
    }
    if (s.equals("")) {
      s="non ci sono prodotti in magazzino";
    }
    
    return s;//restituisce l'elenco dei prodotti
  }   

  //ricerca prodotto
    public int ricerca(String nome){      
    int pos=-1;    // se pos è ugguale a -1
    for (int i = 0; i < progr; i++) {// ritorna posizione se trovato
         if (p[i].getNome().equals(nome)) {
           pos= i;
           break;
         }
       }     
       return pos;
    }

  //modifica prootto
  public void modifica(Prodotto prod, int pos){  
    p[pos]=prod;      
  }

  //cancellazione prodotto
  public boolean cancella(int pos){
  boolean esito=false;
  if (pos<progr) {//controlliamo posizione se rientra nell'array
    for (int i = pos; i < progr-1; i++) {
      p[i]=p[i+1];
    }
    p[progr-1]=null;
    progr--;
    esito=false;
  }          
  return esito;
  }

  // ridimensiona array
  private void ridimensiona(Prodotto[] p){
  int newDim=p.length*2;
  Prodotto p1[]= new Prodotto[newDim];
  for (int i = 0; i < progr; i++) {
    p1[i]=p[i];
  }
  p=p1;
  }

  public void setProgr(int progr) {
    this.progr = progr;
  }

  public void suPrezzi(double perc){
    //for legge prezzo 
    double newprice;
    double prezzo;
    perc=perc/100;
    for (int i = 0; i < progr; i++) {      
      prezzo=p[i].getPrezzo();
      newprice=(prezzo*perc)+prezzo;
      p[i].setPrezzo(newprice);
    }   

  }

  public void giuPrezzi(double perc){
    //for legge prezzo 
    double newprice;
    double prezzo;
    perc=perc/100;
    for (int i = 0; i < progr; i++) {      
      prezzo=p[i].getPrezzo();
      newprice=(prezzo*perc)-prezzo;
      p[i].setPrezzo(-1*newprice);
    }   
  }

  public void limPrezziMax(double prezzomax){
    double prezzo;       
    for (int i=0;i<progr;i++){
      prezzo=p[i].getPrezzo();
      if (prezzomax<prezzo){       
        prezzo=(prezzomax-0.01);     
        p[i].setPrezzo(prezzo);       
      }
    }
  }

  //metodo che restituisca un "sotto magazzino" con i prodotti il cui prezzo sia inferiore ad un valore scelto
  public Magazzino selPrezzoLim(double limite) {
    Magazzino m2=new Magazzino(); 
    double prezzo;
    int n=0;
    for (int i=0;i<progr;i++){
      prezzo=p[i].getPrezzo();
      if (limite>prezzo){    
        m2.aggiungi(p[i]); //p2[i]=p[i];            
      }
    }
    return m2;
  }

  public static String menu() {
    String s=
    "--------------------------\n"+
    " M e n ù \n"+
    "1 - Caricamento \n"+ 
    "2 - Stampa \n"+
    "3 - Modifica \n"+
    "4 - Cancellazione \n"+
    "5 - aumenta (%) \n"+
    "6 - sconta prezzi (%) \n"+
    "7 - prezzo massimo \n"+
    "8 - sottomagazzino \n"+
    "0 - Uscita \n"+
    "--------------------------\n"+
    "Inserisci la scelta: ";
    return s;
  }

}