public class Main {
    public static void main(String[] args) {
        Simple<Clothes> clothes = new MyArray<>();
        clothes.myAdd(new Clothes("майка","белый",42,500));
        clothes.myAdd(new Clothes("штаны","синий",44,590));
        clothes.myAdd(new Clothes("кофта,","черный",48,570));
        clothes.myPrintList();
    }
}
