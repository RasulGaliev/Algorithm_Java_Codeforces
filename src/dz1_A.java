import java.util.*;

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
        List<Integer> c = new ArrayList();
        for (int i = 0; i < n; i++) {
            c.add(a[i] - b[i]);
        }
        Collections.sort(c);
        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i];
        }
        int count = 0;
        for (int i = 0; i < n && sum > m; i++) {
            count = i + 1;
            sum -= c.get(n - i - 1);
        }
        System.out.println(sum > m ? -1 : count);
    }
}
