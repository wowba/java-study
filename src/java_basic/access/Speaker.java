package java_basic.access;

public class Speaker {
    // 객체의 필드에 직접 접근할 수 없도록 private 접근제어자를 사용할 수 있다.
    // 오직 해당 멤벼 변수가 선언된 클레스 내부에서만 volume 변수에 접근할 수 있다.
    private int volume;

    Speaker(int volume){
        this.volume = volume;
    }

    void volumeUp() {
        if (volume >= 100) {
            System.out.println("더 이상 볼륨을 증가할 수 없습니다.");
        } else {
            volume += 10;
            System.out.println("음량이 10 증가합니다.");
        }
    }

    void volumeDown() {
        if (volume <= 0) {
            System.out.println("더 이상 볼륨을 줄일 수 없습니다.");
        } else {
            volume -= 10;
            System.out.println("음량이 10 감소합니다.");
        }
    }

    void printCurrentVolume() {
        System.out.println("current volume: " + volume);
    }
}
