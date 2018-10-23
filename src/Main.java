public class Main {
    public static void main(String[] args) {
        Simple<Clothes> clothes = new MyArray<>();
        clothes.myAdd(new Clothes("майка","белый",42,500));
        clothes.myAdd(new Clothes("штаны","синий",44,590));
        clothes.myAdd(new Clothes("кофта,","черный",48,570));
        clothes.myAdd(new Clothes("носки","розовый",46,800));
        clothes.myPrintList();
        System.out.println(clothes.mySize());
        System.out.println(clothes.myGet(2));
        clothes.myDelete(1);
        clothes.myUpdate(0,new Clothes("худи","багровый",50,600));
        clothes.myPrintList();
    }
}
