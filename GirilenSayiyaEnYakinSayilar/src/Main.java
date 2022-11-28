import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] list = {12, 50, 100, 2000, 3023};
        int number, closeSmallN = 0, closeBigN = 0;
        System.out.println("Dizi: " + Arrays.toString(list));

        System.out.print("Girilen Sayı: ");
        Scanner input = new Scanner(System.in);
        number = input.nextInt();

        Arrays.sort(list);

        for (int i : list) {
            if (number > i) {
                closeSmallN = i;
            }
            if (number < i) {
                closeBigN = i;
                break;
            }
        }
        System.out.println("Girilen sayıdan küçük en yakın sayı: " + closeSmallN );
        System.out.println("Girilen sayıdan büyük en büyük sayı: " + closeBigN);
    }
}




