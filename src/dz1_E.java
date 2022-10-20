import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class dz1_E {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int size = scanner.nextInt();
            List<Integer> array = new ArrayList<>();
            List<Integer> resultArray = new ArrayList<>();
            for (int j = 0; j < size; j++) {
                array.add(scanner.nextInt());
            }
            Collections.sort(array);
            int j, l;
            for (j = 0, l = array.size() - 1; j < l; j++, l--) {
                resultArray.add(array.get(l));
                resultArray.add(array.get(j));
            }
            if (j == l)
                resultArray.add(array.get(j));
            for (int k = resultArray.size() - 1; k >= 0; k--){
                System.out.print(resultArray.get(k) + " ");
            }
            System.out.println();
        }
    }
}
