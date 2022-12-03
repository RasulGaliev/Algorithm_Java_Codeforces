import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Dz3_J {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextInt();
        int m = scanner.nextInt();
        Set<Integer> x = new HashSet<>();
        Set<Integer> y = new HashSet<>();
        for (int i = 0; i < m; i++) {
            x.add(scanner.nextInt());
            y.add(scanner.nextInt());
            long c = x.size() * n + y.size() * n - (long) x.size() * y.size();
            System.out.print(n * n - c + " ");
        }
    }
}
