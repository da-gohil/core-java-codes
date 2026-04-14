public class CountOccurences {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2,2,2,2,2,2,2,3, 4};
        int k = 2;
        
        // Calling the static method
        int result = countTotalOccurrences(nums, k);
        System.out.println("Total occurrences of " + k + ": " + result);
    }

    public static int countTotalOccurrences(int[] nums, int target) {
        int firstOcc = findFirstOccur(nums, target);
        
        // If it doesn't exist at all, return 0
        if (firstOcc == -1) return 0;

        int lastOcc = findLastOccur(nums, target);
        
        // Math: (lastIndex - firstIndex) + 1
        return (lastOcc - firstOcc) + 1;
    }

    public static int findFirstOccur(int[] nums, int k) {
        int low = 0, high = nums.length - 1;
        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == k) {
                ans = mid;
                high = mid - 1; // Look left
            } else if (nums[mid] < k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    public static int findLastOccur(int[] nums, int k) {
        int low = 0, high = nums.length - 1;
        int ans = -1;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == k) {
                ans = mid;
                low = mid + 1; // Look right
            } else if (nums[mid] < k) { // Fixed this logic
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }
}