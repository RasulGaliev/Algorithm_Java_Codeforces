import java.util.*;
import java.lang.Object;

public class dz1_D {
    public static void main(String[] args) {
        List<List<Integer>> lists = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int num;
        int size = k;
        List<Integer> sums = new ArrayList<>();
        int sum;
        while (size-- > 0) {
            int n = scanner.nextInt();
            List<Integer> list = new ArrayList<>();
            sum = 0;
            for (int j = 0; j < n; j++) {
                num = scanner.nextInt();
                sum += num;
                list.add(num);
            }
            sums.add(sum);
            lists.add(list);
        }

        Map<Integer, Map<Integer, List<Integer>>> map = new TreeMap<>();
        boolean flag = false;
        for (int i = 0; i < k && !flag; i++) {
            for (int j = 0; j < lists.get(i).size() && !flag; j++) {
                num = sums.get(i) - lists.get(i).get(j);
                if (map.containsKey(num)) {
                    for (Map.Entry<Integer, List<Integer>> elem : map.get(num).entrySet()) {
                        if (elem.getKey() != i) {
                            if (elem.getValue().get(0) != j || elem.getValue().size() > 1) {
                                int resultIndex1 = i + 1, resultIndex2 = elem.getKey() + 1;
                                int resultElem1 = j + 1;
                                int resultElem2 = (elem.getValue().get(0)) + 1;
                                if (elem.getValue().get(0) == j)
                                    resultElem2 = (elem.getValue().get(1));
                                flag = true;
                                 // System.out.println("sum1 " + sums.get(i));
                                 // System.out.println("sum2 " + sums.get(elem.getKey()));
                                 // System.out.println("a1 " + elem.getKey());
                                 // System.out.println("num " + num);
                                System.out.println("YES");
                                System.out.println(resultIndex1 + " " + resultElem1);
                                System.out.println(resultIndex2 + " " + resultElem2 );
                            }
                        } else if (map.get(num).size() == 1) {
                            List<Integer> newList = new ArrayList<>(map.get(num).get(i));
                            //newList = (List<Integer>) map.get(num).get(i).clone();
                            newList.add(j);
                            Map<Integer, List<Integer>> newMap = new TreeMap<>(map.get(num));
                            //newMap = (Map<Integer, List<Integer>>) map.get(num).clone();
                            newMap.put(i, newList);
                            map.put(num, newMap);
                        }
                    }
                } else {
                    map.put(num, Map.of(i, List.of(j)));
                }
            }
        }
        if (!flag) {
            System.out.println("NO");
        }
    }
}
