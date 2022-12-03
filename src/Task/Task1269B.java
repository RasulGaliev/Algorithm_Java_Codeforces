package Task;

import java.util.*;

public class Task1269B {
    public static void main(String[] args) {
        task1269B();
    }
    public static void task1269B() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        List<Integer> a = new ArrayList<>();
        Map<Integer, Integer> b = new TreeMap<>();
        for (int i = 0; i < n; i++)
            a.add(scanner.nextInt());
        int inn;
        for (int i = 0; i < n; i++) {
            inn = scanner.nextInt();
            if (b.containsKey(inn))
                b.put(inn, b.get(inn) + 1);
            else
                b.put(inn, 1);
        }
        Map<Integer, Integer> new_a;
        int x = 0;
        int check = -1;
        while(true) {
            new_a = new TreeMap<>();
            for (int i = 0; i < a.size(); i++) {
                check = (a.get(i) + x) % m;
                if (new_a.containsKey(check))
                    new_a.put(check, new_a.get(check) + 1);
                else
                    new_a.put(check, 1);
            }
            if (new_a.equals(b))
                break;
            x++;
        }

        System.out.println(x);
    }
}
