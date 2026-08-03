import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double miles = sc.nextDouble();

        double km = miles * 1.60934;
        km = ((long)(km * 100000)) / 100000.0;

        double meters = miles * 1609.34;
        meters = ((long)(meters * 100)) / 100.0;

        double centimeters = miles * 160934;

        System.out.printf("Kilometers: %.5f\n", km);
        System.out.printf("Meters: %.2f\n", meters);
        System.out.printf("Centimeters: %.1f\n", centimeters);
    }
}
