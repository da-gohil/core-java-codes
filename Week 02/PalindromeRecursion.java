class CheckPalindrome{
   public boolean isPalindrome(String s) {
        if (s == null) return false;
        return checkRecursive(s, 0, s.length() - 1);
    }
    // The private recursive engine
    private boolean checkRecursive(String s, int left, int right) {
        // Base Case: Pointers met or crossed
        if (left >= right) {
            return true;
        }

        char lChar = s.charAt(left);
        char rChar = s.charAt(right);

        // Recursive Case 1: Skip non-alphanumeric (Left)
        if (!Character.isLetterOrDigit(lChar)) {
            return checkRecursive(s, left + 1, right);
        }
        
        // Recursive Case 2: Skip non-alphanumeric (Right)
        if (!Character.isLetterOrDigit(rChar)) {
            return checkRecursive(s, left, right - 1);
        }

        // Recursive Case 3: Character Match Check (Case Insensitive)
        if (Character.toLowerCase(lChar) != Character.toLowerCase(rChar)) {
            return false;
        }

        // Move both pointers inward and recurse
        return checkRecursive(s, left + 1, right - 1);
    }
}

public class PalindromeRecursion{
    public static void main(String[] args) {
        
        CheckPalindrome checker = new CheckPalindrome();
        String str1 = "ABCDCBA";
        boolean result = checker.isPalindrome(str1);
    
        // Output the result
        if (result) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

    }
}