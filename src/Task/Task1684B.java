package Task;

import java.util.Scanner;

public class Task1684B {
    public static void main(String[] args) {
        task1684B();
    }
    public static void task1684B() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] matrix = new int[n][3];
        in_matrix(n, matrix, in);
        int[][] newMatrix = new int[n][3];
        for (int i = 0; i < n; i++) {
            newMatrix[i][2] = matrix[i][2]; // z = c
            newMatrix[i][1] = matrix[i][2] + matrix[i][1]; // y = c + b
            newMatrix[i][0] = matrix[i][2] + matrix[i][1] + matrix[i][0]; // x = = c + b + a
        }
        outMatrix(n, newMatrix);
    }

   public static void in_matrix(int n, int[][] matrix, Scanner in) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++){
                matrix[i][j] = in.nextInt();
            }
        }
    }

    public static void outMatrix(int n, int[][] matrix) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++){
                System.out.print(j != 2 ? matrix[i][j] + " " : matrix[i][j]);
            }
            if (i != n - 1)
                System.out.println();
        }
    }
}
