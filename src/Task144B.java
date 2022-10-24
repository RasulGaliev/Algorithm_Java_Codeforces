import java.util.Scanner;

public class Task144B {
    public static void main(String[] args) {
        task144B();
    }
    public static void task144B() {
        Scanner scanner = new Scanner(System.in);
        int x_a = scanner.nextInt();
        int y_a = scanner.nextInt();
        int x_b = scanner.nextInt();
        int y_b = scanner.nextInt();
        int n = scanner.nextInt();
        int[][] bake = new int[n][3];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                bake[i][j] = scanner.nextInt();
            }
        }
        int[][] generals = new int[(Math.abs(y_a - y_b) + Math.abs(x_a - x_b)) * 2][3];
        int j = 0;
        for (int i = Math.min(x_a, x_b); i <= Math.max(x_a, x_b); i++, j += 2) {
            generals[j][0] = i;
            generals[j + 1][0] = i;
            generals[j][1] = y_a;
            generals[j + 1][1] = y_b;
        }
        for (int i = Math.min(y_a, y_b) + 1; i < Math.max(y_a, y_b); i++, j += 2) {
            generals[j][0] = x_a;
            generals[j + 1][0] = x_b;
            generals[j][1] = i;
            generals[j + 1][1] = i;
        }
        for (int i = 0; i < bake.length; i++) {
            for (int l = 0; l < generals.length; l++) {
                if (Math.sqrt(Math.pow(generals[l][0] - bake[i][0], 2) + Math.pow(generals[l][1] - bake[i][1], 2)) <= bake[i][2])
                    generals[l][2]++;
            }
        }
        int count = 0;
        for (int i = 0; i < generals.length; i++) {
            if (generals[i][2] == 0)
                count++;
        }
        System.out.println(count);
    }

}
