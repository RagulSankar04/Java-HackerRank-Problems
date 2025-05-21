
import java.util.Arrays;
import java.util.Scanner;

public class AnagramChecker {

    static boolean AnagramCheck1(String a, String b) {
        char[] arr1 = a.toCharArray();
        char[] arr2 = b.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);

    }

    static boolean AnagramCheck2(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();

        if (a.length() != b.length()) {
            return false;
        }

        int[] charCount = new int[26];

        for (int i = 0; i < a.length(); i++) {
            int countA = 0;
            int countB = 0;
            for (int j = 0; j < a.length(); j++) {
                if (a.charAt(i) == a.charAt(j)) {
                    countA++;
                }
                if (a.charAt(i) == b.charAt(j)) {
                    countB++;
                }
            }
            if (countA == countB) {
                return true;
            }
        }
        return false;
    }

    static boolean AnagramCheck3(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();

        if (a.length() != b.length()) {
            return false;
        }

        int[] charCount = new int[26];

        for (int i = 0; i < a.length(); i++) {
            charCount[a.charAt(i) - 'a']++;
        }
        for (int i = 0; i < b.length(); i++) {
            charCount[b.charAt(i) - 'a']--;
        }
        for (int num : charCount) {
            if (num != 0) {
                return false;
            }
        }
        return true;
    }

    static boolean isAnagram(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();
        if (a.length() != b.length()) {
            return false;
        }

        for (int i = 0; i < b.length(); i++) {
            a = a.replaceFirst(String.valueOf(b.charAt(i)), "");
        }

        if (a.isEmpty()) {
            return true;
        }
        return false;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        sc.close();

        boolean res = isAnagram(a, b);
        System.out.println((res) ? "Anagram" : "Not Anagrams");

        boolean val1 = AnagramCheck1(a, b);
        System.out.println((val1) ? "Anagram" : "Not Anagram");

        boolean val2 = AnagramCheck2(a, b);
        System.out.println((val2) ? "Anagram" : "Not Anagram");

        boolean val3 = AnagramCheck3(a, b);
        System.out.println((val3) ? "Anagram" : "Not Anagram");

    }
}
