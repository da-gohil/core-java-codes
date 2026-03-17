class BubbleSort {
    public void sort(int[] nums) {
        int n = nums.length;
 
        for (int i = n-1; i >=0 ; i--) {

            for (int j = 0; j <= i-1; j++) {
                if(nums[j] > nums[j+1]){
                    int temp = nums[j+1];
                    nums[j+1] = nums[j];
                    nums[j] = temp;
                }
            }
        }
    }
}

public class Sort2 {
    public static void main(String[] args) {
        int[] nums = {1, 5, 6, 4, 2, 3};

        System.out.println("Unsorted:");
        printArray(nums);

        BubbleSort s1 = new BubbleSort();
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