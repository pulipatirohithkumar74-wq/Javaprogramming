import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n == 0) {
            System.out.println(0);
            return;
        }

        String binary = "";

        while (n > 0) {
            binary = (n % 2) + binary;
            n /= 2;
        }

        System.out.println(binary);
    }
}
