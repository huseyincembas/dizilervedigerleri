import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int row, column;
        System.out.print("Matrisin satır sayısını giriniz: ");
        row = input.nextInt();
        System.out.print("Matrisin sütun sayısını giriniz: ");
        column = input.nextInt();

        int[][] matris = new int[row][column];
        int[][] transpoze = new int[column][row];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("Matrisin " + (i + 1) + ". satır ve " + (j + 1) + ". sütun değerini giriniz: ");
                matris[i][j] = input.nextInt();
            }
        }

        System.out.println();
        System.out.println("Matris: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(matris[i][j] + " ");
            }
            System.out.println(" ");
        }

        System.out.println();
        System.out.println("Transpoze: ");

        for (int i = 0; i < column; i++) {
            for (int j = 0; j < row; j++) {
                transpoze[i][j] = matris[j][i];
                System.out.print(transpoze[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}