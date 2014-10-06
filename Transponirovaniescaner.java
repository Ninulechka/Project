import java.util.Scanner;

public class Transponirovaniescaner {
    static Scanner sc = new Scanner(System.in);
    static int y[][] = new int[2][];
    static int ty[][] = new int[4][];
    public static void main(String args[]) {

        System.out.println("Введите массив y: ");
        for (int i = 0; i < y.length; i++) {
            y[i] = new int[4];
            for (int j = 0; j < y[i].length; j++) {
                System.out.println("Введите [" + i + "][" + j + "]-ый компонет массива y");
                y[i][j] = validationData(y[i][j]);
            }
            System.out.println();
        }
        System.out.println("Matrix: ");
        for (int i = 0; i < y.length; i++) {
            for (int j = 0; j < y[i].length; j++) {
                System.out.print(y[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < ty.length; i++) {
            ty[i] = new int[2];
            for (int j = 0; j < ty[i].length; j++) {
                ty[i][j] = y[j][i];
            }
        }
        System.out.println();

        System.out.println("Rezult: ");
        for (int i = 0; i < ty.length; i++) {
            for (int j = 0; j < ty[i].length; j++) {
                System.out.print(ty[i][j] + " ");
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






