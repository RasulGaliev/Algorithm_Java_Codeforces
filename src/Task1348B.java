import java.util.*;

public class Task1348B {
    public static void main(String[] args) {
        task1348B();
    }
    public static void task1348B() {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        Map<Integer, Integer> map;
        LinkedList<Integer> list = new LinkedList<Integer>();
        int n, k, m;
        int elem;
        int size = t;
        while (size-- > 0) {
            n = scanner.nextInt();
            k = scanner.nextInt();
            map = new TreeMap<>();
            for (int i = 0; i < n; i++) {
                elem = scanner.nextInt();
                list.add(elem);
            }
            for (int listElem : list) {
                if (map.containsKey(listElem))
                    map.put(listElem, map.get(listElem) + 1);
                else {
                    map.put(listElem, 1);
                }
            }
            m = n * k;
            System.out.println(k + " " + n);
            if (k <= map.size()) {
                System.out.println(m);
                for (int i = 0; i < n; i++) {
                    for (Map.Entry<Integer, Integer> mapElem : map.entrySet()) {
                        System.out.print(mapElem.getKey() + " ");
                    }
                }
                System.out.println();
            } else {
                System.out.println("-1");
            }
        }
    }
}
