import java.util.*;

public class dz1_D {
    public static void main(String[] args) {
        List<Map<Integer, List<Integer>>> maps = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int num;
        int size = k;
        List<Integer> sums = new ArrayList<>();
        int sum;
        while(size-- > 0) {
            int n = scanner.nextInt();
            Map<Integer, List<Integer>> map = new TreeMap<>();
            sum = 0;
            for (int j = 0; j < n; j++) {
                num = scanner.nextInt();
                sum += num;
                if (map.containsKey(num)){
                    List<Integer> newArray = new ArrayList<>();
                    for (int l = 0; l < map.get(num).size(); l++) {
                        newArray.add(map.get(num).get(l));
                    }
                    newArray.add(j);
                    map.put(num, newArray);
                } else {
                    map.put(num, List.of(j));
                }

            }
            sums.add(sum);
            maps.add(map);
        }
        boolean flag = false;
        int thisKey;
        int resultIndex1 = 0, resultIndex2 = 0;
        int resultElem1 = 0, resultElem2 = 0;
        for (int i = 0; i < k && !flag; i++) {
            for (Map.Entry<Integer, List<Integer>> elem : maps.get(i).entrySet()) {
                for (int j = i + 1; j < k; j++) {
                    thisKey = elem.getKey()-(sums.get(i) - sums.get(j));
                    if ((maps.get(j).containsKey(thisKey) && (maps.get(j).get(thisKey).size() > 1 || elem.getValue().size() > 1 ||
                            !maps.get(j).get(thisKey).get(0).equals(elem.getValue().get(0))))) {
                        // System.out.println("sum1 " + sums.get(i));
                        // System.out.println("sum2 " + sums.get(j));
                        // System.out.println("a1 " + elem.getKey());
                        // System.out.println("thisKey " + thisKey);
                        resultIndex1 = i + 1;
                        resultIndex2 = j + 1;
                        if (!maps.get(j).get(thisKey).get(0).equals(elem.getValue().get(0))) {
                            resultElem2 = maps.get(j).get(thisKey).get(0) + 1;
                            resultElem1 = elem.getValue().get(0) + 1;
                        } else if(elem.getValue().size() > 1) {
                            resultElem2 = maps.get(j).get(thisKey).get(0) + 1;
                            resultElem1 = elem.getValue().get(2) + 1;
                        } else {
                            resultElem2 = maps.get(j).get(thisKey).get(1) + 1;
                            resultElem1 = elem.getValue().get(0) + 1;
                        }
                        flag = true;
                        break;
                    }
                }
                if (flag)
                    break;;
            }
        }
        if (flag) {
            System.out.println("YES");
            System.out.println(resultIndex1 + " " + resultElem1);
            System.out.println(resultIndex2 + " " + resultElem2);
        } else {
            System.out.println("NO");
        }
    }
}
