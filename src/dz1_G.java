import java.util.Arrays;
import java.util.Scanner;

public class dz1_G {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        boolean even = false;
        boolean uneven = false;
        for (int i = 0; i < array.length && (!even || !uneven); i++) {
            if (array[i] % 2 == 0)
                even = true;
            else
                uneven = true;
        }
        if (even && uneven)
            Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

}
