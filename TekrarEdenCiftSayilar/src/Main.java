public class Main {

    static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] list = {1, 1, 5, 6, 6, 7, 7, 8, 8, 9, 9, 10, 10, 16, 16, 200, 200, 8, 8, 8};
        int[] duplicate = new int[list.length];
        int startIndex = 0;

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if ((i != j) && (list[i] == list[j] && (list[i] % 2 == 0))) {
                    if (!isFind(duplicate, list[i])) {
                        duplicate[startIndex++] = list[i];
                    }
                    break;
                }
            }
        }

        System.out.print("Tekrar eden çift sayılar: ");
        for (int value : duplicate) {
            if (value != 0) {
                System.out.print(value + " ");
            }
        }
    }
}