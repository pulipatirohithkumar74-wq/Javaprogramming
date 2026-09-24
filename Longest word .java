import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String longest = "";

        for (int i = 0; i < n; i++) {
            String word = sc.next();

            if (word.length() > longest.length())
                longest = word;
        }

        System.out.println(longest);
    }
}
