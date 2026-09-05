import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();

        int total = m1 + m2 + m3;

        // Normal pass
        if (m1 >= 40 && m2 >= 40 && m3 >= 40) {
            System.out.println("PASS");
        }

        // Grace pass
        else if (
            total >= 150 &&
            ((m1 >= 35 && m1 < 40) &&
             m2 >= 40 && m3 >= 40
            ||
             m2 >= 35 && m2 < 40 &&
             m1 >= 40 && m3 >= 40
            ||
             m3 >= 35 && m3 < 40 &&
             m1 >= 40 && m2 >= 40)
        ) {
            System.out.println("GRACE PASS");
        }

        // Everything else
        else {
            System.out.println("FAIL");
        }
    }
}
