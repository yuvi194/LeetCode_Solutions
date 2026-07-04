class Solution {
    public int projectionArea(int[][] grid) {
        int n = grid.length;
        int area = 0;
        for (int i = 0; i < n; i++) {
            int row = 0;
            int col = 0;
            for (int j = 0; j < n; j++) {
                if (grid[i][j] > 0) {
                    area++;
                }
                row = Math.max(row, grid[i][j]);
                col = Math.max(col, grid[j][i]);
            }
            area += row + col;
        }

        return area;
    }
}