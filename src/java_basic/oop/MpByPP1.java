package java_basic.oop;

// 절차지향적으로 작성해보기
public class MpByPP1 {
    public static void main(String[] args) {
        int volume = 0;
        boolean isOn = false;

        // 켜기
        isOn = true;
        System.out.println("플레이어 시작");

        // 볼륨 증가
        volume++;
        System.out.println("volume = " + volume);
        // 볼륨 감소
        volume--;
        System.out.println("volume = " + volume);
        // 음악 플레이어 상태
        if (isOn) {
            System.out.println("플레이어 켜짐, volume = " + volume);
        } else {
            System.out.println("플레이어 꺼짐");
        }
    }
}
