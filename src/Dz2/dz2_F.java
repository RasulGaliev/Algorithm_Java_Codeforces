package Dz2;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class dz2_F {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        for (int i = 0; i < n1; i++) {
            set.add(scanner.next());
        }
        String str;
        int unique1;
        int unique2 = 0;
        int repetitive = 0;
        for (int i = 0; i < n2; i++) {
            str = scanner.next();
            if (set.contains(str)) {
                repetitive++;
            } else {
                unique2++;
            }
        }
        unique1 = set.size() - repetitive;
        double value = repetitive % 2;
            System.out.println(unique1 + value > unique2 ? "YES" : "NO");
        // System.out.println(unique1 + " " + unique2 + " " + repetitive);
    }
}
