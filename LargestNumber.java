import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();

        System.out.print("Enter the value of b: ");
        int b = sc.nextInt();

        System.out.print("Enter the value of c: ");
        int c = sc.nextInt();

        if (a >= b && a >= c) {
            System.out.println("A is the largest: " + a);
        } else if (b >= a && b >= c) {
            System.out.println("B is the largest: " + b);
        } else {
            System.out.println("C is the largest: " + c);
        }

        sc.close();
    }
}