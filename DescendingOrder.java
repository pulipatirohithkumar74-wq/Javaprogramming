import java.util.Scanner;
import java.util.Arrays;

public class Integer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long arr[] = new long[4];

        for (int i = 0; i < 4; i++) {
            arr[i] = sc.nextLong();
        }

        Arrays.sort(arr);

        System.out.println(arr[3] + ">" + arr[2] + ">" + arr[1] + ">" + arr[0]);
    }
}
