import java.util.*;

class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {

        int m = grid.length;
        int n = grid[0].length;

        k %= (m * n);

        while (k-- > 0) {

            int last = grid[m - 1][n - 1];

            for (int i = m - 1; i >= 0; i--) {
                for (int j = n - 1; j >= 0; j--) {

                    if (j > 0) {
                        grid[i][j] = grid[i][j - 1];
                    } else if (i > 0) {
                        grid[i][0] = grid[i - 1][n - 1];
                    }
                }
            }

            grid[0][0] = last;
        }

        List<List<Integer>> ans = new ArrayList<>();

        for (int[] row : grid) {
            List<Integer> temp = new ArrayList<>();
            for (int num : row) {
                temp.add(num);
            }
            ans.add(temp);
        }

        return ans;
    }
}
