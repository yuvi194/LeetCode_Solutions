class Solution {
    public String decodeAtIndex(String s, int k) {
        long length = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                length *= (ch - '0');
            } else {
                length++;
            }
        }
        for (int i = n - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            k %= length; 
            if (k == 0 && Character.isLetter(ch)) {
                return Character.toString(ch);
            }
            if (Character.isDigit(ch)) {
                length /= (ch - '0');
            } else {
                length--;
            }
        }
        return "";
    }
}