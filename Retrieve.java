package Day10;

import java.util.Arrays;

public class Retrieve {

    Loan[] hdfc = new Loan[5];

    public Retrieve() {

        hdfc[0] = new Loan(987654567876L, 267000, 19.5f);
        hdfc[1] = new Loan(987655642315L, 561900, 12.4f);
        hdfc[2] = new Loan(456248545253L, 845533, 15.4f);
        hdfc[3] = new Loan(897846578946L, 120000, 11.2f);
        hdfc[4] = new Loan(841096396968L, 3450000, 8.7f);
    }

    public void read(float user) {
        System.out.println(user + " roi matched records");

        Arrays.stream(hdfc)
                .filter(each -> each.getRoi() >= user)
                .forEach(System.out::println);
    }

    public void read(long number) {
        System.out.println(number + " loan records");

        Arrays.stream(hdfc)
                .filter(each -> each.getLoanNo() == number)
                .forEach(System.out::println);
    }

    public void read(int amount) {
        System.out.println("Loan records less than " + amount);

        Arrays.stream(hdfc)
                .filter(each -> each.getPrinciple() <= amount)
                .forEach(System.out::println);
    }

    public static void main(String[] arr) {

        Retrieve ret = new Retrieve();

        ret.read(15.0f);
        ret.read(987654567876L);
        ret.read(400000);
    }
}
