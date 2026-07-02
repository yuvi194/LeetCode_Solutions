class Solution {
    public String findDifferentBinaryString(String[] nums) {
        char res[]=new char[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i].charAt(i)=='0'){
                res[i]='1';
            }else{
                res[i]='0';
            }
        }
        return new String(res);
    }
}