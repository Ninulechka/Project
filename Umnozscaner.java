import java.util.Scanner;

public class Umnozscaner {
    static Scanner sc = new Scanner(System.in);
    static int[][] matrix2 = new int[3][4];
    static int[][] result = new int[2][3];
    static int[][] matrix1 = new int[4][2];
    public static void main(String args[]) {

        for (int i = 0; i < result.length; i++) result[i] = new int[3];

        System.out.println("Введите массив matrix2: ");
        for (int i = 0; i < matrix2.length; i++) {
            matrix2[i] = new int[4];
            for (int j = 0; j < matrix2[i].length; j++) {
                System.out.println("Введите [" + i + "][" + j + "]-ый компонет массива y");
                matrix2[i][j] = validationData(matrix2[i][j]);
            }
            System.out.println();
        }
        System.out.println("Matrix2: ");
        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Введите массив matrix1: ");
        for (int i = 0; i < matrix1.length; i++) {
            matrix1[i] = new int[2];
            for (int j = 0; j < matrix1[i].length; j++) {
                System.out.println("Введите [" + i + "][" + j + "]-ый компонет массива y");
                matrix1[i][j] = validationData(matrix1[i][j]);
            }
        }
        System.out.println("Matrix1: ");
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < matrix1[i].length; i++) {
            for (int j = 0; j < matrix2.length; j++) {
                for (int l = 0; l < matrix2[i].length; l++) {
                    result[i][j] += matrix1[l][i] * matrix2[j][l];
                }
            }
        }
        System.out.println();
        System.out.println("Result: ");
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
    static int validationData(int a) {
        boolean Isa = true;
        do {
            if (sc.hasNextInt()) {
                a = sc.nextInt();
                Isa = true;
            } else {
                System.out.println("Введите число!!!\n");
                Isa = false;
                sc.next();
            }
        } while (!(Isa));
        return a;
    }
}