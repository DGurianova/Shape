package HomeWork_21_11_16_Shape_AbstractClass;

public class Rectangle extends Shape {
    int height;
    int width;
    Line line;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
        line = new Line(width);
    }

    @Override
    public void draw() {
        for (int i = 0; i < height; i++) {
            if (i == 0 || i == height-1) {
               line.draw();
            } else{
            for (int j = 0; j < width; j++) {
                if (j == 0 || j == width - 1) {
                    System.out.print(symbol);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        }
    }
}
