package p7.bridge;

public class GreenCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println(STR."Drawing Circle[ color: green, radius: \{radius}, x: \{x}, \{y}]");
    }
}
