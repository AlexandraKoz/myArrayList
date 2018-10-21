public class Main {
    public static void main(String[] args) {
        Simple<String> clothes = new MyArray<>();
        clothes.myAdd("1. майка");
        clothes.myAdd("2. штаны");
        clothes.myAdd("3. кофта");
        clothes.myAdd("4. носки");
        System.out.println(clothes.mySize());
        clothes.myPrintList();
        clothes.myDelete(2);
        clothes.myPrintList();
        clothes.myGet(2);
        clothes.myPrintList();
    }
}
