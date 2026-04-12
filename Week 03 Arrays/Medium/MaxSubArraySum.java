class Solution {
    public int maxSubArray(int[] nums) {
       
       long max1 = Long.MIN_VALUE;
       long sum =0;

        for(int i=0; i<nums.length; i++){
            sum += nums[i];

            if(sum > max1){
                max1 = sum;
            }

            if(sum<0){
                sum = 0;
            }
        }
        return (int) max1;
    }
}