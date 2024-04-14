package p7.bridge;

public class RedCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println(STR."Drawing Circle[ color: red, radius: \{radius}, x: \{x}, \{y}]");
    }
}
