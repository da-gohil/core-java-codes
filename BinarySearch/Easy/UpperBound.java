class Solution{

    public int upper(int [] arr, int k){
        int low = 0;
        int high = arr.length-1;

        int ans = arr.length;

        while(low <= high){
            int mid = (low + high) / 2;

            if(arr[mid] > k){
                ans = mid;
                high = mid - 1;                
            }else{
                low = mid + 1;
            }
        }
        return ans;
    }
}


public class UpperBound{
    public static void main(String[] args) {
        
        int[] nums = {3, 5, 8, 9, 9, 15, 19};
        int tgt = 9;
        Solution sol = new Solution();
        
        int res = sol.upper(nums, tgt);
        System.out.println(res);
    }
}
