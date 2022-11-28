import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] list = {12, 50, 100, 2000, 3023};
        int number;
        Arrays.sort(list);
        System.out.println("Dizi: " + Arrays.toString(list));

        System.out.print("Girilen Sayı: ");
        Scanner input = new Scanner(System.in);
        number = input.nextInt();

        int[] copyList = Arrays.copyOf(list, list.length + 1);
        copyList[copyList.length - 1] = number;
        Arrays.sort(copyList);

        if (number <= copyList[0] || number >= copyList[copyList.length - 1]) {
            System.out.println("Girdiğiniz değer dizi değerlerinin dışında.");
        } else {
            for (int i = 0; i < copyList.length; i++) {
                if (copyList[i] == number && number > copyList[0] && number < copyList[copyList.length - 1]) {
                    System.out.println("Girilen sayıdan küçük en yakın sayı : " + copyList[i - 1]);
                    System.out.println("Girilen sayıdan büyük en yakın sayı : " + copyList[i + 1]);
                }
            }
        }
    }
}




