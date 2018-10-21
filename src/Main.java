public class Main {
    public static void main(String[] args) {
        Simple<Clothes> clothes = new MyArray<>();
        clothes.myAdd(new Clothes("fbfn","fdsbfdhuj",42,500));
        clothes.myAdd(new Clothes("wertyui","sdfcgyhujk",44,590));
        clothes.myAdd(new Clothes("zxcvbnm,","xdrfghjkm",48,570));
        clothes.myPrintList();
    }
}
