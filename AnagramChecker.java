
import java.util.Arrays;
import java.util.Scanner;

public class AnagramChecker{
    static boolean AnagramCheck(String a, String b){
        char[] arr1 = a.toCharArray();
        char[] arr2 = b.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);

    }
    static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }
        a = a.toLowerCase();
        b = b.toLowerCase();
        
        for (int i = 0; i < b.length(); i++) {
            a = a.replaceFirst(String.valueOf(b.charAt(i)), "");
        }

        return a.isEmpty() ? true : false;
            
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        sc.close();
        boolean res = isAnagram(a, b);
        System.out.println((res) ? "Anagram" : "Not Anagrams");

        boolean val = AnagramCheck(a, b);
        System.out.println((val) ? "Anagram" : "Not Anagram");

    }
}