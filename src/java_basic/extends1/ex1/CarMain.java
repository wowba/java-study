package java_basic.extends1.ex1;

public class CarMain {
    public static void main(String[] args) {

        Car car = new Car();

        ElecCar elecCar = new ElecCar();

        car.fuel();
        car.move();

        elecCar.charge();
        elecCar.move();
    }
}
