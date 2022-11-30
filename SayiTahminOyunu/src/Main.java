import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(100);

        Scanner input = new Scanner(System.in);
        int due = 5;
        int selected;
        int[] guess = new int[5];
        boolean isWin = false;

        for (int i = 0; i < due; i++) {
            System.out.print("Lütfen tahmininizi giriniz: ");
            selected = input.nextInt();
            guess[i] = selected;
            if (selected >= 100 || selected <= 0) {
                System.out.println("Girdiğiniz sayı 0 ve 100 arasında değil! Lütfen doğru aralıkta tahmin yapınız.");
                i--;
                System.out.println("Kalan hakkınız: " + (due - i - 1));
                continue;
            }

            if (selected > 0 && selected < 100) {
                if (number < selected) {
                    System.out.println("Girdiğiniz değer ulaşmaya çalıştığınız değerden büyük.");
                } else if (number > selected) {
                    System.out.println("Girdiğiniz değer ulaşmaya çalıştığınız değerden küçük.");
                } else {
                    System.out.println("Doğru sayıya ulaştınız.!!");
                    isWin = true;
                    break;
                }
                System.out.println("Kalan hakkınız: " + (due - i - 1));
            }
        }

        if (isWin) {
            System.out.println("Tahminleriniz: " + Arrays.toString(guess));
        } else {
            System.out.println("Tahminleriniz: " + Arrays.toString(guess));
            System.out.println("Ulaşmaya çalıştığınız sayı: " + number);
            System.out.println("Malesef kaybettiniz!");
        }
    }
}