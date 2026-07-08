class Solution {
    public void wiggleSort(int[] nums) {
        int[] arr = nums.clone(); 
        Arrays.sort(arr);
        int left = (nums.length - 1) / 2;
        int right = nums.length - 1;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                nums[i]=arr[left];
                left--;
            }else{
                nums[i]=arr[right];
                right--;
            }
        }
    }
}