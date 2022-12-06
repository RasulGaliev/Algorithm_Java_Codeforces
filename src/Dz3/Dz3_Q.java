package Dz3;

import java.util.*;

import static java.lang.Math.acos;
public class Dz3_Q {
    public static void main(String[] args) {
        int even = 0;
        int odd = 0;
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        int b = scanner.nextInt();
        int value = 0;
        int count = 0;
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int elem = scanner.nextInt();
            if (i != 0 && count == 0)
                list.add(Math.abs(elem - value));
            count += elem % 2 == 0 ? 1 : -1;
            value = elem;
        }

        Collections.sort(list);
        int result = 0;
        for (int i = 0; i < list.size(); i++) {
            if (b - list.get(i) <= 0){
                System.out.println(b - list.get(i) == 0 ? result + 1 : result);
                return;
            }
            result++;
            b -= list.get(i);
        }
        System.out.println(result);
    }
}


