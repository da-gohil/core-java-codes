class Solution{

    public int lower(int [] arr, int k){
        int low = 0;
        int high = arr.length -1;

        int ans = arr.length;

        while(low <= high){

            int mid = (low + high) / 2;

            if(k == arr[mid]) return mid;
            else if(k < arr[mid]){
                ans = mid;
                high = mid - 1;                
            }else{
                low = mid + 1;
            }
        }
        return ans;
    }
}


public class LowerBound{
    public static void main(String[] args) {
        
        int[] nums = {1,2,2,4,5,6,7};
        int tgt = 2;
        Solution sol = new Solution();
        
        int res = sol.lower(nums, tgt);
        System.out.println(res);
    }
}
