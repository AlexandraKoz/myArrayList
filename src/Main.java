public class Main {
    public static void main(String[] args) {
        Simple<String> clothes = new MyArray<>();
        clothes.myAdd("майка");
        clothes.myAdd("штаны");
        clothes.myAdd("кофта");
        clothes.myAdd("носки");
        clothes.myPrintList();
    }
}
