package JavaSchool;

/*
Sviluppare un programma con i metodi adeguati che consentano di stabilire se i numeri
presenti in un array di 5 elementi rappresentano
- una sequenza di soli numeri pari
- una sequenza di soli numeri dispari
- una sequenza di numeri pari/dispari misti
Comunicare che tipo di sequenza, rispetto ai tre casi sopra indicati, è stata ritrovata.

int matrice = new int [5],pari=0;
System.out.Println("Inserire i numeri singolarmente premendo il tasto invio");

for (int i=0;i<matrice.lenght();i++){
    if (matrice[i]%==0){;
        pari++;
    }
    else {
        dispari++;
    }
}

if (pari==matrice.lenght()){
    System.out.Println("Soli numeri pari");
}
else if(dispari==matrice.lenght()){
    System.out.Println("Soli numeri dispari");
}
else{
    System.out.Println("Numeri pari/dispari misti");
}
*/
public class NumeriPariodispari {
    public static void main(String[] args) {         
         
        String risultato=mylib.ParioDispari();
        
        if (risultato=="pari"){
            System.out.println("sequenza di numeri pari");
            }
        else if(risultato=="dispari"){
            System.out.println("sequenza di numeri dispari");
        }
        else {
            System.out.println("sequenza di numeri pari/dispari misti");
        }
    }
}
