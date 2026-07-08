class Solution {
    public int maximumCount(int[] nums) {
        int l = 0;
        int r = nums.length;
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] >= 0){
                r = mid;
            }
            else{
                l = mid + 1;
            }
        }
        int negCount = l;
        l = 0; 
        r= nums.length;
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] >= 1){
                r = mid;
            }
            else{ 
                l = mid + 1;
            }
        }
        int posCount = nums.length - l;

        return Math.max(negCount, posCount);
    }
}