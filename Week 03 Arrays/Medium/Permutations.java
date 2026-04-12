class Solution {
    public void nextPermutation(int[] nums) {
        
        //initialize index
        int index = -1;

        //find first decreasing element
        for (int i = nums.length - 2; i >= 0; i--) {
            //if smaller found
            if (nums[i] < nums[i + 1]) {
                index = i;
                break;
            }
        }

        //find the number just large
        for(int i = nums.length - 1; i>index; i--){
            if(nums[i] > nums[index]){
                swap(nums, i, index);
                break;
            }
        }

        //if decreasing not found then 
        if (index == -1) {
            //reverse the entire array if no idex is found decreasing
            reverse(nums, 0, nums.length - 1);
            return;
        }
        // Reverse part after index
        reverse(nums, index + 1, nums.length - 1);
    }

    // Helper to reverse array
    private void reverse(int[] arr, int start, int end) {
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }
    
    // Helper to swap
    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
