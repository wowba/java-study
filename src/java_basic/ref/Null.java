package java_basic.ref;

public class Null {
    public static void main(String[] args) {
        String asdf = null;
        System.out.println(asdf);

        // NullPointerException
        // 인스턴스가 존재하지 않는 null 인데 참조값을 이용해 객체를 찾으려 했기 때문에 에러 발생.
        System.out.println(asdf.length());
    }
}
