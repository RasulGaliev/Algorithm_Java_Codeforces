import java.util.*;

public class Task1348B {
    public static void main(String[] args) {
        task1348B();
    }
    public static void task1348B() {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        Map<Integer, Integer> map;
        int n, k, m;
        int elem;
        int max = 0;
        while (t-- > 0) {
            n = scanner.nextInt();
            k = scanner.nextInt();
            map = new TreeMap<>();
            for (int i = 0; i < n; i++) {
                elem = scanner.nextInt();
                if (map.containsKey(elem))
                    map.put(elem, map.get(elem) + 1);
                else {
                    map.put(elem, 1);
                }
                if (map.get(elem) > max) {
                    max = map.get(elem);
                }
            }
            if (max <= map.size()) {
                m = (int)Math.ceil((n * 1.0) / k) * k;
                System.out.println(m);
                for (int i = 0; i < m;) {
                    for (Map.Entry<Integer, Integer> mapElem : map.entrySet()) {
                        System.out.print(mapElem.getKey() + " ");
                        i++;
                    }
                }
                System.out.println();
            } else {
                System.out.println("-1");
            }
        }
    }
}
