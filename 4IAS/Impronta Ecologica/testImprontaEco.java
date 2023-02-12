import java.util.Scanner;

public class testImprontaEco {
    public static void main(String[] args) {
        Scanner leggi=new Scanner(System.in);   
        CarneManzo cm=new CarneManzo();
        AutomobileDaSolo a= new AutomobileDaSolo();
        
        System.out.println("inserisci il tuo nome");
        String nome=leggi.next();
        System.out.println(cm.chiediConsumo());
        cm.setConsumomese(leggi.nextDouble());       
        System.out.println(a.chiediConsumo());
        a.setConsumomese(leggi.nextDouble());
        Risorse[] r={cm,a};
        Persona p=new Persona(nome, r);
        System.out.println("la tua impronta ecologica è: "+p.calcolaIE());
    }
}
