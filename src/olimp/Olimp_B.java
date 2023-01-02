package olimp;

import java.util.Scanner;

public class Olimp_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int s;
        while (t-- > 0) {
            s = scanner.nextInt();
            System.out.println(s % 6 == 0 ? "Yes" : "No");
        }
    }
}

