public class ArrOrdina {
    public static void main(String[] args) {
        
        long matrice[]= new long[mylib.readInt("quanti numeri vuoi inserire?")];
        mylib.arrLongIns(matrice);
        matrice=mylib.arraySortLong(matrice, "dis");
        mylib.arrayOutputHorizLong(matrice);
    }
}
