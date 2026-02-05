// WAJP to accept a number from user and print it

import java.util.NoSuchElementException;
import java.util.Scanner;

class Solution {
    public void printNumber(Scanner sc) {
        // Validation is key in FAANG interviews
        if (sc == null) return;

        try {
            if (sc.hasNextInt()) {
                int number = sc.nextInt();
                System.out.println("Result: " + number);
            } else {
                System.err.println("Input provided is not a valid integer.");
            }
        } catch (NoSuchElementException | IllegalStateException e) {
            System.err.println("Error reading input: " + e.getMessage());
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        // Try-with-resources ensures the scanner (and System.in) is closed properly
        // Note: Closing a scanner linked to System.in closes System.in itself!
        try (Scanner sc = new Scanner(System.in)) {
            sol.printNumber(sc);
        }
    }
}