public class ReverseTrianglePattern {
    public static void main(String[] args) {
        // Ensure an argument is passed to avoid errors
        int n = (args.length > 0) ? Integer.parseInt(args[0]) : 5;

        for (int i = 0; i < n; i++) {
            // The number of stars should be n - i
            // Row 0: 5 stars, Row 1: 4 stars, etc.
            for (int j = 0; j < (n - i); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}