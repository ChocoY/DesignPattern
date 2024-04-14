package p5.prototype;

public class PrototypePatternDemo {
    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape clonedShape = (Shape) ShapeCache.getShape("1");
        System.out.println(STR."Shape : \{clonedShape.getType()}");

        Shape clonedShape2 = (Shape) ShapeCache.getShape("2");
        System.out.println(STR."Shape : \{clonedShape2.getType()}");

        Shape clonedShape3 = (Shape) ShapeCache.getShape("3");
        System.out.println(STR."Shape : \{clonedShape3.getType()}");
    }
}
