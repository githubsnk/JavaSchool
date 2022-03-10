package JavaSchool;

import java.util.Scanner;

// Acquisire 10 numeri dall’utente. Visualizzarli.

public class Arr10Num {
    public static void main(String[] args) {
        try (Scanner Scn = new Scanner(System.in)) {
            int MyArr[] = new int [10];
            int i=0;
            
            System.out.println("inserire 10 numeri");
            
            for(i=0;i<=9;i++){
                System.out.println("inserire il "+ i +"° numero");            
                MyArr[i]=Scn.nextInt();
            }
            System.out.println("---------------------------------------");
            for (i=0;i<=9;i++){
                System.out.println(MyArr[i]);    

            }
            Scn.close();
        }
    }
    
    
}
