class Solution{
    public void reverse(int[]num){
        int leftPointer = 0;
        int rightPointer = num.length - 1;

        while(leftPointer < rightPointer){
            int temp = num[leftPointer];
            leftPointer = num[rightPointer];
            rightPointer = temp;
            

            leftPointer++;
            rightPointer--;
        }
        
    }
}

public class ReverseOfArray{
    public static void main(String[] args) {
        Solution s1 = new Solution();
        int [] nums = {3,2,1};

        s1.reverse(nums);
        for(int num: nums){
            System.out.print(num + " ");
        }
    }
}