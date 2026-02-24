
public class ConditionalStmt3 {
    public static void main(String[] args) {
        // Define a character variable representing a grade
        char grade = 'A';

        // Evaluate grade using a switch statement
        switch (grade) {
            case 'A': // If grade is 'A'
                System.out.println("Excellent!");
                break; // Exit switch after this case
            case 'B': // If grade is 'B'
                System.out.println("Good!");
                break; // Exit switch after this case
            default: // If no case matches
                System.out.println("Not specified.");
        }
    }
}
