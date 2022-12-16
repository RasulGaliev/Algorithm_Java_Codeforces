package Task;

import javax.imageio.metadata.IIOMetadataFormatImpl;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task4B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int d = scanner.nextInt();
        int sumTime = scanner.nextInt();
        List<Integer> minTime = new ArrayList<>();
        List<Integer> maxTime = new ArrayList<>();
        int minTimeSum = 0;
        int maxTimeSum = 0;
        for (int i = 0; i < d; i++) {
            minTime.add(scanner.nextInt());
            minTimeSum += minTime.get(i);
            maxTime.add(scanner.nextInt());
            maxTimeSum += maxTime.get(i);
        }
        if (sumTime < minTimeSum || sumTime > maxTimeSum) {
            System.out.println("NO");
            return;
        }
        System.out.println("YES");
        int diff = sumTime - minTimeSum;
        for (int i = 0; i < d; i++) {
            int value = Math.min(diff, maxTime.get(i) - minTime.get(i));
            diff -= Math.min(diff, maxTime.get(i) - minTime.get(i));
            System.out.printf("%d ", minTime.get(i) + value);
        }
    }
}
