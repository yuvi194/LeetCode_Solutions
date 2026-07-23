class Solution {
    public int findLUSlength(String[] strs) {
        Map<String, Integer> map = new HashMap<>();
        for (String s : strs) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        Arrays.sort(strs, (a, b) -> Integer.compare(b.length(), a.length()));
        for (int i = 0; i < strs.length; i++) {
            if (map.get(strs[i]) > 1) {
                continue;
            }
            boolean isSub = false;
            for (int j = 0; j < strs.length; j++) {
                if (i == j) {
                    continue;
                }
                if (isSubsequence(strs[i], strs[j])) {
                    isSub = true;
                    break;
                }
            }
            if (!isSub) {
                return strs[i].length();
            }
        }
        return -1;
    }
    private boolean isSubsequence(String a, String b) {
        int i = 0;
        int j = 0;
        while (i < a.length() && j < b.length()) {
            if (a.charAt(i) == b.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == a.length();
    }
}
