package JavaSchool;
//Leggere 5000 interi e visualizzarli al contrario.

public class Array5000 {
    public static void main(String[] args) {
        int Output=0;
        int MyArr[]= new int[5000];
        
        for (int i=0; i<5000;i++){ //riempie le variabili
            MyArr[i]=i;
            Output= MyArr[i];
            
        }

        for (int i=4999; i>=0;i--){ //riempie le variabili
            MyArr[i]=i;
            Output= MyArr[i];
            System.out.println(Output);
        }
    }
    
}
