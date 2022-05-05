package JavaSchool;
import java.util.Scanner;
import java.text.DecimalFormat;

/*
Siano dati 3 array paralleli contenenti rispettivamente cognome di una persona o peso e
altezza (per semplicità si suppongano solo 5 persone).
a) Sviluppare uno o più metodi che consentano di determinare l’IMC e di porlo in un
ulteriore array parallelo
b) Sviluppare un metodo che consenta di stabilire la situazione dell’IMC rispetto ai
criteri seguenti
c) Sviluppare un metodo che consenta di stabilire quante persone hanno IMC
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
        Scanner scn = new Scanner(System.in);
        DecimalFormat decpeso= new DecimalFormat("#0.0");// serve a stabilire quanti decimali utilizzare
        DecimalFormat decstatura= new DecimalFormat("#0.00");// serve a stabilire quanti decimali utilizzare
        System.out.print("Di quante persone vuoi calcolare l'IMC?: "); int persone=scn.nextInt();       
        String cognome[]=new String [persone], outputimc[]=new String[persone]; int superiori=0, inferiori=0;
        double peso[]=new double [persone], altezza[]=new double [persone], imc[]=new double [persone], mediaimc=0;

        for (int i=0;i<peso.length;i++){
            System.out.println("-----------------------------------"+(i+1)+"° Persona-----------------------------------");
            System.out.print("Cognome: "); cognome[i]=scn.next();            
            System.out.print("Peso(kg): "); peso[i]=scn.nextDouble();            
            System.out.print("Altezza(m): "); altezza[i]=scn.nextDouble();
            

            
            mediaimc=mediaimc+(imc[i]=peso[i]/Math.pow(altezza[i],2));
            

            //outputimc con media
            if ((imc[i]>=22) && (imc[i]<=30)){
                outputimc[i]="Sovrappeso";
                }
            else if (imc[i]>30)  {
                outputimc[i]="Obeso";
            }
            else if ((imc[i]>=19) && (imc[i]<=22)){
                outputimc[i]="Regolare";
            }
            else if (imc[i]<19){
                outputimc[i]="Sottopeso";                               
            }            
        }

        mediaimc=mediaimc/persone;

        for(int i=0;i<persone;i++){
            System.out.println("Cognome: "+cognome[i]+" -  Peso: "+peso[i]+"kg - Altezza: "+altezza[i]+"m - imc: "+outputimc[i]);
        }

        for(int i=0;i<persone;i++){
            if (imc[i]>mediaimc){
                superiori++;
            }
            else{
                inferiori++;
            }
           
        }
        System.out.println("---------------------------Superiori/Inferiori rispetto alla media-------------------------");
        System.out.println(superiori+" persone sono superiori alla media - "+inferiori+" persone sono inferiori alla media");
       
           
           
    }
    
}
