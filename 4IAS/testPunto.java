package SviluppoJava;

public class testPunto {
    public static void main(String[] args) {
        //inizializzo e instanzio le classi punto
        Punto p1= new Punto(3, 5), p2=new Punto(7, 10);
        System.out.println("Coordinate iniziali:Punto 1 "+p1.toString());
        System.out.println("Coordinate iniziali:Punto 2 "+p2.toString());
        System.out.println("-----------------");
        //calcolo distanza
        System.out.println("Distanza: "+p1.distanza(p2));
        System.out.println("-----------------");

        //trasla in nuovo punto
        System.out.println("Nuovo Punto: "+p1.traslaInNuovoPunto(10,4));
        System.out.println("-----------------");

    }
    
}
