package JavaSchool;
/***************************Pseudocode:***********************************
Scrivi("Digita il primo operatore")
Op1=<--
Scrivi("Digita il secondo operatore")
Op2=<--

for (int i=1;i<=Op2;i++) 
      k=k+Op1;
  End For
    if (Op2<0||Op1<0&&Op2<0){ // Se Op2 è negativo Oppure  Op1 e Op2 sono negativi
      Op2=-Op2; // Trasformo in assoluto Op2
      Op1=-Op1; // Trasformo in assoluto Op1
      for (int i=1;i<=Op2;i++){
        k=k+Op1;
      End For
    End if
    }
  }    
*******************************************************************************/
import java.util.*;
public class ForMoltiplicazione
{
  public static void main (String[]args)
  {
   Scanner scn = new Scanner(System.in);
int k=0, Op1=0, Op2=0;

System.out.println("Digita il PRIMO OPERATORE");
Op1= scn.nextInt();
System.out.println("Digita il SECONDO OPERATORE");
Op2= scn.nextInt();


    for (int i=1;i<=Op2;i++){
      k=k+Op1;
    }
    if (Op2<0||Op2<0&&Op1<0){
      Op2=-Op2;
      Op1=-Op1;
      for (int i=1;i<=Op2;i++){
        k=k+Op1;
    }
  }    
    
System.out.println("Il risultato del prodotto è: ");
System.out.println(k);
scn.close();
    }
}




