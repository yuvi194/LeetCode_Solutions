import java.util.Stack;

class Solution {
    public boolean find132pattern(int[] nums) {
        if (nums == null || nums.length < 3) {
            return false;
        }
        Stack<Integer> stack = new Stack<>();
        int numsK = Integer.MIN_VALUE;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] < numsK) {
                return true;
            }
            while (!stack.isEmpty() && nums[i] > stack.peek()) {
                numsK = stack.pop();
            }
            stack.push(nums[i]);
        }

        return false;
    }
}