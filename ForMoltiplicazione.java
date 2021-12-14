package JavaSchool;
/***************************Pseudocode:***********************************


Scrivi("Digita il primo operatore")
Op1=<--
Scrivi("Digita il secondo operatore")
Op2=<--

	if (Op1>0 And Op2>0 OR Op1<0 And Op2<0)
		Then
		 if (Op1<0 AND Op2<0){ //se Op1 e Op2 sono negativi
		 Then
            Op1= -Op1;  //Trasformo Op1 nel suo opposto positivo
            Op2= -Op2;}  // Trasformo Op2 nel suo opposto positivo
      
        for (int I=1; I<=Op2; I++){
            k=k+Op1;}}  // somma Op1 per n volte pari al valo
			End For	
					
	else if (Op1<0 OR Op2<0){  //Altrimenti se Op1 oppure Op2 sono negativi
          
          if (Op1<0){  //se Op1 è negativo
          Then
            Op1= -Op1;}  //Trasformo Op1 nel suo opposto positivo
          
          else if (Op2<0){  // altrimenti se Op2 è negativo
          Then
            Op2= -Op2;}  // Trasformo Op2 nel suo opposto positivo
                                 
            for (int I=1;I<=Op2; I++){ 
                k=k+Op1;}  //somma Op1 assoluto per n volte pari al valore di Op2
            End For
            k=-k;}  //Ripristina il segno -
End If		
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

    if (Op1>0 && Op2>0 || Op1<0&&Op2<0){ //Se Op1 e Op2 sono positivi oppure se Op1 e Op2 sono negativi
        if (Op1<0&&Op2<0){//se Op1 e Op2 sono negativi
            Op1= -Op1;//Trasformo Op1 nel suo opposto positivo
            Op2= -Op2;}// Trasformo Op2 nel suo opposto positivo
          
        for (int I=1; I<=Op2; I++){
            k=k+Op1;}} // somma Op1 per n volte pari al valore di Op2
        
     else if (Op1<0 || Op2<0){//Altrimenti se Op1 oppure Op2 sono negativi
          
          if (Op1<0){ // se Op1 è negativo
            Op1= -Op1;}//Trasformo Op1 nel suo opposto positivo
          
          else if (Op2<0){// altrimenti se Op2 è negativo
            Op2= -Op2;}// Trasformo Op2 nel suo opposto positivo
                                 
            for (int I=1;I<=Op2; I++){ 
                k=k+Op1;}// somma Op1 assoluto per n volte pari al valore di Op2
            
            k=-k;} //Ripristina il segno -
        
System.out.println("Il risultato del prodotto è: ");
System.out.println(k);
scn.close();
    }
}




