package HomeWork_21_11_16_Shape_AbstractClass;

public class Main {
    public static void main(String[] args) {
        Line line = new Line(8);
        Rectangle rectangle = new Rectangle(10, 15);
        Picture picture = new Picture();

        picture.arrayOfShapes[0] = line;
        picture.arrayOfShapes[1] = rectangle;

        picture.draw();
    }
}