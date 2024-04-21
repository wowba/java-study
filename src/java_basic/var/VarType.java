package java_basic.var;

public class VarType {
    public static void main(String[] args) {
        // 정수
        byte b = 127; // -128 ~ 127, 표현 길이가 너무 작음
        short s = 32767; // -32768 ~ 32767, 표현 길이가 너무 작음
        int i = 2147483647; // -2147483648 ~ 2147483647 약 20억, 실무에서 주로 사용. 자바는 4바이트를 효율적으로 계산한다.
        long l = 9223372036854775807L; // -9223372036854775808L ~ 9223372036854775807L

        // 실수
        float f = 10.0f; // 실무에서 거의 사용 안함, 정밀도가 낮음
        double d = 1.1;

        // 불린
        boolean bo  = true; // 불린 값

        // 문자
        char c = 'a'; // 문자 하나, 문자 하나만을 쓰는 길은 거의 없기 때문에 잘 쓰지 않음.
        String st = "Hello"; // 문자열

        // int a = true 데이터 타입에 맞지 않는 데이터는 할당할 수 없다.
    }
}
