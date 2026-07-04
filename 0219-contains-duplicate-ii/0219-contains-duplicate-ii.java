class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int i=0;
        while(i<nums.length){
            int j= i+1;
            while(Math.abs(i-j) <=k && j<nums.length){
                if(nums[i]==nums[j]){
                     return true;
                }
                j++;
            }
            i++;
        }
        return false;
    }
}