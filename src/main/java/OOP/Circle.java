package OOP;

public class Circle extends Shape{
    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI*this.getRadius()*this.getRadius();
    }

    @Override
    public double getPerimeter() {
        return 2*Math.PI*this.getRadius();
    }

   /* @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                "Perimeter"+ getPerimeter()+
                "Area"+getArea()+
                '}';
    }*/
}
