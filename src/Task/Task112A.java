package Task;

import java.util.Scanner;

public class Task112A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.next();
        String str2 = scanner.next();
        int result = 0;
        for (int i = 0; i < str1.length(); i++) {
            char ch1 = str1.charAt(i);
            char ch2 = str2.charAt(i);
            result += ('a' <= ch1 && ch1 <= 'z' ? ch1 : ch1 + 32) -
                    ('a' <= ch2 && ch2 <= 'z' ? ch2 : ch2 + 32);
            if (result != 0) break;
        }
        System.out.println(result == 0 ? 0 : result / Math.abs(result));
    }
}
