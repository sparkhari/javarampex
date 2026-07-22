import java.util.*;

public class atm_pin {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int right_pin = 1432;
        int attempts = 0;

        do {
            System.out.print("Enter PIN: ");
            int pin = sc.nextInt();

            if (pin == right_pin) {
                System.out.println("PIN is correct");
                break;
            } else {
                attempts++;
                System.out.println("Incorrect PIN");
            }

        } while (attempts < 3);

        if (attempts == 3) {
            System.out.println("ATM Blocked");
        }

        sc.close();
    }
}