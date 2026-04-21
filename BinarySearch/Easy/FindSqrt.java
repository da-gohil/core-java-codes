class Solution{
    public int mySqrt(int x){
        //Boundary value
        if(x < 2) return x;

        //Use the binary search pattern
        int low = 1, high = x / 2, result = 0;

        while(low <= high){
            long mid = low + (high - low) / 2;

            if(mid * mid <= x){
                //Store as a potential mid answer
                result = (int) mid;
                low = (int) mid + 1;
            }else{
                high = (int) mid - 1;
            }
        }
        return result;
    }
}

public class FindSqrt{
    public static void main(String[] args) {
        Solution sol = new Solution();
        int res = sol.mySqrt(2);
        System.out.println(res);
    }
}