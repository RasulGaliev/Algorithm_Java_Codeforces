import java.util.*;

public class Homework {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        List<ArrayList<Integer>> list = new ArrayList<>();
        StringBuilder str = new StringBuilder();
        boolean check;
        for (; t > 0; t--) {
            check = false;
            int n = scanner.nextInt();
            for (int i = 0; i < n; i++) {
                list.add(new ArrayList<>(Arrays.asList(scanner.nextInt(), scanner.nextInt())));
            }
            list.sort(new Comparator<ArrayList<Integer>>() {
                @Override
                public int compare(ArrayList<Integer> o1, ArrayList<Integer> o2) {
                    if (o1.get(0) == o2.get(0)){
                        return o1.get(1).compareTo(o2.get(1));
                    }
                    return o1.get(0).compareTo(o2.get(0));
                }
            });

            int x = 0;
            int y = 0;
            for (int i = 0; i < n; i++) {
                if (x > list.get(i).get(0) || y > list.get(i).get(1)) {
                    check = true;
                    break;
                }
                while (x < list.get(i).get(0)) {
                    ++x;
                    str.append("R");
                }
                while (y < list.get(i).get(1)) {
                    ++y;
                    str.append("U");
                }
            }
            if(check)
                System.out.println("NO");
            else{
                System.out.println("YES");
                System.out.println(str);
            }
            list.clear();
            str.delete(0, str.length());
        }
    }
}