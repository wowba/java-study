package java_start.var;
// 패키지는 자바 파일을 구분하기 위한 폴더 개념
// 특정 패키지에 속하는 파일은 항상 본인이 소속된 패키지를 명시해야 한다.

public class VarBasic {
    public static void main(String[] args) {
        int a; // 변수 선언
        a = 20; // 변수에 값 할당 = 변수 초기화
        System.out.println(a); // 20, 변수 값을 읽어서 콘솔로 출력
        a = 50; // 변수에는 값을 재할당 할 수 있다. 기존 값은 삭제된다.
        System.out.println(a); // 50

        int b = 2, c = 3; // 변수는 한번에 여러개를 선언 / 초기화 할 수 있다.
        System.out.println(b + c); // 5

        int d;
        // System.out.println(d); 초기화 하지 않은 변수는 사용할 경우 에러가 발생한다.
        // 메모리 공긴을 부여받을 때 기존에 어떤 값이 있을지 모르기 때문에 자바는 변수를 초기화 하도록 강제한다.
        // 이러한 컴파일 에러 덕분에 개발자가 에러를 쉽게 찾을 수 있다.
    }
}
