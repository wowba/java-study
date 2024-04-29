package java_basic.array;

public class EnhancedFor {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};

        // 일반 for
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

        // 개선 for
        for (int num : nums) {
            System.out.println(num);
        }
    }
}
