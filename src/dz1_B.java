import java.util.Scanner;

public class dz1_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int size = scanner.nextInt();
            size++;
            int[] x = new int[size];
            int[] y = new int[size];
            x[0] = 0;
            y[0] = 0;
            for (int j = 0; j < size - 1; j++) {
                x[j] = scanner.nextInt();
                y[j] = scanner.nextInt();
            }
            my_sort(x, y);
            if (checkSort(y)) {
                System.out.println("YES");
                for (int j = 0; j < size - 1; j++) {
                    for (int k = x[j]; k < x[j + 1]; k++) {
                        System.out.print('R');
                    }
                    for (int k = y[j]; k < y[j + 1]; k++) {
                        System.out.print('U');
                    }
                }
            } else {
                System.out.print("NO");
            }
        }
    }
    public static void my_sort(int[] x, int[] y) {
        boolean needIteration = true;
        while (needIteration) {
            needIteration = false;
            for (int i = 1; i < x.length; i++) {
                if (x[i] < x[i - 1] || x[i] == x[i - 1] && y[i] < y[i - 1]) {
                    swap(x, y, i, i-1);
                    needIteration = true;
                }
            }
        }
    }
    private static void swap(int[] x, int[] y, int ind1, int ind2) {
        int tmp = x[ind1];
        x[ind1] = x[ind2];
        x[ind2] = tmp;
        tmp = y[ind1];
        y[ind1] = y[ind2];
        y[ind2] = tmp;
    }
    public static boolean checkSort(int[] array) {
        int i;
        for (i = 0; i < array.length - 2 && array[i] <= array[i + 1]; i++);
        return i == array.length - 2 && array[i] < array[i + 1];
    }
    /* public static boolean checkSort(int[] array) {
        boolean flag = true;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                flag = false;
                break;
            }
        }
        return flag;
    }*/

}
