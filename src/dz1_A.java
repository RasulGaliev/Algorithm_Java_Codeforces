import java.util.Arrays;
import java.util.Scanner;

public class dz1_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for(int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
            b[i] = scanner.nextInt();
        }
        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            c[i] = a[i] - b[i];
        }
        Arrays.sort(c);
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i];
        }
        int count = -1;
        for (int j = 0; j < n; j++) {
            if (sum <= m) {
                count = j;
                break;
            }
            sum -= c[n - j - 1];
        }
        System.out.println(count);
    }
}
