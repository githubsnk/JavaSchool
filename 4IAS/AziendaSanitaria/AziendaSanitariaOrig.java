import java.util.Arrays;

public class AziendaSanitariaOrig {
private Paziente[] p;
private Medico[] m;
int indexp=0;
int indexm=0;

public AziendaSanitariaOrig() {
    this.p = new Paziente[2];
    this.m = new Medico[2];
    this.indexp = 0;
}

public AziendaSanitariaOrig(Paziente[] p, Medico[] m) {
    this.p = p;
    this.m = m;
    this.indexp = 0;
}

//metodi 
public void aggMedico(Medico me) {//aggiungere verifica doppi
    if (indexm<m.length && verificaDoppi(me)==false) {//controlla se l'array è pieno    //aggiungere espandi array  
        if(indexm==m.length);{
            ridimensiona(me);
        }  
        m[indexm]=me;    
        indexm++;             
    } 
}

public void aggPaziente(Paziente pa, Medico me) { // aggiungere eccezione    
        //boolean res =verificaDoppi(pa);
    if(indexp==p.length){
        p=ridimensiona(p);
    }

    if (verificaDoppi(pa)!=true) {//controlla se l'array è pieno    //aggiungere espandi array           
      p[indexp]=pa;
      p[indexp].setRifmedico(me);
      aggMedico(me);
      indexp++;             
    } 
    //altrimenti espandi array o dmedico   
}

// metodo verifica doppi
public boolean verificaDoppi(Paziente pa) {   
    boolean key=false; 
    for (int i = 0; i < indexp; i++) {
        if (p[i].equals(pa)) { //equals
            return key=true;
        }
    }
    return key;
}

public boolean verificaDoppi(Medico me) {    
    for (int i = 0; i < indexm; i++) {
        if (m[i].equals(me)) { //equals
            return true;
        }
    }
    return false;
}

public Medico trovaMedico(String nome) {    // aggiungere eccezione //restituisce l'indice del medico curante    
    Medico me = new Medico();    
    for (int i = 0; i < indexm; i++) {
            if ((m[i].getNome()).equals(nome)) {            
                me= m[i];            
            }      
    } 
    return me;   
}

public Paziente trovaPaziente(String nome) {  
    Paziente pa = new Paziente();    
    for (int i = 0; i < indexp; i++) {
            if ((m[i].getNome()).equals(nome)) {            
                pa= p[i];            
            }      
    } 
    return pa; 
}    


//Il metodo listaMedico restituisce un array con tutti e solo i pazienti che hanno il medico specificato dal parametro esplicito comecmedico curante
public Paziente[] listaMedico (Medico me) {
    int indice=0;
    Paziente[] newp= new Paziente[1];
    
    for (int i = 0; i < indexp; i++) {
        if ((p[i].getRifmedico()).equals(me) && p[i]!=null) {
            // if(newp.length==indice){
            //     newp=ridimensiona(newp);                
            // }          
            // aggiungere pulisciArr()
            newp[indice]=p[i];
            indice++;
            
        }        
    }
    return newp;
}

public void pulisciArr() {
    
}

// restituisce il numero di pazienti per medico fornito
public int pazientiMedico(Medico me) {
    int npaz=0;
    for (int i = 0; i < indexm; i++) {
        if (me==p[i].getRifmedico()) {
            npaz++;
        }        
    }
    return npaz;
}

// restituisce un riferimento al medico avente il maggior numero di pazienti
public Medico statMedico() {
    Medico med = new Medico();   
    int npaz=0;
    for (int i = 0; i < indexm; i++) {
        if (npaz<pazientiMedico(m[i])) {
            npaz=pazientiMedico(m[i]);
            med=m[i];
        }
    }   
    return med;
}

// ridimensiona array
private Paziente[] ridimensiona(Paziente pa[]){
    int newDim=p.length+1;
    Paziente pa1[]= new Paziente [newDim];
    for (int i = 0; i < indexp; i++) {
      pa1[i]=p[i];    
    }
    return pa1;
}

private void ridimensiona(Medico me){
    int newDim=m.length+2;
    Medico me1[]= new Medico [newDim];
    for (int i = 0; i < indexm; i++) {
        me1[i]=m[i];    
    }
    m=me1;
}

// private Object[] ridimensiona(Object[] ob){   
//     Object nuovo[]= new Object [ob.length+1];
//     for (int i = 0; i < ob.length; i++) {
//       nuovo[i]=ob[i];    
//     }
//     return nuovo;
    
// }
 
//Override medici    
@Override
public String toString() {
    return "AziendaSanitaria [p=" + Arrays.toString(p) + ", m=" + Arrays.toString(m) + ", indexp=" + indexp
            + ", indexm=" + indexm + "]";
}

@Override
public boolean equals(Object obj) {
    if (this == obj)
        return true;
    if (obj == null)
        return false;
    if (getClass() != obj.getClass())
        return false;
    AziendaSanitariaOrig other = (AziendaSanitariaOrig) obj;
    if (!Arrays.equals(p, other.p))
        return false;
    if (!Arrays.equals(m, other.m))
        return false;
    if (indexp != other.indexp)
        return false;
    return true;
}

//stampa
public static String menu() {
    String s=
    "--------------------------\n"+
    " M e n ù \n"+
    "1 - aggiungi paziente \n"+ 
    "2 - aggiungi medico \n"+ 
    "3 - lista medico \n"+    
    "4 - stat medico \n"+ 
    "5 - stampa \n"+       
    "--------------------------\n"+
    "Inserisci la scelta: ";
    return s;
  }
}
