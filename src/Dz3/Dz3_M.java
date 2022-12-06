package Dz3;

import java.math.BigInteger;
import java.util.Scanner;

public class Dz3_M {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        String str = scanner.next();
        BigInteger n = new BigInteger(str);
        int sum = 0;
        int[] array = new int[10];
        for (int i = 0; i < str.length() && sum < k; i++) {
            sum += str.charAt(i) - '0';
            array[str.charAt(i) - '0']++;
        }
        if (sum < k) {
            int value = k - sum;
            int count = 0;
            for (int i = 0; i < 9; i++) {
                while (array[i] > 0) {
                    value -= 9 - i;
                    array[i]--;
                    count++;
                    if (value <= 0) {
                        System.out.println(count);
                        return;
                    }
                }
            }
        } else {
            System.out.println(0);
        }

        
    }
}
