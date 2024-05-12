package java_basic.extends1.ex2;

public class CarMain {

    public static void main(String[] args) {
        GasCar gasCar = new GasCar();
        ElecCar elecCar = new ElecCar();

        gasCar.fillUp();
        gasCar.move();

        elecCar.charge();
        elecCar.move();
        elecCar.open();
    }
}
