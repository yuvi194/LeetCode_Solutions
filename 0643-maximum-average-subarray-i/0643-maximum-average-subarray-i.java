class Solution {
    public double findMaxAverage(int[] nums, int k) {
        // double avg= -2147483648;
        // double maxavg= -2147483648;
 
        // int n=nums.length;
        // for (int i=0;i<n-k+1;i++)
        // {   
        //     double sum= 0;
        //     for(int j=0;j<k;j++) 
        //     {   
        //         sum+=nums[i+j];
        //         System.out.print(nums[i+j]+" ");
                
        //     }
        //     System.out.println("sum "+sum);

        //     avg=sum/k;
        //     if (avg>maxavg) maxavg=avg;
        // }
        // return maxavg;
        double sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        double maxSum = sum;
        for (int i = k; i < nums.length; i++) {
            sum += nums[i] - nums[i - k];
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum / k;
    }
}