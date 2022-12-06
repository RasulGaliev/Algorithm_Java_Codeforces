import java.util.Scanner;

public class Dz3_L {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        int m = scanner.nextInt();
        int[] a = new int[str.length()];
        a[0] = 0;
        for (int i = 1; i < a.length; ++i) {
            a[i] = a[i - 1] + str.charAt(i) == str.charAt(i - 1) ? 1 : 0;
        }
        for (int i = 0; i < m; i++) {
            int begin = scanner.nextInt();
            int end = scanner.nextInt();
            System.out.println(a[end - 1] - a[begin - 1]);
        }
    }
}
