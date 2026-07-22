import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int temp = n;
        int digits = 0;

        // Count digits
        while (temp > 0) {
            digits++;
            temp /= 10;
        }

        temp = n;
        int sum = 0;

        while (temp > 0) {
            int rem = temp % 10;
            sum += (int) Math.pow(rem, digits);
            temp /= 10;
        }
        if (sum == n) {
            System.out.println(n + " is an Armstrong Number");
        } else {
            System.out.println(n + " is Not an Armstrong Number");
        }

        sc.close();
    }
}