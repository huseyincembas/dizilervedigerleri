import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Satir sayisi : ");
        int a = input.nextInt();
        System.out.print("Sutun sayisi : ");
        int b = input.nextInt();
        String[][] alan = MineSweeper.mayinTarlasiAlani(a, b);
        String[][] bosAlan = MineSweeper.bosAlan(a, b);
        MineSweeper.print(bosAlan);

//        MineSweeper.print(alan);

        MineSweeper.check(alan, bosAlan, a, b);
    }
}