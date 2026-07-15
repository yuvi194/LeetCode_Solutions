class Solution {
    public int rearrangeCharacters(String s, String target) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        Map<Character, Integer> map1 = new HashMap<>();
        for (char c : target.toCharArray()) {
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        }

        int max = Integer.MAX_VALUE;
        for (Map.Entry<Character, Integer> entry : map1.entrySet()) {
            char c = entry.getKey();
            int requiredCount = entry.getValue();
            int availableCount = map.getOrDefault(c, 0);
            max = Math.min(max, availableCount / requiredCount);
        }

        return max;
    }
}