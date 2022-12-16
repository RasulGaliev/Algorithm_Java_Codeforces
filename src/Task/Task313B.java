package Task;

import java.util.Scanner;

public class Task313B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        int n = str.length();
        int k = 0;
        int[] array = new int[n - 1];
        for (int i = 0; i < n - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1))
                k++;
            array[i] = k;
        }
        int t = scanner.nextInt();
        while (t-- > 0) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            if (x == 1)
                System.out.println(array[y - 2]);
            else
                System.out.println(array[y - 2] - array[x - 2]);
        }
    }
}
