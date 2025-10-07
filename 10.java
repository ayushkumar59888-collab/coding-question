public class RainwaterPond {
    public static void main(String[] args) {
        int[][] grid = {
            {1,0,1},
            {0,1,0},
            {1,0,1}
        };

        int pondCount = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    pondCount++;
                    markPond(grid, i, j);
                }
            }
        }

        System.out.println(pondCount);
    }

    public static void markPond(int[][] grid, int i, int j) {
        int n = grid.length;
        int m = grid[0].length;

        if (i < 0 || i >= n || j < 0 || j >= m || grid[i][j] == 0) return;

        grid[i][j] = 0; 

  
        markPond(grid, i+1, j);
        markPond(grid, i-1, j);
        markPond(grid, i, j+1);
        markPond(grid, i, j-1);
    }
}
