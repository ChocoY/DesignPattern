package p6.adapter;

public class Mp4Player implements AdvanceMediaPlayer {
    @Override
    public void playVlc(String fileName) {

    }

    @Override
    public void playMp4(String fileName) {
        System.out.println(STR."Playing mp4 file. Name: \{fileName}");
    }
}
