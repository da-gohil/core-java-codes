class Solution{
    public static int binarySearch(int [] nums, int low, int high, int target){

        if(low > high) return -1;

        int mid = (low + high) / 2;

        if(nums[mid] == target) return mid;
        else if (target > nums[mid]) {
            return binarySearch(nums, mid + 1, high, target);
        }else{
            return binarySearch(nums, low, high-1, target);
        }
    }

    public static int search(int[] nums, int target){
        return binarySearch(nums, 0, nums.length - 1, target);
    }
}

class SearchInArrayRecursion{
    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5,6,7};
        int tgt = 5;
        int res = Solution.search(nums, tgt);
        System.out.println(res);

    }
}