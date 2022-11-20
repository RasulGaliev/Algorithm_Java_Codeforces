import java.math.BigInteger;
import java.util.Scanner;

public class Task515C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String a = scanner.next();
        BigInteger result = new BigInteger("1");
        for (int i = 0; i < n; i++) {
            result = result.multiply(new BigInteger(Integer.toString(getFactorial(a.charAt(i) - 48))));
        }
        int count2 = 0;
        int count3 = 0;
        int count5 = 0;
        int count7 = 0;
        while (result.remainder(new BigInteger("2")).equals(new BigInteger("0"))) {
                result = result.divide(new BigInteger("2"));
                count2++;
        }
        while (result.remainder(new BigInteger("3")).equals(new BigInteger("0"))) {
            result = result.divide(new BigInteger("3"));
            count2--;
            count3++;
        }
        while (result.remainder(new BigInteger("5")).equals(new BigInteger("0"))) {
            result = result.divide(new BigInteger("5"));
            count3--;
            count2--;
            count2--;
            count5++;
        }
        while (result.remainder(new BigInteger("7")).equals(new BigInteger("0"))) {
            result = result.divide(new BigInteger("7"));
            count5--;
            count3--;
            count7++;
        }

        while (count7-- > 0)
            System.out.print(7);
        while (count5-- > 0)
            System.out.print(5);
        while (count3-- > 0)
            System.out.print(3);
        while (count2-- > 0)
            System.out.print(2);
    }

    public static int getFactorial(int f) {
        if (f <= 1) {
            return 1;
        }
        else {
            return f * getFactorial(f - 1);
        }
    }
}

