package KR3;

import java.util.*;

    public class KR3_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        int n = scanner.nextInt();

        List<List<Integer>> array = new ArrayList<>();
        for (int i = 0; i < n; i++)
            array.add(new ArrayList<>(List.of(scanner.nextInt(), scanner.nextInt())));

        Collections.sort(array, new Comparator<List<Integer>>() {
            @Override
            public int compare(List<Integer> o1, List<Integer> o2) {
                return o1.get(0) - o2.get(0);
            }
        });

        boolean flag = true;
        for (int i = 0; i < n && flag; i++) {
            flag = s > array.get(i).get(0);
            s += array.get(i).get(1);
        }
        System.out.println(flag ? "YES" : "NO");
    }
}