package JavaSchool;

import java.util.Scanner;

public class VocaliConsonanti{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        char caratteri[]= new char [6]; int vocali=0, consonanti=0;

        for (int i=0;i<6;i++){
            
            System.out.println("inserire il "+(i+1)+" carattere");
            caratteri[i]=scn.next().toLowerCase().charAt(0);
            
            if (caratteri[i]=='a'||caratteri[i]=='e'||caratteri[i]=='i'||caratteri[i]=='o'||caratteri[i]=='u'){
                vocali++;
            }
            else{
                consonanti++;
            }
        }
        System.out.println("le vocali inserite sono "+vocali+" le consonanti inserite sono "+consonanti);    
    scn.close();
    }
}