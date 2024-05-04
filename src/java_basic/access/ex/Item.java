package java_basic.access.ex;

public class Item {
    private String name;
    private int price;
    private int quantity;

    public Item(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void printItem() {
        System.out.println("name : " + name + " price : " + price + " quantity : " + quantity);
    }

    public int getPrice() {
        return price * quantity;
    }
}
