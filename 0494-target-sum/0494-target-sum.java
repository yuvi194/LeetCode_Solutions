class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return backtrack(nums, 0, 0, target);
    }
    private int backtrack(int[] nums, int index, int sum, int target) {
        if (index == nums.length) {
           if (sum == target) {
                return 1;
            } else {
                return 0;
            }
        }
        int add = backtrack(nums, index + 1, sum + nums[index], target);
        int sub = backtrack(nums, index + 1, sum - nums[index], target);
        return add + sub;
    }
}