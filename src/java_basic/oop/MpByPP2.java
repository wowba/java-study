package java_basic.oop;

// 좀 더 개선한 절차지향적 코드
// 클래스를 사용했지만, 클래스의 데이터와 메서드는 같은 클래스 안에 존재하지 않는다.
public class MpByPP2 {
    public static void main(String[] args) {
        MusicPlayer player = new MusicPlayer();
        // 켜기
        on(player);
        // 볼륨 증가
        volumeUp(player);
        // 볼륨 감소
        volumeDown(player);
        // 음악 플레이어 끄기
        off(player);
    }

    static class MusicPlayer {
        int volume = 0;
        boolean isOn = false;
    }

    static void on(MusicPlayer player) {
        player.isOn = true;
        System.out.println("플레이어를 시작합니다.");
    }

    static void off(MusicPlayer player) {
        player.isOn = false;
        System.out.println("플레이어를 종료합니다.");
    }

    static void volumeUp(MusicPlayer player) {
        player.volume++;
        System.out.println("현재 볼륨 : " + player.volume);
    }

    static void volumeDown(MusicPlayer player) {
        player.volume--;
        System.out.println("현재 볼륨 : " + player.volume);
    }
}
