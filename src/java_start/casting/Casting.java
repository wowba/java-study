package java_start.casting;

public class Casting {
    public static void main(String[] args) {
        // 자동 형변환
        int intValue = 10;
        long longValue;
        double doubleValue;

        longValue = intValue; // 가능
        doubleValue = longValue; // 가능
        System.out.println(doubleValue); // 10.0

        // intValue = doubleValue 불가능.
        // 더 널은 범위의 타입은 좁은 범위의 타입 자동 형변환으로 할당할 수 없다.

        // 명시적 형변환
        // 더 좁은 범위의 타입으로 변환하려면 명시적 형변환이 필요하다
        double dValue = 10.5;
        int iValue;

        iValue = (int) dValue; // 명시적 형변환. 명시적 형변환은 데이터 타입을 강제로 변경할 수 있다.
        System.out.println(iValue); // 10, 0.5는 사라진다.

        // 오버플로우
        long maxIntPlusOne = 2147483648L; // int 최고값 + 1
        System.out.println((int) maxIntPlusOne); // -214783648, 의도한 값이 아닌 음수 값이 나온다.
        // 명시적 형변환 시 최대 범위를 넘는다면 아래 타입의 가장 작은 숫자(음수 값)부터 다시 시작한다.
        // 오버플로우 현상은 가능하면 일어나지 않도록 해야한다. 발생한다면 타입의 크기를 늘리자!

        // 계산시 형변환
        int div1 = 3 / 2;
        System.out.println(div1); // 1, 0.5는 사라진다
        double div2 = 3 / 2;
        System.out.println(div2); // 1.0
        // -> 결국 int 3과 int 2를 나눈것이기 때문에 결과값인 1을 1.0으로 캐스팅
        double div3 = 3.0 / 2;
        System.out.println(div3); // 1.5
        // 다른 타입끼리의 계산은 큰 범위로 자동 형변환이 일어난다.
        double div4 = (double) 3 / 2;
        System.out.println(div4); // 1.5
        // 위와 동일
    }
}
