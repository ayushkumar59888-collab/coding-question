public class MessengersPath {
    public static void main(String[] args) {
        int[][] grid = {
            {0,0,0},
            {0,1,0},
            {0,0,0}
        };

        System.out.println(canReach(grid, 0, 0));
    }

    public static boolean canReach(int[][] grid, int x, int y) {
        int n = grid.length;
        int m = grid[0].length;

        if (x < 0 || x >= n || y < 0 || y >= m || grid[x][y] == 1) return false;


        if (x == n - 1 && y == m - 1) return true;


        grid[x][y] = 1;

        if (canReach(grid, x+1, y)) return true;
        if (canReach(grid, x-1, y)) return true;
        if (canReach(grid, x, y+1)) return true;
        if (canReach(grid, x, y-1)) return true;

        return false;
    }
}
