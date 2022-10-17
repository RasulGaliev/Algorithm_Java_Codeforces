import java.util.Scanner;
import java.util.Arrays;

public class Task1671B {
    public static void main(String[] args) {
        task1671B();
    }
    public static void task1671B() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            int size = in.nextInt();
            int[] array = new int[size];
            for(int j = 0; j < size; j++) {
                array[j] = in.nextInt();
            }
            int sum = 0;
            for (int j = 0; j < size - 1; j++) {
                sum += array[j + 1] - array[j];
            }
            System.out.println(sum > size + 1 ? "NO" : "YES");
        }
    }

}
