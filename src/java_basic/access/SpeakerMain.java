package java_basic.access;

public class SpeakerMain {
    public static void main(String[] args) {
        Speaker speaker = new Speaker(90);
        speaker.printCurrentVolume();
        speaker.volumeUp();
        speaker.volumeUp();
        speaker.printCurrentVolume();

        // 컴파일 에러 발생!
        // volume 멤버변수는 private 접근 제어자를 사용하기 때문에 다른 클래스에서 접근할 수 없다.
        // speaker.volume = 200;
    }
}
