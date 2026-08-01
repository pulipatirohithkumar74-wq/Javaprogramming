import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();

        int dogAge = age * 7;

        System.out.println(dogAge + " years old in dog years.");
    }
}
