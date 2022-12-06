import java.util.Scanner;

public class Dz3_K {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String str = scanner.next();
        int open = 0;
        int close = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(')
                open++;
            else
                close++;
            if (close > open + 1) {
                System.out.print("No");
                return;
            }
        }
        System.out.print(open == close ? "Yes" : "No");
    }
}
