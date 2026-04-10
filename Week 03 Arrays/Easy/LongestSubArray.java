class Solution{

    public int longestSubarray(int []nums , int k){

        int n = nums.length;
        int maxLen = 0;
        int leftPointer = 0, rightPointer = 0;
        int sum = nums[0];

        // traversing the array
        while(rightPointer < n){

            while(leftPointer <= rightPointer && sum > k){
                sum -= nums[leftPointer];
                leftPointer++;
            }

            if(sum == k){
                maxLen = Math.max(maxLen, rightPointer - leftPointer + 1);
            }
            rightPointer++;
            if(rightPointer < n){
                sum+= nums[rightPointer];
            }
        }
        
        
        return maxLen;
    }

}

public class LongestSubArray{
    public static void main(String[] args) {
        int[] nums = {10, 5, 2, 7, 1, 9};
        int k = 15;

        // Create Solution object
        Solution sol = new Solution();

        // Function call to find the result
        int ans = sol.longestSubarray(nums, k);

        // Output the result
        System.out.println("The length of longest subarray having sum k is: " + ans);

    }
}