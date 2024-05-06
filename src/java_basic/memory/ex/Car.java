package java_basic.memory.ex;

public class Car {
    private String name;
    private static int total;

    public Car(String name){
        System.out.println("차량 구입, name : " + name);
        this.name = name;
        total++;
    }

    public static int getTotal(){
        return total;
    }
}
