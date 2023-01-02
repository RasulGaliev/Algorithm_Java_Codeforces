package olimp;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Olimp_O {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        Set<String> set = new TreeSet<>();
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            String[] team = scanner.nextLine().split(" ");
            if (a > 0 && !set.contains(team[0])) {
                System.out.println(team[0] + " " + team[1]);
                set.add(team[0]);
                a--;
            } else if(b > 0) {
                System.out.println(team[0] + " " + team[1]);
                b--;
            }
        }
    }
}
