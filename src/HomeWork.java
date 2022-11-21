import java.io.IOException;
import java.util.*;

public class HomeWork {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> taxi = new ArrayList<>();

        for (int i = 0; i < n + m; i++) {
            list.add(scanner.nextInt());
        }
        for (int i = 0; i < n + m; i++) {
            if(scanner.nextInt() != 0) {
                taxi.add(list.get(i));
            }else {
                list1.add(list.get(i));
            }
        }
        int index = 0;

        int[] res = new int[taxi.size()];
        for (Integer integer : list1) {
            int min = Integer.MAX_VALUE;
            for (; index < taxi.size(); index++) {
                if (Math.abs(integer - taxi.get(index)) < min) {
                    min = Math.abs(integer - taxi.get(index));
                } else {
                    break;
                }
            }
            if (index != 0) {
                index--;
            }
            res[index]++;
        }
        for (int i = 0; i < taxi.size(); i++) {
            System.out.print(res[i] + " ");
        }
    }
}