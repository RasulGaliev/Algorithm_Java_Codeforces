import java.util.*;

public class dz2_G {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(scanner.next());
        }
        Set<String> set = new TreeSet<>();
        String str;
        for (int i = list.size() - 1; i >=0; i--) {
            str = list.get(i);
            if (!set.contains(str)) {
                set.add(str);
                System.out.println(str);
            }
        }
    }

}
