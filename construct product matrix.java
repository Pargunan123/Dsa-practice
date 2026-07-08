class Solution {
    public int[][] constructProductMatrix(int[][] grid) {
           int MOD = 12345;
        int m = grid.length;
        int n = grid[0].length;
        int size = m * n;

        long[] prefix = new long[size];
        long[] suffix = new long[size];

        prefix[0] = 1;
        for (int i = 1; i < size; i++) {
            int val = grid[(i - 1) / n][(i - 1) % n];
            prefix[i] = (prefix[i - 1] * val) % MOD;
        }

        suffix[size - 1] = 1;
        for (int i = size - 2; i >= 0; i--) {
            int val = grid[(i + 1) / n][(i + 1) % n];
            suffix[i] = (suffix[i + 1] * val) % MOD;
        }

        int[][] ans = new int[m][n];
        for (int i = 0; i < size; i++) {
            ans[i / n][i % n] = (int) ((prefix[i] * suffix[i]) % MOD);
        }

        return ans;
    }
}