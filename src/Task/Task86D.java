package Task;

import java.util.*;

public class Task86D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        int t = scanner.nextInt();
        List<Long> array = new ArrayList<>();
        long input;
        for (int i = 0; i < n; i++) {
            input = scanner.nextInt();
            array.add(input);
        }
        List<List<Integer>> subarray = new ArrayList<>();
        for (int i = 0; i < t; i++) {
            subarray.add(new ArrayList<>());
            subarray.get(i).add(i);
            subarray.get(i).add(scanner.nextInt() - 1);
            subarray.get(i).add(scanner.nextInt());
        }
        Collections. sort(subarray, new Comparator<List<Integer>>() {
            @Override
            public int compare(List<Integer> o1, List<Integer> o2) {
                if (o1.get(1) > o2.get(1) && o1.get(2) < o2.get(2))
                    return -1;
                if (o1.get(1) < o2.get(1) && o1.get(2) > o2.get(2))
                    return 1;
                return o1.get(2) - o1.get(1) - (o2.get(2) - o2.get(1));
            }
        });

        long sum = 0;

        long[] result = new long[t];
        Map<Long, Long> map = new TreeMap<>();
        for (int i = subarray.get(0).get(1); i < subarray.get(0).get(2); i++) {
            if (map.containsKey(array.get(i))) {
                sum -= Math.pow(map.get(array.get(i)), 2) * array.get(i);
                map.put(array.get(i), map.get(array.get(i)) + 1);
                sum += Math.pow(map.get(array.get(i)), 2) * array.get(i);

            } else {
                map.put(array.get(i), 1L);
                sum += array.get(i);
            }
        }
        int min, max;
        result[subarray.get(0).get(0)] = sum;
        for (int j = 1; j < t; j++) {
            if (subarray.get(j).get(1) < subarray.get(j - 1).get(1)) {
                min = Math.min(subarray.get(j - 1).get(1), subarray.get(j).get(2));
                for (int i = subarray.get(j).get(1); i < min; i++) {
                    if (map.containsKey(array.get(i))) {
                        sum -= Math.pow(map.get(array.get(i)), 2) * array.get(i);
                        map.put(array.get(i), map.get(array.get(i)) + 1);
                        sum += Math.pow(map.get(array.get(i)), 2) * array.get(i);
                    } else {
                        map.put(array.get(i), 1L);
                        sum += array.get(i);
                    }
                }
            } else if (subarray.get(j).get(1) > subarray.get(j - 1).get(1)) {
                min = Math.min(subarray.get(j).get(1), subarray.get(j - 1).get(2));
                for (int i = subarray.get(j - 1).get(1); i < min; i++) {
                    sum -= Math.pow(map.get(array.get(i)), 2) * array.get(i);
                    map.put(array.get(i), map.get(array.get(i)) - 1);
                    sum += Math.pow(map.get(array.get(i)), 2) * array.get(i);
                }
            }
            if (subarray.get(j).get(2) > subarray.get(j - 1).get(2)) {
                max = Math.max(subarray.get(j).get(1), subarray.get(j - 1).get(2));
                for (int i = max; i < subarray.get(j).get(2); i++) {
                    if (map.containsKey(array.get(i))) {
                        sum -= Math.pow(map.get(array.get(i)), 2) * array.get(i);
                        map.put(array.get(i), map.get(array.get(i)) + 1);
                        sum += Math.pow(map.get(array.get(i)), 2) * array.get(i);
                    } else {
                        map.put(array.get(i), 1L);
                        sum += array.get(i);
                    }
                }
            } else if (subarray.get(j).get(2) < subarray.get(j - 1).get(2)) {
                max = Math.max(subarray.get(j - 1).get(1), subarray.get(j).get(2));
                for (int i = max; i <subarray.get(j - 1).get(2); i++) {
                    sum -= Math.pow(map.get(array.get(i)), 2) * array.get(i);
                    map.put(array.get(i), map.get(array.get(i)) - 1);
                    sum += Math.pow(map.get(array.get(i)), 2) * array.get(i);
                }
            }
            result[subarray.get(j).get(0)] = sum;
        }
        for (int i = 0; i < t; i++) {
            System.out.println(result[i]);
        }
    }
}