import java.util.Arrays;

public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        // Sort the array
        Arrays.sort(nums);

        // Check for any consecutive elements that are the same
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                return true;
            }
        }

        // If no duplicates were found, return false
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 1};
        System.out.println(containsDuplicate(nums));  // Output: true

        int[] nums2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(containsDuplicate(nums2));  // Output: false
    }
}

