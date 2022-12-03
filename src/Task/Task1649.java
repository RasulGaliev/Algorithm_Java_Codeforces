package Task;

import java.util.Scanner;

public class Task1649 {
    public static void main(String[] args) {
        task16749();
    }
    public static void task16749() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            int size = in.nextInt();
            int[] array = new int[size];
            for(int j = 0; j < size; j++) {
                array[j] = in.nextInt();
            }
            int maxIndex = 0;
            for (int j = 1; j < size; j++) {
                if (array[j] > array[maxIndex])
                    maxIndex = j;
            }
            long sum = 0;
            for (int j = 0; j < size; j++) {
                if (j != maxIndex)
                    sum += array[j];
            }
            long k;
            if (array[maxIndex] == 0 && sum == 0)
                k = 0;
            else if (array[maxIndex] - sum < 1)
                k = 1;
            else
                k = array[maxIndex] - sum;
            System.out.println(k);
        }
    }

}
