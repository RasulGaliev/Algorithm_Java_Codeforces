import java.util.*;

public class dz2_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        List<Integer> x = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            x.add(scanner.nextInt());
        }

        int q = scanner.nextInt();
        ArrayList<Integer> m = new ArrayList<>();
        for (int i = 0; i < q; i++) {
            m.add(scanner.nextInt());
        }

        Collections.sort(x);

        int left, right;
        int middle;
        for (int i = 0; i < q; i++) {
            left = 0;
            right = x.size() - 1;
            do {
                middle = (left + right) / 2;
                if (x.get(middle) <= m.get(i) && (middle == n - 1 || x.get(middle + 1) > m.get(i))) {
                    System.out.println(middle + 1);
                    break;
                } else if (x.get(middle) > m.get(i) && middle == 0) {
                    System.out.println(middle);
                    break;
                } else if (x.get(n - 1) <= m.get(i)) {
                    System.out.println(n);
                    break;
                } else if (x.get(middle) <= m.get(i)) {
                    left = middle;
                } else {
                    right = middle;
                }
            } while (left <= right);
        }
    }
}
