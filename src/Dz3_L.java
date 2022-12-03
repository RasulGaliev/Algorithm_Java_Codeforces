import java.util.Scanner;

public class Dz3_L {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        int m = scanner.nextInt();
        for (int i = 0; i < m; i++) {
            int begin = scanner.nextInt();
            int end = scanner.nextInt();
            int count = 0;
            for (int j = begin - 1; j < end - 1; j++) {
                if (str.charAt(j) == str.charAt(j + 1))
                    count++;
            }
            System.out.println(count);
        }
    }
}
