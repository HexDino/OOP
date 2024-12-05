import java.util.Scanner;

public class String_match {
    public static void String_match(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lengthLarge = Integer.parseInt(scanner.nextLine());
        String largeString = scanner.nextLine();
        int lengthSub = Integer.parseInt(scanner.nextLine());
        String subString = scanner.nextLine();
        StringBuilder positions = new StringBuilder();
        int index = largeString.indexOf(subString);

        while (index != -1) {
            positions.append(index).append(" ");
            index = largeString.indexOf(subString, index + 1);
        }

        System.out.println(positions.toString().trim());

        scanner.close();
    }
}