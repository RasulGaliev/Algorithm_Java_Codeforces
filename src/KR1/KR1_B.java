package KR1;
import java.util.*;

public class KR1_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {

            List<List<Integer>> list = new ArrayList<>();
            int n = scanner.nextInt();
            for (int j = 0; j < n; j++) {
                List<Integer> number = new ArrayList<>();
                number.add(scanner.nextInt());
                number.add(j);
                list.add(number);
            }
            if(n == 1){
                System.out.println(-1);
                continue;
            }
            list.sort(new Comparator<List<Integer>>() {
                @Override
                public int compare(List<Integer> o1, List<Integer> o2) {
                    if (o1.get(0).equals(o2.get(0)) && !o1.get(1).equals(o2.get(1))) {
                        return o1.get(1) - o2.get(1);
                    }
                    return o1.get(0) - o2.get(0);
                }
            });
            int min = Integer.MAX_VALUE;
            for (int j = 1; j < n; j++) {
                if (list.get(j).get(0).equals(list.get(j - 1).get(0))
                        && min > (list.get(j).get(1) + 1) - (list.get(j - 1).get(1) + 1)){
                    min = (list.get(j).get(1) + 1) - (list.get(j - 1).get(1) + 1);
                }
            }
            System.out.println(min == Integer.MAX_VALUE ? -1 : min + 1);
        }
    }
}