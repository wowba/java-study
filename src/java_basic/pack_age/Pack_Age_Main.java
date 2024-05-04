package java_basic.pack_age;

// 다른 패키지에 있는 클래스는 import 해서 사용할 수 있다.
import java_basic.pack_age.a.User;

// 와일드카드를 이용해 모든 클래스를 import 할 수 있다.
import java_basic.pack_age.a.*;

public class Pack_Age_Main {
    public static void main(String[] args) {
         User user = new User();
         User2 user2 = new User2();
    }
}
