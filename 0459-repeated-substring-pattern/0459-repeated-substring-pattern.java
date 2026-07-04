class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String concats = s + s;
        String sub = concats.substring(1,concats.length()-1);
        return sub.contains(s);
    }
}