class Solution {
    public String reorganizeString(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        char max = ' ';
        int freq = 0;
        for (char c : map.keySet()) {
            if (map.get(c) > freq) {
                freq = map.get(c);
                max = c;
            }
        }
        int n = s.length();
        if (freq > (n + 1) / 2) {
            return "";
        }
        char[] res = new char[n];
        int i = 0;
        while (map.get(max) > 0) {
            res[i] = max;
            i += 2;
            map.put(max, map.get(max) - 1);
        }
        for (char c : map.keySet()) {
            while (map.get(c) > 0) {
                if (i >= n) {
                    i = 1; 
                }
                res[i] = c;
                i += 2;
                map.put(c, map.get(c) - 1);
            }
        }
        return String.valueOf(res);
    }
}