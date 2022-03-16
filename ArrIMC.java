package JavaSchool;
import java.util.*;
import java.math.*;
/*
Gestire in input due array paralleli in cui inserire (se volete semplificarvi il tutto inserite direttamente
 peso e altezza in fase di dichiarazione degli array)
-Altezza di 5 persone
-Peso di 5 persone
Popolare un terzo array parallelo con IMC di ogni persona.
Comunicare in output il contenuto dell'array con IMC.

Facoltativi:
Potete gestire con ulteriori array paralleli il nome  delle persone e lo stato fisico (obeso, sovrappeso ecc..)
Knowing that a person is:
- obese (a person is obese if BMI> 30)
- overweight (25 <= BMI <= 30)
- regular (19 <= BMI <25)
- underweight (BMI <19)
*/

public class ArrIMC {
    public static void main(String[] args) {

    Scanner scn = new Scanner(System.in);
    int i=0, persone=0;
    
    System.out.println("di quante perosne vuoi calcolare l' IMC?");
    persone= scn.nextInt();
    double peso[]= new double [persone], altezza[]= new double[persone], imc[]= new double[persone];
    String nome[]= new String [persone], imcstr="";
    
        while (i<persone){
            System.out.println("Inserisci il tuo nome, peso(Kg) e l'altezza(mt) separati dal tasto invio");
            nome[i]=scn.next();
            peso[i]=scn.nextDouble();
            altezza[i]=scn.nextDouble();
            imc[i]= peso[i]/Math.pow(altezza[i], 2); 
            i++;
        }

        for (int j=0; j<imc.length; j++){
            if (imc[j]>30){
                imcstr="Obeso";
            }
            else if (imc[j]>=25&&imc[j]<=30){
                imcstr="Sovrappeso";
            }
            else if (imc[j]>=19&&imc[j]<25){
                imcstr="Regolare";
            }
            else if(imc[j]<19){
                imcstr="Sottopeso";
            }
        
            System.out.println("l' IMC di "+nome[j]+" è "+imcstr);
        }

    }
    
}
