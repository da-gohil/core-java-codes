class Solution {

    public int[] getFloorAndCeil(int[] arr, int k) {
        int f = findFloor(arr, k);
        int c = findCeil(arr, k);
        return new int[]{f, c};
    }

    // Ceil: Smallest number in array >= k
    public int findCeil(int[] nums, int k) {
        int low = 0, high = nums.length - 1;
        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] >= k) {
                ans = nums[mid]; // This could be our ceil
                high = mid - 1;  // Look for a smaller value on the left
            } else {
                low = mid + 1;   // Value is too small, move right
            }
        }
        return ans;
    }

    // Floor: Largest number in array <= k
    public int findFloor(int[] nums, int k) {
        int low = 0, high = nums.length - 1;
        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] <= k) {
                ans = nums[mid]; // This could be our floor
                low = mid + 1;   // Look for a larger value on the right
            } else {
                high = mid - 1;  // Value is too big, move left
            }
        }
        return ans;
    }
}

public class CeilAndFloor {
    public static void main(String[] args) {
        int[] nums = {1, 2, 4, 7};
        int tgt = 6;
        Solution sol = new Solution();
        
        int[] res = sol.getFloorAndCeil(nums, tgt);

        System.out.println("Floor: " + res[0]); // Should be 4
        System.out.println("Ceiling: " + res[1]); // Should be 7
    }
}