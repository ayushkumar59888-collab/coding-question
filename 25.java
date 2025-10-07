public class TreasureMap {
    public static void main(String[] args) {
        int n = 3, m = 3;
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int target = 5;

        if (searchTreasure(matrix, n, m, target)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
    public static boolean searchTreasure(int[][] matrix, int n, int m, int target) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == target) return true;
            }
        }
        return false;
    }
}
