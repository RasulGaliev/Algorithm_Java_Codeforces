package KR3;

import java.util.*;

public class KR3_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        while (n-- > 0){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            int min = a <= b && a <= c ? a : b <= a && b <= c ? b : c;
            System.out.println(((a + b + c) % 9) != 0 ? "NO" : min >= (a + b + c) / 9 ? "YES" : "NO");
        }
    }
}