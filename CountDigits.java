import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long n = sc.nextLong();

        if (n == 0) {
            System.out.println("Number of digits = 1");
            sc.close();
            return;
        }

        n = Math.abs(n);

        int count = 0;

        while (n > 0) {
            count++;
            n = n / 10;
        }

        System.out.println("Number of digits = " + count);

        sc.close();
    }
}