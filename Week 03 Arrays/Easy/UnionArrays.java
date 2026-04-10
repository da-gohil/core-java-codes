
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

class Solution {
    // Function to find the union of two arrays using set
    public List<Integer> findUnion(int[] arr1, int[] arr2) {
        // Create a TreeSet to store unique sorted elements
        Set<Integer> st = new TreeSet<>();

        // Insert elements from first array
        for (int num : arr1) {
            st.add(num);
        }

        // Insert elements from second array
        for (int num : arr2) {
            st.add(num);
        }

        // Convert set to list
        return new ArrayList<>(st);
    }
}

public class UnionArrays{
    public static void main(String[] args) {
        int [] nums1 = {1,2,3,4};
        int [] nums2 = {2,3,4,5};

        Solution sol = new Solution();
        List<Integer> res = sol.findUnion(nums1, nums2);
    }
}