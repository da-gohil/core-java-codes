public class MissingNumberXOR2{

    public static int missingNumber(int[] nums) {
        int xorr = 0;
        int n = nums.length;

        // XOR all numbers in the expected range [0, n]
        for (int i = 0; i <= n; i++) {
            xorr ^= i;
        }

        // XOR all numbers actually present in the array
        for (int num : nums) {
            xorr ^= num;
        }

        return xorr;
    }
    public static void main(String[] args) {
        
        int [] arr = {1,2,2,1,3};
        System.out.println(missingNumber(arr));

    }
}