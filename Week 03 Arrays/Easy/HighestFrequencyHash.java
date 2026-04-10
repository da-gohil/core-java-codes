
import java.util.HashMap;
import java.util.Map;

class Solution{
    
    public int checkOccurences(int[]nums){

        Map<Integer, Integer> freqMap = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            freqMap.put(nums[i], freqMap.getOrDefault(nums[i], 0) + 1);
        }

        int maxFreq = 0;
        int result = Integer.MAX_VALUE;

        for(Map.Entry<Integer, Integer> entry : freqMap.entrySet()){
            int num = entry.getKey();
            int count = entry.getValue();

            if(count > maxFreq){
                maxFreq = count;
                result = num;
            }else if(count == maxFreq){
                if(num < result){
                    result = num;
                }
            }
        }
        return result;
    }
}

public class HighestFrequencyHash {
    
    public static void main(String [] args){

        //Input array
        int [] nums = {1,1,1,2,3,3,2,3,4,5,6};

        Solution sol = new Solution();
        int mostFrequent = sol.checkOccurences(nums);
        System.out.println("most freq element is: " + mostFrequent);

    }
}