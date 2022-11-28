import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, number;
        System.out.print("Dizinin boyutu n: ");
        n = input.nextInt();

        int[] list = new int[n];
        for(int i = 0; i < n; i++){
            System.out.print(i+1 + ". Elemanı: ");
            number = input.nextInt();
            list[i] = number;
        }

        Arrays.sort(list);
        System.out.println("Sıralama: " + Arrays.toString(list));
    }
}