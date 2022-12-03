package Dz2;

import java.util.*;

public class dz2_I {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int s = scanner.nextInt();
        Map<Integer, Integer> mapB = new TreeMap<>();
        Map<Integer, Integer> mapS = new TreeMap<>();
        int value;
        for (int i = 0; i < n; i++) {
            if (scanner.next().equals("S")) {
                value = scanner.nextInt();
                if (!mapS.containsKey(value))
                    mapS.put(value, scanner.nextInt());
                else
                    mapS.put(value, mapS.get(value) + scanner.nextInt());
            } else {
                value = scanner.nextInt();
                if (!mapB.containsKey(value))
                    mapB.put(value, scanner.nextInt());
                else
                    mapB.put(value, mapB.get(value) + scanner.nextInt());
            }
        }
        ArrayList<Integer> keysS = new ArrayList<Integer>(mapS.keySet());

        int s2 = s;
        if (s > keysS.size())
            s = keysS.size();
        for (int i = s - 1; i >= 0; i--) {
            System.out.println("S " + keysS.get(i) + " " + mapS.get(keysS.get(i)));
        }
        ArrayList<Integer> keysB = new ArrayList<Integer>(mapB.keySet());
        for (int i = keysB.size() - 1, j = 0; i >= 0 && j < s2; i--, ++j) {
            System.out.println("B " + keysB.get(i) + " " + mapB.get(keysB.get(i)));
        }
    }
}
