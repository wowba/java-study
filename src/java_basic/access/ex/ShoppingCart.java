package java_basic.access.ex;

public class ShoppingCart {
    private Item[] items = new Item[10];
    private int itemCount;

    public void addItem(Item item) {
        if (itemCount == items.length) {
            System.out.println("더이상 담을 수 없습니다");
            return;
        }
        items[itemCount] = item;
        itemCount++;
    }

    public void printItems() {
        for (int i = 0; i < itemCount; i++) {
            items[i].printItem();
        }
    }

    public void printTotalPrice() {
        int sum = 0;
        for (int i = 0; i < itemCount; i++) {
            sum += items[i].getPrice();
        }
        System.out.println(sum);
    }
}
