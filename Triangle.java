package figures;


public class Triangle implements Shape {
    public double leg1;
    public double leg2;
    public double hypotenuse;
    private final int PARAMETER = 3;
    public String type = "Triangle";

    public Triangle() {

    }

    public Triangle(double leg1, double leg2, double hypotenuse) {
        this.leg1 = leg1;
        this.leg2 = leg2;
        this.hypotenuse = hypotenuse;
    }

    public void setLeg1(double a) {
        this.leg1 = a;
    }

    public double getLeg1() {
        return leg1;
    }

    public void setLeg2(double b) {
        this.leg2 = b;
    }

    public double getLeg2() {
        return leg2;
    }

    public void setHypotenuse(double c) {
        this.hypotenuse = c;
    }

    public double getHypotenuse() {
        return hypotenuse;
    }

    @Override
    public double getArea() {
        return (this.leg1 * this.leg2) / 2;
    }

    @Override
    public double getPerimeter() {
        return this.leg1 + this.leg2 + this.hypotenuse;
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
