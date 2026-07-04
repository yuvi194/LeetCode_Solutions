class Solution {
    public int mostFrequentEven(int[] nums) {
        int [] freq=new int[50001];
        for (int num : nums) {
            if (num % 2 == 0) {
                freq[num / 2]++;
            }
        }
        int ans = -1;
        int maxFreq = 0;
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > maxFreq) {
                maxFreq = freq[i];
                ans = i * 2; 
            }
        }
        return ans;
    }
}