package figures;

public class Circle implements Shape {
    public double radious;
    private String type = "Circle";


    private final int PARAMETER = 1;


    Circle(double radious) {
        this.radious = radious;
    }

    Circle() {

    }

    public void setRadious(double radious) {
        this.radious = radious;
    }

    public double getRadious() {
        return radious;
    }

    @Override
    public int numberParameters() {
        return PARAMETER;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(this.radious, 2);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * this.radious;
    }

    @Override
    public String type() {
        return this.type;
    }
}


