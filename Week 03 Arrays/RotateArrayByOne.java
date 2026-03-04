class Solution{
    
    public void rotateArr(int[]nums){

        //if array is empty then return 0;
        if(nums.length == 0) return ;
        
        int temp = nums[0];

        for(int i = 1; i < nums.length; i++){
            nums[i-1] = nums[i];
        }

        nums[nums.length-1] = temp;
    }
}


public class RotateArrayByOne{
    
    public static void main(String [] args){

        int [] nums = {1,2,3,4,5,6};
        Solution sol = new Solution();

        sol.rotateArr(nums);
    
        for(int num: nums){
            System.out.println(num + " ");
        }
    }
}