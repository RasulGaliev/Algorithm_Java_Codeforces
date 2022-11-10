import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class dz2_C {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double s = scanner.nextDouble();
        double [][] matrix = new double[n][2];
        double  x, y;
        for (int i = 0; i < n; i++) {
            x = scanner.nextDouble();
            y = scanner.nextDouble();
            matrix[i][0] = Math.sqrt(x * x + y * y);
            matrix[i][1] = scanner.nextDouble();
        }
        boolean needIteration = true;
        while (needIteration) {
            needIteration = false;
            for (int i = 1; i < n; i++) {
                if (matrix[i][0] < matrix[i - 1][0]) {
                    double[] tmp = matrix[i];
                    matrix[i] = matrix[i - 1];
                    matrix[i - 1] = tmp;
                    needIteration = true;
                }
            }
        }
        if (s >= 1000000){
            System.out.println(0);
            return;
        }
        boolean p = false;
        for (int i = 0; i < n; i++) {
            s += matrix[i][1];
            if (s >= 1000000){
                System.out.println(matrix[i][0]);
                p = true;
                break;
            }
        }
        if (!p)
            System.out.println(-1);
    }
}
