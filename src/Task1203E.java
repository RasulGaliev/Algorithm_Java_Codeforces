import java.util.*;

public class Task1203E {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++)
            list.add(scanner.nextInt());
        Collections.sort(list);
        Set<Integer> set = new HashSet<>();
        int temp;
        for (int i = 0; i < list.size(); i++) {
            temp = list.get(i);
            if (set.contains(temp - 1) || temp == 1) {
                if (!set.contains(temp))
                    set.add(temp);
                else if (!set.contains(temp + 1))
                    set.add(temp + 1);
            } else {
                set.add(temp - 1);
            }
        }
        System.out.println(set.size());
    }
}
