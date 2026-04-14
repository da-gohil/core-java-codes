class Solution{

    public int checkInsertion(int [] arr, int k){
        int n = arr.length;
        int low = 0, high = n-1;
        int ans = n;

        while(low <= high){
            int mid = (low + high) / 2;

            if(arr[mid] >= k){
                ans = mid;
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return ans;
    }
}

public class InsertionSortedArray{
    public static void main(String[] args) {
        
        int[] nums = {1,2,4,7};
        int tgt = 6;
        Solution sol = new Solution();
        
        int res = sol.checkInsertion(nums, tgt);
        System.out.println(res);
    }
}