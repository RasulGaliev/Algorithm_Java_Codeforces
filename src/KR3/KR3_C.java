package KR3;

import java.util.*;

public class KR3_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.next();
        String str = scanner.next();
        int[] array = new int[10];
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'L'){
                for (int j = 0; j < array.length; j++) {
                    if (array[j] == 0){
                        array[j] = 1;
                        break;
                    }
                }
            } else if (str.charAt(i) == 'R'){
                for (int j = array.length - 1; j >= 0 ; j--) {
                    if (array[j] == 0){
                        array[j] = 1;
                        break;
                    }
                }
            } else{
                array[str.charAt(i) - '0'] = 0;
            }
        }
        
        for (int i = 0; i < 10; i++)
            System.out.print(array[i]);
    }
}