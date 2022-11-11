import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class dz2_J {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Map<String, Integer> map = new HashMap<>();
        map.put("polycarp", 1);
        int max = 1;
        String name1, name2;
        int count;
        for (int i = 0; i < n; i++) {
            name1 = scanner.next().toLowerCase();
            scanner.next();
            name2 = scanner.next().toLowerCase();
            count = map.get(name2) + 1;
            map.put(name1, count);
            if (count > max)
                max = count;
        }
        System.out.println(max);
    }
}
