package OOP;

public class Square extends Rectangle{

    public Square(String color, boolean filled, double length) {
        super(color, filled, length);
        this.side = length;
    }

    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
}
