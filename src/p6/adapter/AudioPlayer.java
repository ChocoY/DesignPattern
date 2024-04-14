package p6.adapter;

public class AudioPlayer implements MediaPlayer {
    @Override
    public void play(String audioType, String fileName) {
        switch (audioType) {
            case "mp3" -> System.out.println("Playing mp3 file. Name: " + fileName);
            case "vlc", "mp4" -> {
                MediaAdapter mediaAdapter = new MediaAdapter(audioType);
                mediaAdapter.play(audioType, fileName);
            }
            default -> System.out.println("Invalid media. " + audioType + " format not supported");
        }
    }
}
