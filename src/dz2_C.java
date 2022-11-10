import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class dz2_C {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int s = scanner.nextInt();
        double [][] matrix = new double[n][2];
        double  x, y;
        for (int i = 0; i < n; i++) {
            x = scanner.nextDouble();
            y = scanner.nextDouble();
            matrix[i][0] = Math.sqrt(x * x + y * y);
            matrix[i][1] = scanner.nextDouble();
        }
        for (int i = 0; i < n - 1; i++) {
            for(int j = 0; j < n - i - 1; j++) {
                if(matrix[j + 1][0] < matrix[j][0]) {
                    double tmp = matrix[j][0];
                    matrix[j][0] = matrix[j + 1][0];
                    matrix[j + 1][0] = tmp;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(matrix[i][0] + " " + matrix[i][1] + '\n');
        }
        if (s >= 1000000){
            System.out.println(0);
            return;
        }
        boolean p = false;
        for (int i = 0; i < n; i++) {
            s += matrix[i][1];
            if (s >= 1000000){
                System.out.println("*" + matrix[i][0]);
                p = true;
                break;
            }
        }
        if (!p)
            System.out.println(-1);
    }
}
