import java.util.Scanner;

public class Task1363B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        String str;
        int min;
        int count;
        while(k-- > 0) {
            str = scanner.next();
            min = str.length();
            for (int i = 0; i <= str.length(); i++) {
                // сначала 0
                count = 0;
                for (int j = 0; j < i; j++) {
                    count += str.charAt(j) - 48;
                }
                for (int j = i; j < str.length(); j++) {
                    count += 1 - (str.charAt(j) - 48);
                }
                min = Math.min(min, count);

                // сначала 1
                count = 0;
                for (int j = 0; j < i; j++) {
                    count +=  1 - (str.charAt(j) - 48);
                }
                for (int j = i; j < str.length(); j++) {
                    count += str.charAt(j) - 48;
                }
                min = Math.min(min, count);
            }
            System.out.println(min);
        }
    }


}
