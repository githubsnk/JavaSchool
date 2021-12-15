package JavaSchool;

import java.util.*;

/* Consegna & Pseudocodice
Leggere due numeri interi e visualizzare i numeri interi 
compresi fra il minore e il maggiore (compresi). Supporre che 
il primo numero sia minore del secondo (ovvero che siano già in 
ordine crescente). (Esempio: 3 5 -> 3, 4, 5). Visualizzare solamente
i numeri divisibili per 4 o per 5 (utilizzare l'operatore % - resto 
della divisione intera.   Esempio: 14%4 -> 2).

Begin
    int Num1, Num2;
    Scrivi("Inserire primo numero")
    Num1=<--
    Scrivi("Inserire il secondo numero")
    Num2=<--
    
    If IsNot(Num1 > Num2)
        Int Passaggio=Num2
        Num2=Num1
        Num1=Passaggio
    End If

    For (I=Num2 To Num1)
     if (i%4==0||i%5==0)
        Scrivi(I)
    End If
    End For
*/
public class NumInteri {
    public static void main (String[]args){
        int Num1, Num2;
        Scanner scn = new Scanner(System.in);

        System.out.println("Inserire primo numero");
        Num1= scn.nextInt();
        System.out.println("Inserire il secondo numero");
        Num2= scn.nextInt();
        
        if (!(Num1 > Num2)){
            int Passaggio=Num2;
            Num2=Num1;
            Num1=Passaggio;
        }
        
        System.out.print("Ecco i numeri contenuti fra i due numeri da te digitati: ");
    
        for (int i=Num2; i<=Num1; i++){
            if (i%4==0||i%5==0){
            System.out.print(i+",");
            }
        }
        scn.close();
    }
}