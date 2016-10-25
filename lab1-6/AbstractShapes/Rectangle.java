public class Rectangle extends Shape{
    int length;
    int breadth;

    public Rectangle(int length,int breadth) {
        this.length = length;
        this.breadth=breadth;
        super.name="Rectangle";
        super.noSides=4;
    }

    @Override
    double getArea() {
        return length*breadth;
    }

    @Override
    double getPerimeter() {
        return 2*(length+breadth);
    }
}
