public class QueensJewels {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 2},
            {3, 4, 4},
            {5, 6, 7}
        };
        int target = 4;

        int[] pos = findFirst(matrix, target);
        System.out.println("(" + pos[0] + "," + pos[1] + ")");
    }
    public static int[] findFirst(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
