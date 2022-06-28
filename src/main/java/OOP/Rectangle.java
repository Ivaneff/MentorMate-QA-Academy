package OOP;

public class Rectangle extends Shape {
    public Rectangle(String color, boolean filled, double length) {
        super(color, filled);
        this.length = length;
    }

    public Rectangle(String color, boolean filled, double length, double height) {
        super(color, filled);
        this.length = length;
        this.height = height;
    }

    private double length;
    private  double height;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return this.getLength()*this.getHeight();
    }

    @Override
    public double getPerimeter() {
        return 2*this.getHeight()+2*this.getLength();
    }
}
