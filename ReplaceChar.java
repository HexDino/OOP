import java.util.*;

public class ReplaceChar {
    static int n;
    static int[] a;
    static List<String> results = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        a = new int[n];
        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        if(n % 2 != 0) {
            System.out.println(-1);
            return;
        }

        backtrack(0, 0, new StringBuilder());

        if(results.isEmpty()) {
            System.out.println(-1);
        } else {
            System.out.println(String.join(" ", results));
        }
    }

    static void backtrack(int index, int balance, StringBuilder current) {
        if(balance < 0) {
            return;
        }

        if(index == n) {
            if(balance == 0) {
                results.add(current.toString());
            }
            return;
        }

        if(a[index] == 1) {
            current.append("1");
            backtrack(index + 1, balance + 1, current);
            current.deleteCharAt(current.length() - 1);
        } else if(a[index] == 2) {
            current.append("2");
            backtrack(index + 1, balance - 1, current);
            current.deleteCharAt(current.length() - 1);
        } else if(a[index] == 0) {
            current.append("1");
            backtrack(index + 1, balance + 1, current);
            current.deleteCharAt(current.length() - 1);

            if(balance > 0) {
                current.append("2");
                backtrack(index + 1, balance - 1, current);
                current.deleteCharAt(current.length() - 1);
            }
        }
    }
}