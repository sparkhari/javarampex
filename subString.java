import java.util.Scanner;

public class subString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.print("Enter starting index: ");
        int start = sc.nextInt();

        System.out.print("Enter ending index: ");
        int end = sc.nextInt();

        // Print the substring
        if (start >= 0 && end <= str.length() && start < end) {
            System.out.println("Substring: " + str.substring(start, end));
        } else {
            System.out.println("Invalid index!");
        }

        sc.close();
    }
}