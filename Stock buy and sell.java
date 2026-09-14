import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] price = new int[n];

        for (int i = 0; i < n; i++)
            price[i] = sc.nextInt();

        int minPrice = price[0];
        int profit = 0;

        for (int i = 1; i < n; i++) {
            profit = Math.max(profit, price[i] - minPrice);
            minPrice = Math.min(minPrice, price[i]);
        }

        System.out.println(profit);
    }
}
