import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Dz3_H {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int max = 0;
        int l = 0;
        int tmp;
        for (int i = 0; i < n; i++) {
            tmp = scanner.nextInt();
            if (tmp < 0 && tmp % 2 == 0) {
                l++;
            } else {
                if (max < l)
                    max = l;
                l = 0;
            }
        }
        if (max < l)
            max = l;
        System.out.println(max);
    }
}
