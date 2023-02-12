package JavaSchool;
import java.util.*;

public class Arr10NumDesc {
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
            for (i=9;i>=0;i--){
                System.out.println(MyArr[i]);    
            }
   Scn.close();
        }
    }   
}
