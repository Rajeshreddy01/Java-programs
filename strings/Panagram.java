package strings;

import java.util.Scanner;

public class Panagram {

    public static void main(String[] args) {
        // Input the string
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Check if the string is a pangram
        boolean isPangram = isPangram(input);

        // Output the result
        if (isPangram) {
            System.out.println("The given string is a pangram.");
        } else {
            System.out.println("The given string is NOT a pangram.");
        }

        scanner.close();
    }

    // Method to check if a string is a pangram
    public static boolean isPangram(String str) {
        // Convert string to lowercase for case-insensitive comparison
        str = str.toLowerCase();

        // Create a boolean array to track the presence of each letter (26 letters)
        boolean[] alphabetPresent = new boolean[26];

        // Iterate through the string using a normal for loop
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i); // Get the current character
            if (ch >= 'a' && ch <= 'z') {
                alphabetPresent[ch - 'a'] = true; // Mark the letter as present
            }
        }

        // Check if all letters are present using a normal for loop
        for (int i = 0; i < alphabetPresent.length; i++) {
            if (!alphabetPresent[i]) {
                return false; // If any letter is missing, it's not a pangram
            }
        }

        return true; // All letters are present, so it's a pangram
    }
}

