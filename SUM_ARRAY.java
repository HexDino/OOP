import java.util.Scanner;

public class SUM_ARRAY  {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            
            int sum = 0;
            
            for (int i = 0; i < n; i++) {
                int ai = scanner.nextInt();
                sum += ai;
            }
            
            System.out.println(sum);
        }
    }
}
