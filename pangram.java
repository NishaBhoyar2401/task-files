import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class pangram {
    public static void main(String[] args) {
        // Create a HashSet to store unique characters
        Set<Character> uniqueChars = new HashSet<>();

        // Create a Scanner to read user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine().toLowerCase(); // Convert input to lowercase

        // Iterate through the input string and add unique lowercase alphabets to the
        // HashSet
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isLetter(c)) {
                uniqueChars.add(c);
            }
        }

        // Check if the size of the HashSet is 26 (number of alphabets)
        boolean isPangram = uniqueChars.size() == 26;

        // Print the result
        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }

        // Close the scanner
        scanner.close();
    }
}
