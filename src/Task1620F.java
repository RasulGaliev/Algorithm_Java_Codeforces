import java.util.Scanner;

public class Task1620F {
    public static void main(String[] args) {
        task1620F();
    }
    public static void task1620F() {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < in.nextInt(); i++) {
            int size = in.nextInt();
            int[] array = new int[size];
            for (int j = 0; j < size; j++)
                array[j] = in.nextInt();


            int a = -1, b = -1;
            boolean flag = true;
            for (int j = 0; j < size && flag; j++) {
                int fst_less = -1;
                for (int l = j + 1; l < size; l++) {
                    if (array[l] < array[j] && fst_less == -1) {
                        fst_less = l;
                    }
                    else if (array[l] < array[j] && array[l] < array[fst_less]) {
                        System.out.println("*");
                        flag = a == j && b == l;
                        array[j] *= -1;
                        j = 0;
                        fst_less = -1;
                        a = j;
                        b = l;
                        if (flag)
                            break;
                    }
                }
                // System.out.println("#");
            }
            System.out.println(flag ? "YES" : "NO");
            if (flag) {
                for (int j = 0; j < size; j++)
                    System.out.print(i != 2 ? array[j] + " " : array[j]);
            }
        }
    }
}
