package JavaSchool;
/*--------------------------------------------------Consegna-----------------------------------------------------
Siano dati 3 array paralleli contenenti rispettivamente cognome di una persona o peso e
altezza (per semplicità si suppongano solo 5 qtàpersone).
a) Sviluppare uno o più metodi che consentano di determinare l’IMC e di porlo in un
ulteriore array parallelo
b) Sviluppare un metodo che consenta di stabilire la situazione dell’IMC rispetto ai
criteri seguenti
c) Sviluppare un metodo che consenta di stabilire quante qtàpersone hanno IMC
maggiore della media e quanti hanno IMC inferiore alla media
Comunicare i risultati per ogni punto dell’esercizio.

Con MassaCorporea espressa in Kg con un decimale e statura espressa in metri con
due decimali.
- obesa (una persona è obesa se IMC>30)
- sovrappeso ((22<=IMC<=30))
- regolare (19<=IMC<22)
- sottopeso (IMC<19)
*/

public class ArrIMC2 {    
    public static void main(String[] args) {        
        //chiedo quante persone si vuole inserire
        int qtàpersone=mylib.dammiInt("Di quante quante persone vuoi calcolare l'IMC?: ");

        String cognome[]=new String [qtàpersone], outputimc[]=new String[qtàpersone]; int superiori=0, inferiori=0;
        double peso[]=new double [qtàpersone], altezza[]=new double [qtàpersone], imc[]=new double [qtàpersone];
        
        //inserisce le generalità
        mylib.insGeneralitàImc(qtàpersone, cognome, peso, altezza);
        // calcola imc e imc medio e restituisce la media
        double mediaimc=mylib.calcolaImc(qtàpersone, imc, peso, altezza, outputimc);       
        //gestisce l'output 
        mylib.outputImc(qtàpersone, cognome, imc, peso, altezza, outputimc, mediaimc, superiori, inferiori);       
    }    
}
