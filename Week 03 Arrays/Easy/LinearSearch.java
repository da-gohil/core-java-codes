class Solution{
    
    public int search(int[]nums, int number){

        for(int i=0; i<nums.length; i++){
            if(nums[i] == number){
                return i;
            }
        }
        return -1;
    }
}


public class LinearSearch{
    
    public static void main(String [] args){

        int [] nums = {1,2,3,4,5,0};
        Solution sol = new Solution();

        int value = sol.search(nums, 4);

        System.out.print(value + " ");

    }
}