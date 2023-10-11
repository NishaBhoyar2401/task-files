import java.util.HashMap;
import java.util.Scanner;

public class roman {
    public static void main(String[] args) {
        // Create a HashMap to store Roman numeral values
        HashMap<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);

        // Create a Scanner to read user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Roman numeral: ");
        String romanNumeral = scanner.nextLine().toUpperCase(); // Convert input to uppercase

        // Initialize variables for conversion
        int result = 0;
        int prevValue = 0;

        // Iterate through the Roman numeral characters in reverse order
        for (int i = romanNumeral.length() - 1; i >= 0; i--) {
            char currentChar = romanNumeral.charAt(i);
            int currentValue = romanValues.get(currentChar);

            // If the current value is less than the previous value, subtract it
            if (currentValue < prevValue) {
                result -= currentValue;
            } else {
                result += currentValue;
            }

            prevValue = currentValue;
        }

        // Print the result
        System.out.println("The integer equivalent is: " + result);

        // Close the scanner
        scanner.close();
    }
}
