class Solution {
    public List<Integer> findLonely(int[] nums) {
        Arrays.sort(nums);
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && (nums[i] == nums[i - 1] || nums[i] == nums[i - 1] + 1)) {
                continue;
            }
            if (i < nums.length - 1 && (nums[i] == nums[i + 1] || nums[i] == nums[i + 1] - 1)) {
                continue;
            }
            res.add(nums[i]);
        }
        return res;
    }
}