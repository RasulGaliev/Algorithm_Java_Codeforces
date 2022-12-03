import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Dz3_G {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String str = scanner.next();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list1.add(str.charAt(i) - '0');
            list2.add(str.charAt(n + i) - '0');
        }
        Collections.sort(list1);
        Collections.sort(list2);
        boolean ye = false;
        boolean no = false;
        for (int i = 0; i < n; i++) {
            if (list1.get(i) <= list2.get(i)){
                ye = true;
            }
        }
        for (int i = 0; i < n; i++) {
            if (list1.get(i) >= list2.get(i)){
                no = true;
            }
        }
        if (!ye || !no)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
