class Solution{

    public int countNum(int num){
        int counter = 0;
        // Edge case: if num is 0, the loop won't run, but 0 has 1 digit
        if (num == 0) return 1;

        while(num!=0){
            counter = counter +1;
            num = num / 10;
        }
        return counter;
    }
}

public class CountDigits{
    public static void main(String[] args) {
    
        Solution sol = new Solution();
        int result = sol.countNum(102456);
        System.out.println("Result " + result);
    }
}