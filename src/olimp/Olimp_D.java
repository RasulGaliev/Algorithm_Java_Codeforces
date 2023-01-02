package olimp;

import java.util.*;

public class Olimp_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> nums = new ArrayList<>();
        while (n-- > 0){
            nums.add(scanner.nextInt());
        }
        int q = scanner.nextInt();
        int start, d, count;
        while (q-- > 0) {
            start = scanner.nextInt() - 1;
            if (start >= nums.size() - 2){
                System.out.println(0);
                continue;
            }
            d = nums.get(start + 1) - nums.get(start);
            count = 0;
            for (int i = start + 1; i < nums.size() - 1; i++) {
                d *= 2;
                if (d < nums.get(i + 1) - nums.get(i)){
                    d = nums.get(i + 1) - nums.get(i);
                    count++;
                    if (i >= nums.size() - 2)
                        break;
                }
            }
            System.out.println(count);
        }
    }
}