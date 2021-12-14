package JavaSchool;
/****************************Pseudocode:**********************************


Scrivi("Digita il primo operatore")
Op1=<--
Scrivi("Digita il secondo operatore")
Op2=<--

	if (Op1>0 AND Op2>0)
		Then
			For I:=1 to Op2
			k=k+Op1
			End For	
					
		Else if (op1<0 AND Op2>0)
			THEN
				Op1Ass= Op1-Op1-Op1
				For I:=1 to Op2
				K=K+Op1Ass
				End For	
				k=-k
			
			Else if (Op2<0) AND (Op1>0)
				THEN
					Op2Ass= op2-op2-op2
					For I:=1 to Op2Ass
					K=K+Op1
					End For	
					k=-k
			
				Else if (Op1<0 AND Op2<0)
					THEN
						Op2Ass= op2-op2-op2
						Op1Ass= op1-op1-op1
						For I:=1 to Op2Ass
						k=k+Op1Ass
						End For	
End If		
*******************************************************************************/
import java.util.*;
public class ForMoltiplicazione
{
  public static void main (String[]args)
  {
    Scanner scn = new Scanner(System.in);
int k=0, Op1=0, Op2=0, Op1Ass, Op2Ass;

System.out.println("Digita il primo operatore");
Op1= scn.nextInt();
System.out.println("Digita il secondo operatore");
Op2= scn.nextInt();

    if (Op1>0 && Op2>0){ //Se Op1 e Op2 sono num positivi
        for (int I=1; I<=Op2; I++){
        k=k+Op1; // somma Op1 per n volte pari al Op2
        }
    } else if (Op1<0 && Op2>0){//Altrimenti se Op1 e Negativo e Op2 è positivo
        Op1Ass= Op1-Op1-Op1;//Trasformo Op1 nel suo opposto positivo
            for (int I=1;I<=Op2; I++){ 
            k=k+Op1Ass;// somma Op1 assoluto per n volte pari al Op2
            }
        k=-k; //Ripristina il segno -
    } else if (Op2<0 && Op1>0){ //Altrimenti se Op2 è negativo e Op1 è positivo
        Op2Ass= Op2-Op2-Op2;// Trasformo Op2 nel suo opposto positivo
            for (int I=1; I<=Op2Ass; I++){
            k=k+Op1; // somma il primo operatore per n volte pari al Op2
            }
        k=-k; //Ripristina il segno -
    } else if (Op1<0 && Op2<0){//Altrimenti se Op1 e Op2 sono negativi
        Op1Ass= Op1-Op1-Op1;// Trasformo Op1 nel suo opposto positivo
        Op2Ass= Op2-Op2-Op2;// Trasformo Op2 nel suo opposto positivo
            for (int I=1; I<=Op2Ass; I++){
                k=k+Op1Ass;// somma Op1 assoluto per n volte pari al Op2
        }
    }
System.out.println("Il risultato del prodotto è: ");
System.out.println(k);
    }
}



