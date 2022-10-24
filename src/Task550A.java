import java.util.Scanner;

public class Task550A {
    public static void main(String[] args) {
        task550A();
    }
    public static void task550A() {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        boolean flag = false;
        for(int i = 0; i < str.length() && !flag; i++) {
            if(i != str.length() - 1 && str.charAt(i) == 'A' && str.charAt(i + 1) == 'B') {
                for (i += 2; i < str.length(); i++) {
                    if (i != str.length() - 1 && str.charAt(i) == 'B' && str.charAt(i + 1) == 'A') {
                        flag = true;
                        break;
                    }
                }
            }
        }
        for(int i = 0; i < str.length() && !flag; i++) {
            if(i != str.length() - 1 && str.charAt(i) == 'B' && str.charAt(i + 1) == 'A') {
                for (i += 2; i < str.length(); i++) {
                    if (i != str.length() - 1 && str.charAt(i) == 'A' && str.charAt(i + 1) == 'B') {
                        flag = true;
                        break;
                    }
                }
            }
        }
        System.out.println(flag ? "YES" : "NO");
    }

}
