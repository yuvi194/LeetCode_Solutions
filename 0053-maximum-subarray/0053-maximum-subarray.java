class Solution {
    public int maxSubArray(int[] nums) {
        int sum=nums[0];
        int curr = nums[0];
        //Arrays.sort(nums);
        int n=nums.length;
        if(nums.length==1) return nums[0];
        for(int i=1;i<n;i++){
            if(curr<0){
                curr=0;
            }
            curr=curr+nums[i];
            if(curr>sum){
                sum=curr;
            }
            
        }
        return sum;
    }
}