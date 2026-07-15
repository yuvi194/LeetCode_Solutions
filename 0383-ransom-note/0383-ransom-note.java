import java.util.HashMap;

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        HashMap<Character, Integer> map = new HashMap<>();

        // Frequency Check Kar Rahe Hai
        for (int i = 0; i < magazine.length(); i++) {
            char ch = magazine.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Ransom Note ka char check kar rahe hai
        for (int i = 0; i < ransomNote.length(); i++) {
            char ch = ransomNote.charAt(i);

            if (!map.containsKey(ch) || map.get(ch) == 0) {
                return false;
            }

            map.put(ch, map.get(ch) - 1);
        }

        return true;
    }
}