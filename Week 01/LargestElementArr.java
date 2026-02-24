class FindLargestElement{

    public int findMaxElement(int [] nums){

        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }
        
        int max = nums[0];
        for(int i=1; i <nums.length; i++){
            if(nums[i]>max){
                max = nums[i];
            }
        }
        return max;
    }
}


public class LargestElementArr{

    public static void main(String [] args){
        int [] myNumbers = {-4, -3, 0, 1, -8};
        
        FindLargestElement findMax = new FindLargestElement();

        int max = findMax.findMaxElement(myNumbers);
        System.out.println("Largest number: " + max);
    
    }
}