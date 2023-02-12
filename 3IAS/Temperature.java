package JavaSchool;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        double misurazioni[]= new double[24], maxmis=0, minmis=51; int orario[]= new int[24],oramax=0, oramin=0;

        for(int i=0;i<24;i++){
            misurazioni[i]=(int) (Math.random()*(50+30)-30);
            orario[i]=i;

            if (misurazioni[i]>maxmis){
                maxmis=misurazioni[i];
                oramax=orario[i];
            }
            else if(misurazioni[i]<minmis){
                minmis=misurazioni[i];
                oramin=orario[i];
            }
            System.out.println("Misura rilevata alle "+orario[i]+":00 di "+misurazioni[i]+" °C");
        }    
        
        System.out.println("misurazione minima "+minmis+" °C alle ore "+oramin+":00");
        System.out.println("misurazione massima "+maxmis+" °C alle ore "+oramax+":00");
        System.out.println("escursione della giornata "+(maxmis-minmis)+" °C");


    scn.close();    
    }
    
}
