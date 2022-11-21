import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KR1_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int k = m + n;
        List<Integer> coordination = new ArrayList<>();
        while (k-- > 0)
            coordination.add(scanner.nextInt());

        k = m + n;
        List<Integer> taxi = new ArrayList<>();
        List<Integer> client = new ArrayList<>();
        int tmp;
        for (int i = 0; i < k; i++) {
            tmp = scanner.nextInt();
            // status.add(tmp);
            if (tmp == 1)
                taxi.add(coordination.get(i));
            else
                client.add(coordination.get(i));
        }
        List<Integer> countClient = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            countClient.add(0);
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            while (true) {
                if (count < m - 1 && Math.abs(client.get(i) - taxi.get(count)) <= (Math.abs(client.get(i) - taxi.get(count + 1)))) {
                    countClient.set(count, countClient.get(count) + 1);
                    break;
                } else if(count == m - 1) {
                    countClient.set(count, countClient.get(count) + 1);
                    break;
                } else {
                    count++;
                }
            }
        }
        for (int i = 0; i < countClient.size(); i++) {
            System.out.println(countClient.get(i) + " ");
        }

    }
}
