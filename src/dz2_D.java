import java.util.*;

public class dz2_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < a; i++) {
            list.add(scanner.nextInt());
        }
        Collections.sort(list);
        int i, left, right;
        int t = scanner.nextInt();
        while (t-- > 0){
            int key = scanner.nextInt();
            if (list.size() > 2 && key == list.get(list.size()-1) && key != list.get(list.size()-2)){
                System.out.println(list.size() - 1);
                continue;
            }
            if (key > list.get(list.size()-1)){
                System.out.println(list.size());
                continue;
            }
            if (key <= list.get(0)) {
                System.out.println(0);
                continue;
            }
            i = 0;
            left = 0;
            right = list.size() - 1;
            while (left <= right) {
                int mid = left  + ((right - left) / 2);
                if (mid < a - 1 && list.get(mid) < key && key <= list.get(mid + 1)) {
                    i = mid + 1;
                    break;
                }if (list.get(mid) < key) {
                    left = mid + 1;
                } else if (list.get(mid) >= key) {
                    right = mid - 1;
                }
            }
            if (i < 0)
                i = 0;
            System.out.println(i);
        }
    }
}