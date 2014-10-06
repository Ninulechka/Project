package figures;

public class Circle extends Figure1 implements Shape {
    public double radious;
    public double area;
    public double perimeter;
    public static String figure;

    int parameter = 1;

    public Circle() {
    }

    public void setRadipus(double i) {
        this.radious = i;
    }

    public double getRadious() {
        return radious;
    }

    /*public static String getFigure() {
        return figure;
    }

    public static void setFigure(String i) {
        figure = i;
    }
*/
    @Override
    public int numberParameters() {
        System.out.println("Input " + parameter + " parameters: ");
        return 1;
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
        this.area = Math.PI * Math.pow(this.radious, 2);
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
        this.perimeter = 2 * Math.PI * this.radious;
    }

    @Override
    public void showFigure() {
        System.out.println("Figure is Circle:");
        System.out.println("Radious = " + getRadious());
        System.out.println("Area = " + getArea());
        System.out.println("Perimeter = " + getPerimeter());
        System.out.println();
    }


}


