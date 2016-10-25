public class Circle extends Shape{
    protected int radius;

    public Circle(int radius) {
        this.radius = radius;
        super.name="Circle";
        super.noSides=0;
    }

    @Override
    double getArea() {
        return 3.14*radius*radius;
    }

    @Override
    double getPerimeter() {
        return 2*3.14*radius;
    }
}
