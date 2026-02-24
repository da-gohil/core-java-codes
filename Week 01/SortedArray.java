class CheckSortedArray {

    public static boolean isSorted(int[] nums) {

        if (nums == null || nums.length < 2) {
            return true;
        }

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                return false;
            }
        }

        return true;
    }
}

public class SortedArray {

    public static void main(String[] args) {

        int[] myNumbers = {1, 2, 3, 4, 5, 6};

        if (CheckSortedArray.isSorted(myNumbers)) {
            System.out.println("Array is sorted");
        } else {
            System.out.println("Array is NOT sorted");
        }
    }
}