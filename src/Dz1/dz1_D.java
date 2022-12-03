package Dz1;

import java.util.*;

public class dz1_D {
    public static void main(String[] args) {
        List<Map<Integer, List<Integer>>> maps = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int num;
        int size = k;
        while(size-- > 0){
            int n = scanner.nextInt();
            Map<Integer, List<Integer>> map = new TreeMap<>();
            for (int i = 0; i < n; i++) {
                num = scanner.nextInt();
                if (map.containsKey(num)){
                    map.get(num).add(i);
                } else {
                    map.put(scanner.nextInt(), List.of(i));
                }
            }
            maps.add(map);
        }
    }
}
