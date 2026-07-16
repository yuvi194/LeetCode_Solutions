class Solution {
    public long gcdSum(int[] nums) {
        int n = nums.length;
        long[] prefix = new long[n];
        long max = 0;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, nums[i]);
            prefix[i] = gcd(nums[i], max);
        }
        Arrays.sort(prefix);
        long sum = 0;
        int l = 0;
        int r = n - 1;
        while (l < r) {
            sum += gcd(prefix[l], prefix[r]);
            l++;
            r--;
        }
        return sum;
    }
    private long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}