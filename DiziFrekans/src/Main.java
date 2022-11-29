import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] list = {0, 0, 0, 0, 0, 41, 60, 71, 71, 71, 71, 85, 85, 2, 9, 6, 3, 5, 5, 5};
        int index = 1;
        Arrays.sort(list);

        System.out.println("Tekrar sayıları");
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if (j != i && list[j] == list[i]) {
                    index++;
                    i++;
                }
            }
            System.out.println(list[i] + " sayısı " + index + " kere tekrar edildi.");
            index = 1;
        }
    }
}