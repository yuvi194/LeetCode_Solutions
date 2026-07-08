class Solution {
    public int findClosestNumber(int[] nums) {
        int close=nums[0];
        for(int i=0;i<nums.length;i++){
            int curr=nums[i];
            if(Math.abs(curr)<Math.abs(close)){
                close=curr;
            }
            else if(Math.abs(curr)==Math.abs(close) && curr>close){
                close=curr;
            }
        }
        return close;
    }
}