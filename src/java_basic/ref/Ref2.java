package java_basic.ref;

import javax.xml.crypto.Data;

public class Ref2 {
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        Data dataB = dataA;
        System.out.println(dataA == dataB); // true, 두 인스턴스의 주소값은 동일하다.

        // dataA 변경
        dataA.value = 20;
        System.out.println(dataA.value == dataB.value); // true, 같은 인스턴스를 공유하므로 value를 변경해도 동일하다.

        // dataB 변경
        dataB.value = 30;
        System.out.println(dataA.value == dataB.value); // true, 위와 동일한 이유.
    }

    static class Data {
        int value;
    }
}
