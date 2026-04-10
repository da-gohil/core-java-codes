import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution{
    
    public List<List<Integer>> checkOccurences(int[]nums){

        //01) Count the frequencies
        Map<Integer, Integer> freqMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++){ 
            freqMap.put(nums[i], freqMap.getOrDefault(nums[i], 0) + 1);    
        }

        //02) Convert the map into list of lists
        List<List<Integer>> result = new ArrayList<>();
        
        for(Map.Entry<Integer, Integer> entry : freqMap.entrySet()){
            List<Integer> pair = new ArrayList<>();
            pair.add(entry.getKey());
            pair.add(entry.getValue());
            result.add(pair);
        }
        return result; 
    }
}

public class CountFrequencyHash {
    
    public static void main(String [] args){

        //Input array
        int [] nums = {1,1,1,2,3,3,2,3,4,5,6};
        Solution sol = new Solution();

        List<List<Integer>> output = sol.checkOccurences(nums);

        System.out.println("Result (Element and Frequency)");
        for(List<Integer> pair : output){
            System.out.print(pair);
        }
    }
}