
class FindMinMaxElement {

    public static void findSecondMinMax(int[] nums) {

        if (nums == null || nums.length < 2) {
            System.out.println("-1 -1");
            return;
        }

        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        
        for(int num: nums){

            if(num < min){
                secondMin = min;
                min = num;
            }else if(num < secondMin && num != min){
                secondMin = num;
            }

            if(num > max){
                secondMax = max;
                max = num;
            }else if(num > secondMax && num != max){
                secondMax = num;
            }
        }

        if(secondMax == Integer.MIN_VALUE) secondMax = -1;
        if(secondMin == Integer.MAX_VALUE) secondMin = -1;
        
        System.out.println("Second Smallest: " + secondMin);
        System.out.println("Second Largest: " + secondMax);
    }
}

public class FindSecondLargestElement2 {

    public static void main(String[] args) {

        int[] myNumbers = {1,2,31,31,21,11,61};

        FindMinMaxElement.findSecondMinMax(myNumbers);
    }
}