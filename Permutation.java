public class Permutation {

    public static boolean checkInclusion(String s1, String s2) {

        int[] count = new int[26];

        // Count characters of s1
        for (char c : s1.toCharArray()) {
            count[c - 'a']++;
        }

        int left = 0;
        int right = 0;
        int need = s1.length();

        while (right < s2.length()) {

            if (count[s2.charAt(right) - 'a'] > 0) {
                need--;
            }

            count[s2.charAt(right) - 'a']--;
            right++;

            if (need == 0) {
                return true;
            }

            if (right - left == s1.length()) {

                if (count[s2.charAt(left) - 'a'] >= 0) {
                    need++;
                }

                count[s2.charAt(left) - 'a']++;
                left++;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        String s1 = "ab";
        String s2 = "eidbaooo";

        if (checkInclusion(s1, s2)) {
            System.out.println("Permutation exists");
        } else {
            System.out.println("Permutation does not exist");
        }
    }
}