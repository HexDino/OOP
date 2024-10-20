import java.util.Scanner;
import java.math.BigInteger;

public class ADD_TWO_INTEGERS  {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            
            BigInteger a = scanner.nextBigInteger();
            BigInteger b = scanner.nextBigInteger();
            
            BigInteger sum = a.add(b);
            
            System.out.println(sum);
        }
    }
}
