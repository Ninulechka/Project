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
        Triangle tr = new Triangle();
        Circle cir = new Circle();
        Square sq = new Square();

        List<String> list = new ArrayList<>();

        List<String> list1 = new ArrayList<>(Arrays.asList("Triangle", "Circle", "Square"));

        outputFigureSetOnScreen(list1);

        for (int i = 0; i < 10000; i++) {
            int c = Integer.parseInt(new BufferedReader(new InputStreamReader(in)).readLine());

            while (c > 2 || c < 0) {
                out.println("Input number from 0 to 2");
                c = Integer.parseInt(new BufferedReader(new InputStreamReader(in)).readLine());
            }

            if (c == 0) {
                list.add("Triangle");
                double[] arr;
                int number = tr.numberParameters();
                BufferedReader br;
                arr = new double[number];
                for (int j = 0; j < arr.length; j++) {
                    br = new BufferedReader(new InputStreamReader(in));
                    arr[j] = Double.parseDouble(br.readLine());
                }
                tr.leg1 = arr[0];
                tr.leg2 = arr[1];
                tr.hypotenuse = arr[2];
            }
            if (c == 1) {
                list.add("Circle");
                double[] arr1;
                int number = cir.numberParameters();
                BufferedReader br;
                arr1 = new double[number];
                for (int j = 0; j < arr1.length; j++) {
                    br = new BufferedReader(new InputStreamReader(in));
                    arr1[j] = Double.parseDouble(br.readLine());
                    cir.radious = arr1[j];
                }
            }
            if (c == 2) {
                list.add("Square");
                double[] arr2;
                int number = sq.numberParameters();
                BufferedReader br;
                arr2 = new double[number];
                for (int j = 0; j < arr2.length; j++) {
                    br = new BufferedReader(new InputStreamReader(in));
                    arr2[j] = Double.parseDouble(br.readLine());
                    sq.side = arr2[j];
                }
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
        Object[] array = list.toArray();
        for (int j = 0; j < array.length; j++) {
            if (array[j].equals("Triangle")) {
                tr.showFigure();
            }
            if (array[j].equals("Circle")) {
                cir.showFigure();
            }
            if (array[j].equals("Square")) {
                sq.showFigure();
            }
        }
    }

    public static void outputFigureSetOnScreen(List<String> list1) {
        for (int j = 0; j < list1.size(); j++) {
            out.println(j + " : " + list1.get(j));
        }
        out.println("Input shape number that you want:");

    }
}














