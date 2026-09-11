import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 1; i <= n; i++) {
            pq.add(i);
        }

        while (sc.hasNext()) {
            String operation = sc.next();

            if (operation.equals("reserve")) {
                if (!pq.isEmpty()) {
                    System.out.println(pq.poll());
                }
            }
            else if (operation.equals("unreserve")) {
                int seat = sc.nextInt();
                pq.add(seat);
            }
        }

        sc.close();
    }
}
