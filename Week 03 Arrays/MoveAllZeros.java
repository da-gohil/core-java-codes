

class Solution{
    
    public void moveZeros(int[]nums){
        
        //Pointer to the first zero
        int rightPointer = -1;
        
        //Finding the first Zero
        for(int leftPointer=0; leftPointer < nums.length; leftPointer++){
            if(nums[leftPointer] == 0){
                rightPointer = leftPointer;
                break;
            }
        }

        if(rightPointer == -1)return;
        
        //Start from the next index of first zero
        for(int leftPointer = rightPointer + 1; leftPointer < nums.length; leftPointer++){
            if(nums[leftPointer] != 0){    
                int temp = nums[leftPointer];
                nums[leftPointer] = nums[rightPointer];
                nums[rightPointer] = temp;
                rightPointer++;
            }
        }
    }
}


public class MoveAllZeros{
    
    public static void main(String [] args){

        int [] nums = {1,2,3,0,5,0};
        Solution sol = new Solution();

        sol.moveZeros(nums);

        //Print the results
        for(int num: nums){
            System.out.print(num + " ");
        }
    }
}