
import java.util.HashSet;
import java.util.Set;

class Solution{
    
    public int removeDuplicates(int[]nums){

        Set<Integer> filterSet = new HashSet<>();

        int index = 0;
        
        for(int num: nums){
        
        if(!filterSet.contains(num)){
            filterSet.add(num);
            nums[index] = num;

            index++;
        }
    }
    return index;
    }
}


public class CheckDuplicate{
    
    public static void main(String [] args){

        int [] nums = {1,1,1,2,3,3,2,3,4,5,6};
        Solution sol = new Solution();

        int k = sol.removeDuplicates(nums);
    
        System.out.println("K: " + k);
        System.out.println("Array after removing the elements: ");
        
        for(int i=0; i<k;i++){
            System.out.println(nums[i] + " ");
        }
    }
}