public class CheckRotatedSortedArray {

    // Method to check if array is sorted and rotated
    public static boolean isSortedAndRotated(int[] nums) {

        int count = 0; // count the number of drops

        for (int i = 0; i < nums.length; i++) {
            int next = (i + 1) % nums.length; // wrap around to first element
            if (nums[i] > nums[next]) {
                count++;
            }
        }

        // Array is valid if at most 1 drop
        return count <= 1;
    }

    public static void main(String[] args) {

        int[] nums1 = {3, 4, 5, 1, 2};
        int[] nums2 = {2, 1, 3, 4};
        int[] nums3 = {1, 2, 3, 4};

        System.out.println("nums1: " + isSortedAndRotated(nums1)); // true
        System.out.println("nums2: " + isSortedAndRotated(nums2)); // false
        System.out.println("nums3: " + isSortedAndRotated(nums3)); // true
    }
}