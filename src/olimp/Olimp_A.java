package olimp;

import java.util.Scanner;

public class Olimp_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String str = scanner.next();
        char[] array = new char[200];
        int max = 0;
        for (int i = 0; i < n; i++)
            max = Math.max(max, ++array[str.charAt(i)]);
        System.out.println(n - max);
    }
}
