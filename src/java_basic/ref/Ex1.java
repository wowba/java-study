package java_basic.ref;

public class Ex1 {
    public static void main(String[] args) {
        ProductOrder order1 = createOrder("김치", 10000, 10);
        ProductOrder order2 = createOrder("제욱", 12000, 4);

        ProductOrder[] orders = {order1, order2};

        printOrder(orders);
        printTotalPrice(orders);
    }

    static class ProductOrder {
        String name;
        int price;
        int quantity;
    }

     static ProductOrder createOrder(String name, int price, int quantity) {
        ProductOrder order = new ProductOrder();
        order.name = name;
        order.price = price;
        order.quantity = quantity;
        return order;
     }

     static void printOrder(ProductOrder[] orders) {
        for (ProductOrder order : orders) {
            System.out.println(order.name + " " + order.price + " " + order.quantity);
        }
     }

     static void printTotalPrice(ProductOrder[] orders) {
        int sum = 0;
        for (ProductOrder order : orders) {
            sum += order.price * order.quantity;
        }
         System.out.println("전체 가격 : " + sum);
     }
}
