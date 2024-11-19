import java.util.Scanner;

public class Count_And_Replace_Char_In_String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = Integer.parseInt(scanner.nextLine());
        String inputString = scanner.nextLine();
        char charToCheck = scanner.nextLine().charAt(0);
        char charToReplace = scanner.nextLine().charAt(0);
        int count = 0;
        StringBuilder newString = new StringBuilder(inputString);

        for (int i = 0; i < length; i++) {
            if (inputString.charAt(i) == charToCheck) {
                count++;
                newString.setCharAt(i, charToReplace);
            }
        }
        System.out.println(count + " " + newString.toString());
        scanner.close();
    }
}