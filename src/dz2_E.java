import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class dz2_E {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int t = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        int prev = 0;
        for (int i = 0; i < a; i++) {
            list.add(prev + (scanner.nextInt() * scanner.nextInt()));
            prev = list.get(i);
        }

        while (t-- > 0) {
            int key = scanner.nextInt();
            int index = 1;

            int low = 0;
            int high = list.size() - 1;
            while (low <= high) {
                int mid = low + ((high - low) / 2);
                if (list.get(mid) == key || list.get(mid) > key && (mid == 0 || list.get(mid - 1) < key)) {
                    index = mid + 1;
                    break;
                } else if (list.get(mid) < key ) {
                    low = mid + 1;
                    index = mid + 2;
                } else if (list.get(mid) > key) {
                    high = mid - 1;
                    index = mid + 1;
                }
            }
            System.out.println(index);
        }
    }
}
