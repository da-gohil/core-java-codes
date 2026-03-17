public class MissingNumber{

    public static int missingNumber(int[] nums){

        int n = nums.length+1;
        int sum = 0;
        
        for(int i=0; i< nums.length; i++){
            sum += nums[i];
        }

        long totalSum = n * (n+1)/2;
        return (int)(totalSum - sum);
    }


    public static void main(String[] args) {
        
        int [] arr = {1,2,3,4,6};
        System.out.println(missingNumber(arr));

    }
}