import java.util.Scanner;

public class Inversiyascaner {
    static int[][] matrix1 = new int[2][2];
    static Scanner sc = new Scanner(System.in);

    public static void main(String ars[]) {

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
        System.out.println("Matrix 2: ");
        for (int i = 0; i < (matrix1.length / 2); i++) {
            int[] hold = matrix1[(matrix1.length - 1) - i];
            matrix1[(matrix1.length - 1) - i] = matrix1[i];
            matrix1[i] = hold;
            for (int j = 0; j < matrix1[i].length; j++) {
            }
        }
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                System.out.print(matrix1[i][j] + "  ");
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



