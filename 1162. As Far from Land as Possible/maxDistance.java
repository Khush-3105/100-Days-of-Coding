class Solution {
    public int maxDistance(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    queue.offer(new int[]{i, j});
                    visited[i][j] = true;
                }
            }
        }

        if (queue.isEmpty() || queue.size() == m * n) {
            return -1;
        }
        int[][] DIRS = {{0, -1}, {0, 1}, {-1, 0}, {1, 0}};
        int step = 0;
        while (!queue.isEmpty()) {
            for (int size = queue.size(), i = 0; i < size; i++) {
                int[] curr = queue.poll();
                for (int[] dir : DIRS) {
                    int nextRow = curr[0] + dir[0], nextCol = curr[1] + dir[1];
                    if (nextRow < 0 || nextRow >= m || nextCol < 0 || nextCol >= n || visited[nextRow][nextCol] || grid[nextRow][nextCol] == 1) {
                        continue;
                    }
                    queue.offer(new int[]{nextRow, nextCol});
                    visited[nextRow][nextCol] = true;
                }
            }
            step++;
        }
        return step-1;
    }
}