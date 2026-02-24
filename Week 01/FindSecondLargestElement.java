import java.util.Arrays;

class FindMinMaxElement {

    public static void findSecondMinMax(int[] nums) {

        if (nums == null || nums.length < 2) {
            System.out.println("-1 -1");
            return;
        }

        Arrays.sort(nums);

        int secondMin = nums[1];
        int secondMax = nums[nums.length - 2];

        System.out.println("Second Smallest: " + secondMin);
        System.out.println("Second Largest: " + secondMax);
    }
}

public class FindSecondLargestElement {

    public static void main(String[] args) {

        int[] myNumbers = {1,1,1,1,1,1,1};

        FindMinMaxElement.findSecondMinMax(myNumbers);
    }
}