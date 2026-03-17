class MergeSort {
    public void sort(int[] nums, int low, int high) {

        if(low >= high) return;
        
        //1. Find the middle point
        int mid = low + (high - low) / 2;
        
        //2. Split the left half
        sort(nums, low, mid);

        //3. Split the right half
        sort(nums, mid + 1, high);

        //4. Merge the sorted one together
        merge(nums, low, mid, high);
    }

    private void merge(int[]nums, int low, int mid, int high){
        int[] temp = new int[high - low + 1];
        int leftPointer = low;
        int rightPointer = mid + 1;
        int k = 0;

        // Compare and pick the smaller element
        while (leftPointer <= mid && rightPointer <= high) {
            if (nums[leftPointer] <= nums[rightPointer]) {
                temp[k++] = nums[leftPointer++];
            } else {
                temp[k++] = nums[rightPointer++];
            }
        }
        // Clean up remaining elements
        while (leftPointer <= mid) temp[k++] = nums[leftPointer++];
        while (rightPointer <= high) temp[k++] = nums[rightPointer++];

        // Copy temp back to original array
        for (int i = 0; i < temp.length; i++) {
            nums[low + i] = temp[i];
        }
    }
}

public class Sort4 {
    public static void main(String[] args) {
        int[] nums = {1, 5, 6, 4, 2, 3};

        MergeSort s1 = new MergeSort();
        // Pass 0 (start) and nums.length - 1 (end)
        s1.sort(nums, 0, nums.length - 1); 

        System.out.println("Sorted using REAL Merge Sort:");
        for (int num : nums) System.out.print(num + " ");
    }

    // Helper method to make printing cleaner
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}