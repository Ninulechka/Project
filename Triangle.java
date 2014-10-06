package figures;


public class Triangle extends Figure1 implements Shape {
    public double leg1;
    public double leg2;
    public double hypotenuse;
    int parameter = 3;

    public Triangle() {

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
    public double area() {
        this.calculatedArea();
        return this.area;
    }

    public double getArea(){
        return area();
    }

    @Override
    public void calculatedArea() {
        this.area = (this.leg1 * this.leg2) / 2;
    }


    @Override
    public double perimeter() {
        this.calculatedPerimeter();
        return this.perimeter;
    }

    public double getPerimeter() {
        return perimeter();
    }

    @Override
    public void calculatedPerimeter() {

        this.perimeter = getLeg1() + getLeg2() + getHypotenuse();
    }

    @Override
    public void showFigure() {
        System.out.println("Figure is Triangle:");
        System.out.println("Leg1 = " + getLeg1());
        System.out.println("Leg2 = " + getLeg2());
        System.out.println("Hypotenuse = " + getHypotenuse());
        System.out.println("Area = " + getArea());
        System.out.println("Perimeter = " + getPerimeter());
        System.out.println();
    }

    @Override
    public int numberParameters() {
        System.out.println("Input " + parameter + " parameters: ");
        return 3;
    }
}
