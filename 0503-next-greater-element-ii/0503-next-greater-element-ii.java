class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int num[]=new int [nums.length];
        for(int i=0;i<nums.length;i++){
            int ans=-1;
            for (int j = 1; j < nums.length; j++) {
                int next = (i + j) % nums.length;
                if (nums[next] > nums[i]) {
                    ans = nums[next];
                    break; 
                }else{
                    ans=-1;
                }
            }
            num[i] = ans;
        }
        return num;
    }
}