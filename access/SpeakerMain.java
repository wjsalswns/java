package access;

public class SpeakerMain {
    public static void main(String[] args) {
        Speaker speaker = new Speaker(90);
        speaker.ShowVolume();

        speaker.volumeUp();
        speaker.ShowVolume();

        speaker.volumeUp();
        speaker.ShowVolume();

        // 필드에 직접 접근
        // System.out.println("volume 필드 직접 접근 수정");
        // speaker.volume = 200;
        // speaker.ShowVolume();
    }
}
