package Task;

import java.util.Scanner;

public class Task82A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while (n > 5) {
            n = n / 2 - 2;
        }
        switch (n) {
            case 1:
                System.out.println("Sheldon");
                break;
            case 2:
                System.out.println("Leonard");
                break;
            case 3:
                System.out.println("Penny");
                break;
            case 4:
                System.out.println("Rajesh");
                break;
            case 5:
                System.out.println("Howard");
                break;
        }
    }
}
