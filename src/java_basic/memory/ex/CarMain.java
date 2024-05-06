package java_basic.memory.ex;

public class CarMain {
    public static void main(String[] args) {
        Car car1 = new Car("k3");
        Car car2 = new Car("k5");
        Car car3 = new Car("k7");

        System.out.println(Car.getTotal());
    }
}
