package java_basic.oop;

public class MpByOOP {
    int volume = 0;
    boolean isOn = false;

    void on() {
        isOn = true;
        System.out.println("플레이어 켜기");
    }
    void off() {
        isOn = false;
        System.out.println("플레이어 끄기");
    }

    void volumeUp() {
        volume++;
        System.out.println("current volume is " + volume);
    }
    void volumeDown() {
        volume--;
        System.out.println("current volume is " + volume);
    }

    void showStatus() {
        if (isOn) System.out.println("플레이어 켜짐, 현재 볼륨 : " + volume);
        if (!isOn) System.out.println("플레이어 꺼짐");
    }
}
