package Dz3;

import java.util.Scanner;

public class Dz3_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] g = new int[6][6];
        int n = 5;
        for(int i = 0 ; i < n ; ++i)
            for(int j = 0 ; j < n ; ++j)
                g[i][j] = scanner.nextInt();
        int[] p = new int[6];
        int[] pans = new int[6];
        int ans = -1;
        int tmp;
        for(int i = 0 ; i < 6 ; ++i)
            p[i] = i;

        do {
            //01234
            tmp = g[p[0]][p[1]] + g[p[1]][p[0]];
            tmp += g[p[2]][p[3]] + g[p[3]][p[2]];

            //1234
            tmp += g[p[1]][p[2]] + g[p[2]][p[1]];
            tmp += g[p[3]][p[4]] + g[p[4]][p[3]];

            //234
            tmp += g[p[2]][p[3]] + g[p[3]][p[2]];

            //34
            tmp += g[p[3]][p[4]] + g[p[4]][p[3]];

            if(tmp > ans) {
                ans = tmp;
                for(int i = 0 ; i < n ; ++i)
                    pans[i] = p[i];
            }
        } while(next_permutation(p));
        System.out.println(ans + "\n");
    }
    public static boolean next_permutation(int[] p) {
        for (int a = p.length - 2; a >= 0; --a)
            if (p[a] < p[a + 1])
                for (int b = p.length - 1;; --b)
                    if (p[b] > p[a]) {
                        int t = p[a];
                        p[a] = p[b];
                        p[b] = t;
                        for (++a, b = p.length - 1; a < b; ++a, --b) {
                            t = p[a];
                            p[a] = p[b];
                            p[b] = t;
                        }
                        return true;
                    }
        return false;
    }
}
