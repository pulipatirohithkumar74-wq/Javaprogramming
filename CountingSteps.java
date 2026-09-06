import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        long steps = 0;
        long peak = n;

        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = 3 * n + 1;
            }

            steps++;

            if (n > peak) {
                peak = n;
            }
        }

        System.out.println("steps: " + steps);
        System.out.println("peak: " + peak);
    }
}
