
import java.util.HashMap;

class Solution{

    public static String checkSum(int[] nums, int k){

        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
  
        for(int i=0; i<n; i++){
            int reqNumber = k - nums[i];
            if(map.containsKey(reqNumber)){
                return "YES";
            }
            map.put(nums[i], i);
        }
        return "NO";
    }

    public int[] twoSumIndices(int[] arr, int target){
        HashMap<Integer, Integer> map = new HashMap<>();

        int n = arr.length;

        for(int i=0; i<arr.length; i++){
            int reqNumber = target - arr[i];

            if(map.containsKey(reqNumber)){
                return  new int[]{
                    map.get(reqNumber),i
                };
            }
            map.put(arr[i], i);
        }
        return new int[]{-1, -1};
    }
}

class TwoSum{
    public static void main(String[] args) {
        
        int[] nums = {1,2,3,4,5,6,7};
        int k = 4;

        Solution sol = new Solution();
    
        String res = sol.checkSum(nums,k);
        int[] res1 = sol.twoSumIndices(nums,k);
        

        System.out.println("Res: " + res);

        for(int ress: res1){
            System.out.print("[ " + ress + " ]");
        }
    }
}