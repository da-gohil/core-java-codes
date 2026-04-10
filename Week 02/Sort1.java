class SelectionSort {
    public void sort(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            // Find the index of the minimum element in the remaining array
            for (int j = i + 1; j < n; j++) {
                if (nums[j] < nums[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first element of the unsorted part
            int temp = nums[minIndex];
            nums[minIndex] = nums[i];
            nums[i] = temp;
        }
    }
}

public class Sort1 {
    public static void main(String[] args) {
        int[] nums = {1, 5, 6, 4, 2, 3};

        System.out.println("Unsorted:");
        printArray(nums);

        SelectionSort s1 = new SelectionSort();
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