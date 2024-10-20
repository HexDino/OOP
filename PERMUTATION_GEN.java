import java.util.Arrays;
import java.util.Scanner;

public class PERMUTATION_GEN  {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            int[] numbers = new int[n];
            for (int i = 0; i < n; i++) {
                numbers[i] = i + 1;
            }
            do {
                printPermutation(numbers);
            } while (nextPermutation(numbers));
        }
    }

    private static boolean nextPermutation(int[] numbers) {
        int i = numbers.length - 2;
        while (i >= 0 && numbers[i] >= numbers[i + 1]) {
            i--;
        }
        if (i < 0) {
            return false;
        }

        int j = numbers.length - 1;
        while (numbers[j] <= numbers[i]) {
            j--;
        }

        swap(numbers, i, j);
        reverse(numbers, i + 1, numbers.length - 1);
        return true;
    }

    private static void swap(int[] numbers, int i, int j) {
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }

    private static void reverse(int[] numbers, int start, int end) {
        while (start < end) {
            swap(numbers, start, end);
            start++;
            end--;
        }
    }

    private static void printPermutation(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i < numbers.length - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
