package Task;

import java.util.Scanner;

public class Task478C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long r = scanner.nextLong();
        long g = scanner.nextLong();
        long b = scanner.nextLong();
        long min = Math.min(Math.min(r, g), b);
        long max = Math.max(Math.max(r, g), b);
        long medium = r == min ? (g == max ? b : g) : (r == max ? (g == min ? b : g) : r);
        System.out.println(max >= 2 * (min + medium) ? min + medium : (r + g + b) / 3);
    }
}
