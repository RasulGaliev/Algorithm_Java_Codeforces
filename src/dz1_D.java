import java.util.*;

public class dz1_D {
    public static void main(String[] args) {
        List<List<Long>> lists = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        long num;
        int size = k;
        List<Long> sums = new ArrayList<>();
        long sum;
        while (size-- > 0) {
            int n = scanner.nextInt();
            List<Long> list = new ArrayList<>();
            sum = 0;
            for (int j = 0; j < n; j++) {
                num = scanner.nextInt();
                sum += num;
                list.add(num);
            }
            sums.add(sum);
            lists.add(list);
        }
        Map<Long, List<Integer>> map = new TreeMap<>();
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < lists.get(i).size(); j++) {
                num = sums.get(i) - lists.get(i).get(j);
                if (map.containsKey(num)) {
                    if (map.get(num).get(0) != i) {
                        System.out.println("YES");
                        System.out.println((i + 1) + " " + (j + 1));
                        System.out.println((map.get(num).get(0) + 1) + " " + (map.get(num).get(1) + 1));
                        return;
                    }
                } else {
                    map.put(num, List.of(i, j));
                }
            }
        }
        System.out.println("NO");
    }
}