package JavaSchool;
import java.util.*;
/*
Taxes in Italy are paid on the basis of income; specifically the calculation of taxes with respect to income is
based on the following table

Income brackets 2020 Rate Taxes to be paid 2020
from 0 to 15,000 euros 23% 23% of the income
from 15,000.01 to 28,000 euros 27% 3,450 + 27% on the part exceeding 15,000 euros
from 28,000.01 to 55,000 euros 38% 6,960 + 38% on the part exceeding 28,000 euros
from 55,000.01 to 75,000 euros 41% 17,220 + 41% on the part exceeding 55,000 euros
over 75,000 euros 43% 25,420 + 43% on the part exceeding 75,000 euros
Write a java program that, given the annual income of 5 people as input, outputs the taxes from
to pay. Also communicate the total amount of taxes collected by the state for these 5 people.
*/
public class TaxCalc {
    public static void main(String args[]){
        Scanner Scn = new Scanner(System.in);
        Double Income, Tax=0.0, TotTax=0.0;

        for(int i=1;i<=5;i++){ // Receives as input the income of 5 people
            System.out.println("Enter the income of the "+i+"° person");
            Income= Scn.nextDouble();
            /* selections to identify taxes due based on income
            declared.*/
            if (Income>75000){ 
                Tax= (Income*43)/100+25420;
            }
            else if (Income<75000&&Income>55000.01){
                Tax= (Income*41)/100+17220;
            }
            else if(Income<55000&&Income>28000.01){
                Tax=(Income*38)/100+6960;
            }
            else if(Income<28000&&Income>15000.01){
                Tax= (Income*27)/100+3450;
            }
            else if(Income<15000&&Income>0){
                Tax= ((Income*23)/100);
            }
            // output taxes due for each individual person
            TotTax= TotTax+Tax;            
            System.out.println("Taxes due of "+i+"° person: "+Tax+" €");
            System.out.println("");
        }
        // total tax output owed to the state by the 5 people
        System.out.println("Total Taxes owed to the state "+TotTax+" €");
    Scn.close();
    }
}
