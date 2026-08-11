import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();

        int carry = 0;
        int count = 0;

        while (a > 0 || b > 0 || carry > 0) {

            int d1 = (int)(a % 10);
            int d2 = (int)(b % 10);

            int sum = d1 + d2 + carry;

            if (sum >= 10) {
                carry = 1;
                count++;
            } else {
                carry = 0;
            }

            a = a / 10;
            b = b / 10;
        }

        System.out.println("Carry Operations: " + count);
    }
}
