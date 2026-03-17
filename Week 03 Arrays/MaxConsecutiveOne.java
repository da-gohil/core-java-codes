class Solution{
    public int findMaxOne(int[] nums){

        int counter = 0, max1 = 0;

        for(int i=0; i<nums.length; i++){

            if(nums[i] == 1){
                counter++;
            }else{
                counter = 0;
            }
            max1 = Math.max(max1, counter);
        }
        return max1;
    }
}

public class MaxConsecutiveOne{
    public static void main(String[] args) {

        int[] numbers = {1,1,0,0,0,1,1,1,1};

        Solution sol = new Solution();

        int res = sol.findMaxOne(numbers);
        System.out.println("The max number of xonsectuive ones are as follows: " + res);
    }
}