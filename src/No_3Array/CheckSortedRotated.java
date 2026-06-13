package No_3Array;

public class CheckSortedRotated {

    public static boolean check(int[] nums) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > nums[(i + 1) % nums.length]) {
                count++;
            }
        }

        return count <= 1;
    }

    public static void main(String[] args) {
        int[] nums1 = {3, 4, 5, 1, 2};
        int[] nums2 = {2, 1, 3, 4};
        int[] nums3 = {1, 2, 3};

        System.out.println(check(nums1)); // true
        System.out.println(check(nums2)); // false
        System.out.println(check(nums3)); // true
    }
}