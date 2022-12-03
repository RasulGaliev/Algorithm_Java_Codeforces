package Task;

import java.util.Scanner;

public class Task1526B {
    public static void main(String[] args) {
        task1526B();
    }
    public static void task1526B() {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int x = scanner.nextInt();
            boolean flag = false;
            int a = -1;
            while (x >= ++a * 111 && !flag)
                flag = (x - 111 * a) % 11 == 0;
            System.out.println(flag ? "YES" : "NO");
        }
    }
}
