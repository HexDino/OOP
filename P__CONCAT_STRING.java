import java.util.Scanner;

public class P__CONCAT_STRING  {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int length1 = Integer.parseInt(scanner.nextLine());
        String string1 = scanner.nextLine();
        int length2 = Integer.parseInt(scanner.nextLine());
        String string2 = scanner.nextLine();
        int k = Integer.parseInt(scanner.nextLine());
        int t = Integer.parseInt(scanner.nextLine());
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < k; i++) {
            result.append(string1);
        }
        for (int i = 0; i < t; i++) {
            result.append(string2);
        }
        System.out.println(result.toString());
        scanner.close();
    }
}