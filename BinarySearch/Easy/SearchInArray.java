class Solution{
    public static int binarySearch(int [] nums, int target){
        int n = nums.length;
        int low = 0, high = n - 1;
        
        while(low <= high){
            int mid = (low + high) / 2;

            if(nums[mid] == target) return mid;
            else if(target > nums[mid]){
                low = mid + 1;
            }else{ 
                high = mid - 1;
            }
        }

        return -1;
    }
}

class SearchInArray{
    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5,6,7};
        int tgt = 1;
        int res = Solution.binarySearch(nums, tgt);
        System.out.println(res);

    }
}