package figures;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.System.in;
import static java.lang.System.out;


public class Figures {

    public static void main(String[] args) throws Exception {

        List<Shape> list = new ArrayList<>();

        List<String> list1 = new ArrayList<>(Arrays.asList("Triangle", "Circle", "Square"));

        outputFigureSetOnScreen(list1);

        for (int i = 0; i < 10000; i++) {
            int c = Integer.parseInt(new BufferedReader(new InputStreamReader(in)).readLine());

            while (c > 2 || c < 0) {
                out.println("Input number from 0 to 2");
                c = Integer.parseInt(new BufferedReader(new InputStreamReader(in)).readLine());
            }

            if (c == 0) {
                Triangle triangle = new Triangle();
                double[] arr;
                System.out.println("Input " + triangle.numberParameters() + " parameters");
                int number = triangle.numberParameters();
                BufferedReader br;
                arr = new double[number];
                for (int j = 0; j < arr.length; j++) {
                    br = new BufferedReader(new InputStreamReader(in));
                    arr[j] = Double.parseDouble(br.readLine());
                    triangle.setLeg1(arr[0]);
                    triangle.setLeg2(arr[1]);
                    triangle.setHypotenuse(arr[2]);
                }
                list.add(triangle);
            }
            if (c == 1) {
                Circle circle = new Circle();
                double[] arr1;
                System.out.println("Input " + circle.numberParameters() + " parameters");
                int number = circle.numberParameters();
                BufferedReader br;
                arr1 = new double[number];
                for (int j = 0; j < arr1.length; j++) {
                    br = new BufferedReader(new InputStreamReader(in));
                    arr1[j] = Double.parseDouble(br.readLine());
                    circle.setRadious(arr1[j]);
                }
                list.add(circle);
            }
            if (c == 2) {
                Square square = new Square();
                double[] arr2;
                System.out.println("Input " + square.numberParameters() + " parameters");
                int number = square.numberParameters();
                BufferedReader br;
                arr2 = new double[number];
                for (int j = 0; j < arr2.length; j++) {
                    br = new BufferedReader(new InputStreamReader(in));
                    arr2[j] = Double.parseDouble(br.readLine());
                    square.setSide(arr2[j]);
                }
                list.add(square);
            }
            out.println("Do you want to input new shape? Input yes or no");
            String d = new BufferedReader(new InputStreamReader(in)).readLine();
            while (!(d.equals("yes") || d.equals("no"))) {
                out.println("Please Input yes or no");
                d = new BufferedReader(new InputStreamReader(in)).readLine();
            }
            if (d.equals("yes")) {
                outputFigureSetOnScreen(list1);
            } else if (d.equals("no")) {
                break;
            }
        }
        for (Shape f : list) {
            System.out.println("Figure is " + f.type() + ", Perimeter = " + f.getPerimeter() + ", Area = " + f.getArea());
        }
    }

    public static void outputFigureSetOnScreen(List<String> list1) {
        for (int j = 0; j < list1.size(); j++) {
            out.println(j + " : " + list1.get(j));
        }
        out.println("Input shape number that you want:");

    }


}














