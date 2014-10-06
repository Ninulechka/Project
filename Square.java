package figures;


public class Square extends Figure1 implements Shape {
    public double side;
    public double area;
    public double perimeter;
    int parameter = 1;

    public Square() {

           }

    public void setSide(double i) {
        this.side = i;
    }

    public double getSide() {
        return side;
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
        this.area = Math.pow(this.side, 2);
    }

    @Override
    public double perimeter() {
        calculatedPerimeter();
        return this.perimeter;
    }

    public double getPerimeter() {
        return perimeter();
    }

    @Override
    public void calculatedPerimeter() {
        this.perimeter = 4 * this.side;
    }


    @Override
    public void showFigure() {
        System.out.println("Figure is Square:");
        System.out.println("Side = " + side);
        System.out.println("Area = " + getArea());
        System.out.println("Perimeter = " + getPerimeter());
        System.out.println();
    }

    @Override
    public int numberParameters() {
        System.out.println("Input " + parameter + " parameters: ");
        return 1;
    }

}
