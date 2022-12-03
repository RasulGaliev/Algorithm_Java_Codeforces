package Task;

import java.util.*;

public class Task1637C {
    public static void main(String[] args) {
        task1637C();
    }
    public static void task1637C() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            int size = in.nextInt();
            int[] array = new int[size];
            for(int j = 0; j < size; j++) {
                array[j] = in.nextInt();
            }
            boolean flag = false;
            for (int j = 1; j < size - 1 && !flag; j++) {
                flag = array[j] != 1;
            }
            flag = flag && (size != 3 || array[1] % 2 != 1);
            long sum = 0;
            if (flag) {
                for (int j = 1; j < size - 1; j++) {
                    sum += Math.round(array[j] / 2.0);
                }
                System.out.println(sum);
            } else {
                System.out.println(-1);
            }
        }
    }
    /*public static void input(int[] array, Scanner in) {
        int size = in.nextInt();
        array = new int[size];
        for(int j = 0; j < size; j++) {
            array[j] = in.nextInt();
        }
    }
    public static void outMatrix(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(i != 2 ? array[i] + " " : array[i]);
        }
    }*/
}
