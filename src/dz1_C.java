import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class dz1_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        List<Integer> array = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            array.add(scanner.nextInt());
        }
        Collections.sort(array);
        int i;
        for (i = 0; i < array.size() && i < k - 1; i++);
        System.out.println(i == array.size() || array.get(i) != array.get(i + 1) ? array.get(i) : -1);

    }
}
