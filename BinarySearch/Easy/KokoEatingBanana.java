
class Solution {
    // Function to calculate total hours at given speed
    private long calculateTotalHours(int[] piles, int speed) {
        long totalH = 0;
        for (int bananas : piles) {
            // Using integer math for ceil is often more robust: (bananas + speed - 1) / speed
            totalH += Math.ceil((double)bananas / speed);
        }
        return totalH;
    }

    public int minEatingSpeed(int[] piles, int h) {
        int low = 1, high = 0;

        for (int pile : piles) {
            high = Math.max(high, pile);
        }
        
        int ans = high;
        
        // Binary search on the answer space
        while (low <= high) {
            int mid = low + (high - low) / 2; // Prevents overflow for mid calculation
            long totalH = calculateTotalHours(piles, mid);

            if (totalH <= h) {
                ans = mid;
                high = mid - 1; // Try to find an even slower speed
            } else {
                low = mid + 1; // Need to eat faster
            }
        }
        return ans;
    }
}

public class KokoEatingBanana {
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Test Case 1
        int[] piles1 = {3, 6, 7, 11};
        int h1 = 8;
        System.out.println("Test Case 1 (Expected 4): " + sol.minEatingSpeed(piles1, h1));

        // Test Case 2
        int[] piles2 = {30, 11, 23, 4, 20};
        int h2 = 5;
        System.out.println("Test Case 2 (Expected 30): " + sol.minEatingSpeed(piles2, h2));

        // Test Case 3
        int[] piles3 = {30, 11, 23, 4, 20};
        int h3 = 6;
        System.out.println("Test Case 3 (Expected 23): " + sol.minEatingSpeed(piles3, h3));
    }
}