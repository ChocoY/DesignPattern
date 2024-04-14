package p6.adapter;

public class MediaAdapter implements MediaPlayer{
    AdvanceMediaPlayer advanceMediaPlayer;
    public MediaAdapter(String audioType) {
        if (audioType.equals("vlc")) {
            advanceMediaPlayer = new VlcPlayer();
        } else if (audioType.equals("mp4")) {
            advanceMediaPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        switch (audioType) {
            case "vlc" -> {
                advanceMediaPlayer.playVlc(fileName);
            }
            case "mp4" -> {
                advanceMediaPlayer.playMp4(fileName);
            }
        }
    }
}
