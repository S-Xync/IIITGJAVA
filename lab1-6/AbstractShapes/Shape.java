public abstract class Shape {
    protected String name;
    protected int noSides;
    abstract double getArea();
    abstract double getPerimeter();

    @Override
    public String toString() {
        return "Shape{" +
                " name = " + name +
                " , noSides = " + noSides+
                " , Perimeter = " + getPerimeter() +
                " ,Area = " + getArea()+
                " }";
    }
}