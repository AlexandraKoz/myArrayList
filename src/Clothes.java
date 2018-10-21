import java.util.Iterator;

public class Clothes  {
    private String name;
    private String color;
    private int size;
    private int price;

    private Clothes [] values;

    public Clothes(){}

    public Clothes(String name, String color, int size, int price){
        this.name = name;
        this.color = color;
        this.size = size;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Clothes{" +
                "name='" + getName() + '\'' +
                ", color='" + getColor() + '\'' +
                ", size=" + getSize() +
                ", price=" + getPrice() +
                '}';
    }

    //    @Override
//    public boolean myAdd(Clothes clothes) {
//        try {
//            Clothes[] temp = values;
//            values = (Clothes []) new Object[temp.length + 1];
//            System.arraycopy(temp,0,values,0,temp.length);
//            values[values.length - 1] = clothes;
//            return true;
//        } catch (ClassCastException ex){
//            ex.printStackTrace();
//        }
//        return false;
//    }
//
//    @Override
//    public void myDelete(int index) {
//        try {
//            Clothes[] temp = values;
//            values = (Clothes[]) new Object[temp.length - 1];
//            System.arraycopy(temp,0,values,0,index);
//            System.arraycopy(temp,index+1,values,index,temp.length-index-1);
//        } catch (ClassCastException ex){
//            ex.printStackTrace();
//        }
//    }
//
//    @Override
//    public Clothes myGet(int index) {
//        return values[index];
//    }
//
//    @Override
//    public int mySize() {
//        return values.length;
//    }
//
//    @Override
//    public void myUpdate(int index, Clothes clothes) {
//        values[index] = clothes;
//    }
//
//    @Override
//    public void myPrintList() {
//        for (Clothes cl: values) {
//            System.out.println(cl);
//        }
//    }
//
//    @Override
//    public Iterator<Clothes> iterator() {
//        return new ArrayIterator<>(values);
//    }
}
