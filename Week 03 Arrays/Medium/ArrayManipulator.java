class Solution{
    public int[] manipulate(int[] nums){

        int n = nums.length;
        int[] res = new int[n]; 

        int positiveIdx = 0, negativeIdx = 1;

        for(int i=0; i<n; i++){
            if(nums[i] < 0){
                res[negativeIdx] = nums[i];
                negativeIdx += 2;
            }else{
                res[positiveIdx] = nums[i];
                negativeIdx += 2;
            }
        }
        return res;
    }
}