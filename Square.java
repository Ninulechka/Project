package figures;


public class Square implements Shape {
    public double side;
    public final int PARAMETER = 1;
    private String type = "Square";

    public Square() {

    }

    public Square(double side) {
        this.side = side;
    }

    public void setSide(double i) {
        this.side = i;
    }

    public double getSide() {
        return side;
    }

    @Override
    public double getArea() {
        return Math.pow(this.side, 2);
    }

    @Override
    public double getPerimeter() {
        return 4 * this.side;
    }

    @Override
    public String type() {
        return this.type;
    }

    @Override
    public int numberParameters() {
        return PARAMETER;
    }


}
