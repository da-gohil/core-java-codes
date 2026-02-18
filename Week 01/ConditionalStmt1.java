public class ConditionalStmt1 {
    // Added 'static' so it can be called by main
    public static void studentGrade(int marks) {

        if (marks <= 0) {
            System.out.println("invalid input");
        } else if (marks >= 90) { // Check Grade A first to simplify logic
            System.out.println("Grade A");
        } else if (marks >= 70 && marks <= 89) { // Changed || to &&
            System.out.println("Grade B");
        } else if (marks >= 50 && marks <= 69) { // Changed || to &&
            System.out.println("Grade C");
        } else if (marks >= 35) {
            System.out.println("Grade D");
        } else {
            System.out.println("Fail");
        }
    }

    public static void main(String[] args) {
        int mark = 70;
        // Removed 'String result =' because the method is void
        studentGrade(mark); 
    }
}