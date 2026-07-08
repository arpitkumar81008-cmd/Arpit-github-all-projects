//chat gpt program for anagram

import java.util.*;

public class AnagramChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.println("Enter first string:");
        String input1 = sc.nextLine().trim().toUpperCase();
        System.out.println("Enter second string:");
        String input2 = sc.nextLine().trim().toUpperCase();
        
        sc.close();

        // Clean strings
        String cleaned1 = cleanString(input1);
        if (cleaned1 == null) {
            System.out.println("Invalid characters in first string.");
            return;
        }

        String cleaned2 = cleanString(input2);
        if (cleaned2 == null) {
            System.out.println("Invalid characters in second string.");
            return;
        }

        // Check length
        if (cleaned1.length() != cleaned2.length()) {
            System.out.println("Not anagram: length mismatch.");
            return;
        }

        // Check anagram
        if (areAnagrams(cleaned1, cleaned2)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not anagram: characters don't match.");
        }
    }

    // Removes spaces and validates characters (A-Z only)
    static String cleanString(String input) {
        StringBuilder sb = new StringBuilder();
        for (char ch : input.toCharArray()) {
            if (ch >= 'A' && ch <= 'Z') {
                sb.append(ch);
            } else if (ch != ' ') {
                return null; // invalid character
            }
        }
        return sb.toString();
    }

    // Compares sorted character arrays
    static boolean areAnagrams(String s1, String s2) {
        char[] a1 = s1.toCharArray();
        char[] a2 = s2.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
        return Arrays.equals(a1, a2);
    }
}
