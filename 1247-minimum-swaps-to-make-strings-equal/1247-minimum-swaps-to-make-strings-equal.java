class Solution {
    public int minimumSwap(String s1, String s2) {
        int xy = 0;
        int yx = 0;
        for (int i = 0; i < s1.length(); i++) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);
            if (c1 == 'x' && c2 == 'y') {
                xy++;
            } else if (c1 == 'y' && c2 == 'x') {
                yx++;
            }
        }
        if ((xy + yx) % 2 != 0) {
            return -1;
        }
        return (xy / 2) + (yx / 2) + (xy % 2) * 2;
    }
}