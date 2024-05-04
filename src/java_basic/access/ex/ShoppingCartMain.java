package java_basic.access.ex;

public class ShoppingCartMain {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Item item1 = new Item("커피", 5000, 10);
        Item item2 = new Item("케이크", 30000, 10);

        cart.addItem(item1);
        cart.addItem(item2);

        cart.printItems();
        cart.printTotalPrice();
    }
}
