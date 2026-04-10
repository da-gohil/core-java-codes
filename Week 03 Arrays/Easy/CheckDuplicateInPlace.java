class Solution{
    
    public int removeDuplicates(int[]nums){

        //if array is empty then return 0;
        if(nums.length == 0) return 0;

        //pointer declaration
        int leftPointer =0;
        for(int rightPointer = 1; rightPointer < nums.length; rightPointer++){

            if(nums[rightPointer] != nums[leftPointer]){
                leftPointer++;
                nums[leftPointer] = nums[rightPointer];
            }
        }
        return leftPointer + 1;
    }
}


public class CheckDuplicateInPlace{
    
    public static void main(String [] args){

        int [] nums = {1,1,1,2,3,3,3,4,5,6};
        Solution sol = new Solution();

        int k = sol.removeDuplicates(nums);
    
        System.out.println("K: " + k);
        System.out.println("Array after removing the elements: ");
        
        for(int i=0; i<k;i++){
            System.out.println(nums[i] + " ");
        }
    }
}