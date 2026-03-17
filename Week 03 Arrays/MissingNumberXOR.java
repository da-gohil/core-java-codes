public class MissingNumberXOR{

    public static int missingNumber(int[] nums){

        int n = nums.length + 1;
        int xor1 = 0, xor2 =0;

        //Step01 XOR all the elements in the array
        for(int i = 0; i < nums.length; i++){
            xor2 ^= nums[i];
        }

        for(int i=1; i<=n; i++){
            xor1 ^= i;
        }

        return xor1 ^ xor2;
    }


    public static void main(String[] args) {
        
        int [] arr = {1,2,3,4,6,7,8,9,22,10};
        System.out.println(missingNumber(arr));

    }
}