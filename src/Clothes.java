public class Clothes  {
    private String name;
    private String color;
    private int size;
    private int price;


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
}
