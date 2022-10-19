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
        if (k < array.get(0) && array.get(0) == 1)
            System.out.println(-1);
        else if (k < array.get(0))
            System.out.println(1);
        else if (k == array.size() || array.get(k - 1) != array.get(k))
            System.out.println(array.get(k - 1));
        else
            System.out.println(-1);
    }
}