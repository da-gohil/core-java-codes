public class ReverseTrianglePatternNumbers {
   public static void main(String[] args) {
        int n = 10; // Total number of rows

        for (int i = n; i >= 1; i--) {
            // Inner loop prints numbers from 1 up to i
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}