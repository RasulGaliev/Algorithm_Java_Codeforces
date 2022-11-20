package KR1;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class KR1_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int result = scanner.nextInt();
        int newResult = result;
        List<Integer> arrayResult = new ArrayList<>();
        List<Integer> arrayNumber = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arrayResult.add(0);
            arrayNumber.add(0);
        }

        int count = 0;
        while (newResult != 0){
            arrayResult.set(newResult % 10, arrayResult.get(newResult % 10) + 1);
            newResult /= 10;
            count++;
        }
        int min = 10;
        int tmp;
        while (number != 0){
            tmp = number % 10;
            if (tmp < min && tmp != 0)
                min = tmp;
            arrayNumber.set(tmp, arrayNumber.get(tmp) + 1);
            number /= 10;
        }

        boolean flag = true;
        for (int i = 0; i < 10; i++) {
            if (!arrayResult.equals(arrayNumber)) {
                flag = false;
                break;
            }
        }

        while (result > 10) {
            if (result % 10 < result / 10 % 10) {
                flag = false;
                break;
            }
            result /= 10;
        }
        if (count > 1 && result /                                                           10 % 10 != min)
            flag = false;
        System.out.println(flag ? "OK" : "WRONG_ANSWER");

    }

}
