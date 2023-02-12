package JavaSchool;

import java.util.Scanner;

public class Altezza {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        float altezze[]= new float[6], medcomp=0, medalte=0, altezzatemp=0, altezzatemp2=0; int sopmed=0, sotmed=0;

        for (int i=0;i<6;i++){            
            System.out.println("inserire l'altezza della "+(i+1)+"° persona");
            altezze[i]=scn.nextFloat();                      
        }
        for (int i=0;i<6;i++){
            medcomp=medcomp+altezze[i];
        }
        medcomp=medcomp/altezze.length;
        System.out.println("media complessiva "+medcomp);
        for (int i=0;i<6;i++){
            if (altezze[i]>medcomp){
                sopmed++;
            }
            else{
                sotmed++;
            }
        }
        System.out.println(sopmed+" persone sono sopra la media");
        System.out.println(sotmed+" persone sono sotto la media");
        
        // for(int i=0;i<6;i++){
        //     for(int j=i+1;j<6;j++){
        //         if (altezze[i]>altezze[j]&&(!(altezze[i]==maxalt[f]))){
        //             maxalt[f]=altezze[i];   
        //             f++;
        //             // if(f==2){
        //             //     break;
        //             // }            
        //         }            
        //     }
        // }

        for (int i=0;i<altezze.length;i++)
            if (altezze[i]>altezzatemp){
                altezzatemp=altezze[i];
                if (altezzatemp>altezzatemp2){
                    altezzatemp2=altezzatemp;
                }
            }
        medalte=(altezzatemp+altezzatemp2)/2;
        
        System.out.println("media delle due persone più alte "+medalte);
        scn.close();
    }    
}
