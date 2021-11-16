package HomeWork_21_11_16_Shape_AbstractClass;

public class Picture extends Shape {
    Shape[] arrayOfShapes = new Shape[2];

    @Override
    public void draw() {
        for (Shape shape : arrayOfShapes) {
            shape.draw();
        }
    }
}
