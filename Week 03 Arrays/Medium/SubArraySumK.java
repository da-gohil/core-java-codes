class Solution{
    public int checkSubArraySum(int [] nums, int k){

        int n = nums.length;

        //the count of subarrays
        int count = 0;

        if(nums.length == 1 || nums == null) return 0;

        for(int i=0; i<n; i++){
            int sum = 0;

            for(int j=i; j<n; j++){
                sum+= nums[j];

                if(sum == k){
                    count++;
                }
            }
        }
        return count;
    }
}