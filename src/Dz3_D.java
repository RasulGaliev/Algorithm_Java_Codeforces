import java.util.*;

public class Dz3_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] array = new int[n][n];

        for(int i = 0; i < n; i++)
            for(int j = 0;j < n; j++)
                array[i][j]=scanner.nextInt();

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                int a = 0, b = 0;
                if (i - 1 >= 0)
                    a = array[i - 1][j];
                if (j - 1 >= 0)
                    b = array[i][j - 1];
                array[i][j] = Math.max(a, b) + array[i][j];
            }
        }

        System.out.println(array[n - 1][n - 1]);
    }
}