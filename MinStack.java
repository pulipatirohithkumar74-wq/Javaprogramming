import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++)
            stack.push(sc.nextInt());

        int min = stack.peek();

        for (int x : stack) {
            if (x < min)
                min = x;
        }

        System.out.println(min);
    }
}
