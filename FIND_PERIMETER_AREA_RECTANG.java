import java.util.Scanner;

public class FIND_PERIMETER_AREA_RECTANG {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
        
            int a = scanner.nextInt();
            int b = scanner.nextInt();
           
            int perimeter = 2 * (a + b);
            
            int area = a * b;
            
            System.out.println(perimeter + " " + area);
        }
    }
}
