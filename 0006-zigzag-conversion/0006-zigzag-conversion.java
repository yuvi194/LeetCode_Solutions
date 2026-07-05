class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1 || s.length() <= numRows) {
            return s;
        }
        StringBuilder[] rows = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++){
            rows[i] = new StringBuilder();
        }
        int row = 0;
        int dir = -1;
        for (char c : s.toCharArray()) {
            rows[row].append(c);
            if (row == 0 || row == numRows - 1) {
                dir = -dir;
            } 
            row += dir;
        }
        return String.join("", rows);
    }
}