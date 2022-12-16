package Task;

import java.util.*;

public class Task1324D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        for (int i = 0; i < n; i++)
            a.add(scanner.nextInt());
        for (int i = 0; i < n; i++)
            b.add(scanner.nextInt());
        List<List<Integer>> list = new ArrayList<>();
        list.add(new ArrayList<>());
        for (int i = 0; i < n; i++) {
            list.get(0).add(a.get(i) - b.get(i));
        }
        list.add(new ArrayList<>());
        for (int i = 0; i < n; i++) {
            list.get(0).add(b.get(i) - a.get(i));
        }
        Collections. sort(list, new Comparator<List<Integer>>() {
            @Override
            public int compare(List<Integer> o1, List<Integer> o2) {
                if (o1.get(1) > o2.get(1) && o1.get(2) < o2.get(2))
                    return -1;
                if (o1.get(1) < o2.get(1) && o1.get(2) > o2.get(2))
                    return 1;
                return o1.get(2) - o1.get(1) - (o2.get(2) - o2.get(1));
            }
        });
        int count = 0;
        int begin = 0;
        int end = n - 1;
        int marker;
        for (int i = 0; i < n; i++) {
            while (true) {
                marker = (begin + end) / 2;
                if (list.get(0).get(i) < list.get(1).get(0))
                    break;
                if (list.get(0).get(i) > list.get(1).get(n - 1)) {
                    count += n - 1;
                    break;
                }
                if (list.get(0).get(i) > list.get(1).get(marker) && list.get(0).get(i) <= list.get(1).get(marker + 1)) {
                    count += marker;
                    break;
                }
                if (i != 0 && list.get(0).get(i) > list.get(1).get(marker - 1) && list.get(0).get(i) <= list.get(1).get(marker)) {
                    count += marker - 1;
                    break;
                }
                if (list.get(0).get(i) > list.get(1).get(marker))
                    begin = marker;
                else
                    end = marker;

            }
        }
        System.out.println(count);
    }
}