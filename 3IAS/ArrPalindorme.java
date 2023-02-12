package JavaSchool;
import java.util.Scanner;
/**
 * trovare l'algoritmo per identificare se una parola è palindroma
 *  
 * 
 */
public class ArrPalindorme {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        int j=0;
        char palindroma[]={'a','n','n','a'}, palindromacontr[]=new char[palindroma.length]; // 7 elementi
        String output="";
            
        
            for (int i=palindroma.length-1;i>=0;i--){
                palindromacontr[j]=palindroma[i];
            j++;            
            }

        j=0;
        
            for (int i=0;i<palindroma.length;i++){
                if (palindromacontr[i]!=palindroma[j]){
                    System.out.println("non è una parola palindroma"); 
                    break;
                }
                else{
                    output=output+palindromacontr[i]; 
                    if (i==palindroma.length-1){
                        System.out.println(" è una parola palindroma"); 
                    }
                }
            j++;            
            }        
    }    
}
