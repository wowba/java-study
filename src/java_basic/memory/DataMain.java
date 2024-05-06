package java_basic.memory;

public class DataMain {
    public static void main(String[] args) {
        Data.printCount(); // static 메서드는 인스턴스를 생성하지 않고 사용할 수 있다.

        Data data1 = new Data(1);
        System.out.println(data1.getCount());

        Data data2 = new Data(2);
        System.out.println(data2.getCount());

        Data data3 = new Data(3);
        System.out.println(data3.getCount());

        System.out.println(Data.count); // static 변수에 접근하기 위해선 인스턴스가 아닌 클래스의 참조값을 이용해야 한다.
    }
}
