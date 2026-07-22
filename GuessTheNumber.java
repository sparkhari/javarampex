public class GuessTheNumber {

    static int pickedNumber = 37;

    // Simulates the LeetCode guess() API
    public static int guess(int num) {
        if (num == pickedNumber) {
            return 0;
        } else if (num > pickedNumber) {
            return -1;
        } else {
            return 1;
        }
    }

    public static int guessNumber(int n) {

        int left = 1;
        int right = n;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            int result = guess(mid);

            if (result == 0) {
                return mid;
            } else if (result == -1) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int n = 100;

        System.out.println("Picked Number: " + guessNumber(n));
    }
}