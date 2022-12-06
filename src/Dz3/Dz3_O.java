package Dz3;

import java.util.Scanner;

public class Dz3_O {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] array = new int[n][m];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                array[i][j] = scanner.nextInt();

        int max = Integer.MIN_VALUE;
        int elem;
        for (int i = 0; i < n; i++) {
            elem = Integer.MAX_VALUE;
            for (int j = 0; j < m; j++)
                elem = Math.min(elem, array[i][j]);
            max = Math.max(max, elem);
        }
        System.out.println(max);
    }

}
