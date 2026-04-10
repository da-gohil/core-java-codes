
import java.util.HashMap;
import java.util.Map;

class Solution{

    public int maxLen(int[] nums, int k){

        Map<Integer, Integer> preSum = new HashMap<>();
        int maxLen = 0, sum = 0;
        
        for(int i=0; i<nums.length; i++){
            sum = sum + nums[i];

            if(sum==0){
                //do something
                maxLen = i+1;
            }else{
                // do something
                if(preSum.containsKey(sum)){
                    maxLen = Math.max(maxLen, i-preSum.get(sum));
                }else{
                    preSum.put(sum,i);
                }
            }
        }
        return maxLen;
    }
}

public class PrefixSum{
    public static void main(String[] args){
        
        int[] numbers = {9,-3,3,-1,6,-5};
        int k = 10;
        Solution sol = new Solution();
        int result = sol.maxLen(numbers, k);

        System.out.println(result);
    }
}