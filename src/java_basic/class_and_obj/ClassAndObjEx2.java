package java_basic.class_and_obj;

public class ClassAndObjEx2 {
    public static void main(String[] args) {
        ProductOrder[] orders = new ProductOrder[3];
        for (int i = 0; i < orders.length; i++) {
            orders[i] = new ProductOrder();
            orders[i].productName = "상품 " + i;
            orders[i].price = 1000 * i;
            orders[i].quantity = 2 * i;
        }

        int sum = 0;
        for (ProductOrder order : orders) {
            System.out.println(order.productName + " / " + order.price + " / " + order.quantity);
            sum += order.quantity * order.price;
        }

        System.out.println(sum);
    }

    static class ProductOrder {
        String productName;
        int price;
        int quantity;
    }
}
