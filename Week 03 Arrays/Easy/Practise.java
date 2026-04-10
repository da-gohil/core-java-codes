class Solution{
    public static int checkSorted(int [] nums, int n){
        int min = Integer.MIN_VALUE , secondMin = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE, secondMax = Integer.MAX_VALUE;



        for(int i =1; i < nums.length; i++){

            if(nums[i] < min){
                min = nums[i];
            }    
        }
        return min;
    }
}

public class Practise{
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,15};
        int n = nums.length;

        int min = Solution.checkSorted(nums, n);
        
        System.out.println(min);
    }
}