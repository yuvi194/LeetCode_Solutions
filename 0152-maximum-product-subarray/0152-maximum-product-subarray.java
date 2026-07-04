class Solution {
    public int maxProduct(int[] nums) {
        int pro = nums[0];
        int curr = 0; 
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (curr == 0) { 
                curr = 1; 
            }
            curr = curr * nums[i];
            if (curr > pro) {
                pro = curr;
            }
        }
        curr = 0; 
        for (int i = n - 1; i >= 0; i--) {
            if (curr == 0) {
                curr = 1;
            }
            curr = curr * nums[i];
            if (curr > pro) {
                pro = curr;
            }
        }
        return pro;
    }
}