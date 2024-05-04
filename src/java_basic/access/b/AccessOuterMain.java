package java_basic.access.b;

import java_basic.access.a.AccessData;

public class AccessOuterMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();

        // public 호출 가능
        data.publicField = 10;
        data.publicMethod();

        // default 호출 불가능
        // data.defaultField = 20;
        // data.defaultMethod();

        // private 호출 불가능
        // data.privateField = 30;
        // data.privateMethod();

        data.innerMethod();
    }
}
