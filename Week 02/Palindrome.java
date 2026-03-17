class CheckPalindrome{
    public boolean isPalindrome(String s){

        int leftPointer = 0;
        int rightPointer = s.length() - 1;

        while(leftPointer < rightPointer){
            if(!Character.isLetterOrDigit(s.charAt(leftPointer))){
                leftPointer++;
            }else if(!Character.isLetterOrDigit(s.charAt(rightPointer))){
                rightPointer--;
            }else if (Character.toLowerCase(s.charAt(leftPointer)) != (Character.toLowerCase(s.charAt(rightPointer)))){
                return false;
            }else{
                leftPointer++;
                rightPointer--;
            }
        }
        return true;
    }
}

public class Palindrome{
    public static void main(String[] args) {
        
        CheckPalindrome checker = new CheckPalindrome();
        String str1 = "ABCDBA";
        boolean result = checker.isPalindrome(str1);
    
        // Output the result
        if (result) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

    }
}