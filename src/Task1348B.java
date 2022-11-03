import java.util.*;

public class Task1348B {
    public static void main(String[] args) {
        task1348B();
    }
    public static void task1348B() {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        TreeSet<Integer> set;
        LinkedList<Integer> list = new LinkedList<Integer>();
        int n, k, m;
        int elem;
        int size = t;
        int l;
        while (size-- > 0) {
            n = scanner.nextInt();
            k = scanner.nextInt();
            set = new TreeSet<>();
            for (int i = 0; i < n; i++) {
                elem = scanner.nextInt();
                list.add(elem);
                set.add(elem);
            }
            l = 1;
            while (k > set.size()) {
                set.add(l++);
            }
            m = n * set.size();
            if (k == set.size()) {
                System.out.println(m);
                for (int i = 0; i < n; i++) {
                    for (int setElem : set) {
                        System.out.print(setElem + " ");
                    }
                }
                System.out.println();
            } else {
                System.out.println("-1");
            }
        }
    }
}
