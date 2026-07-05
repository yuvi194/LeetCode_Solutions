class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] res = new boolean[s.length() + 1];
        res[0] = true;
        for (int i = 1; i <= s.length(); i++) {
            for (String str : wordDict) {
                int start = i - str.length();
                if (start >= 0 && res[start] && s.substring(start, i).equals(str)) {
                    res[i] = true;
                    break;
                }
            }
        }
        return res[s.length()];        
    }
}