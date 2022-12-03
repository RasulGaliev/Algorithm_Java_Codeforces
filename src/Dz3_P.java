import java.util.Scanner;

public class Dz3_P {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.next();
        String str2 = scanner.next();
        int count = 0;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i))
                count++;
        }
        char[] str = new char[str1.length()];
        if (count % 2 == 0) {
            for (int i = 0, j = 0; i < str1.length(); i++) {
                if (str1.charAt(i) != str2.charAt(i) && j < count / 2) {
                    System.out.print(str2.charAt(i));
                    j++;
                } else {
                    System.out.print(str1.charAt(i));                }
            }
        } else {
            System.out.println("impossible");
        }
        //System.out.println(str1.charAt(1));
    }
}
