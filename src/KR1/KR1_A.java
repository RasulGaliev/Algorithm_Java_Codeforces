 package KR1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class KR1_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.next();
        String result = scanner.next();
        List<Character> listNumber = new ArrayList<>();
        char min = 100;
        int minI = 0;
        char tmp;
        for (int i = 0; i < number.length(); i++) {
            tmp = number.charAt(i);
            listNumber.add(tmp);
        }
        Collections.sort(listNumber);
        for (int i = 0; i < listNumber.size(); i++) {
            tmp = listNumber.get(i);
            if (tmp < min && tmp > '0') {
                min = tmp;
                minI = i;
            }
        }
        if(number.length() > 1 && listNumber.get(0) == '0'){
            listNumber.set(0, listNumber.get(minI));
            listNumber.set(minI, '0');
        }
        boolean flag = true;
        if (listNumber.size() != result.length()){
            flag = false;
        }
        for (int i = 0; i < number.length() && flag; i++) {
            if (listNumber.get(i) != result.charAt(i)) {
                flag = false;
            }
        }
        System.out.println(flag ? "OK" : "WRONG_ANSWER");
    }

}
