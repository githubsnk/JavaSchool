public class Prodotto{
   //attributi
   private String nome;
   private double prezzo;
   //metodi
   //costruttori
   public Prodotto(){
     nome="";
     prezzo=0;
   }
   public Prodotto(String n,float p){
      nome=n;
      prezzo=p;
   }
   //accessor get e set
   public String getNome(){
       return nome;
   }
   public double getPrezzo(){
      return prezzo;
   }
   public void setNome(String nome){
      this.nome=nome;
   }
   public void setPrezzo(double prezzo){
     this.prezzo=prezzo;
   }

   public String toString(){      
      return "Nome: "+getNome()+" Prezzo: "+getPrezzo()+"\n";
    }   
   
}