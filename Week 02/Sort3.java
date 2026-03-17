class InsertionSort {
    public int[] sort(int[] nums) {

        //Take the size of the array
        int n = nums.length;

        for(int i=1; i<n; i++){
            int firstKey = nums[i];
            int j = i - 1;

            while(j >= 0 && nums[j] > firstKey){
                nums[j+1] = nums[j];
                j--;
            }
            nums[j + 1] = firstKey;
        }
       return nums;
    }
}

public class Sort3 {
    public static void main(String[] args) {
        int[] nums = {1, 5, 6, 4, 2, 3};

        System.out.println("Unsorted:");
        printArray(nums);

        InsertionSort s1 = new InsertionSort();
        s1.sort(nums);

        System.out.println("\nSorted:");
        printArray(nums);
    }

    // Helper method to make printing cleaner
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}