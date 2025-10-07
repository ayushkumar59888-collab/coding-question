public class TreasureIsland {
    public static void main(String[] args) {
        int[][] arr = {
            {3, 3, 3},
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int maxSum = 0;
        int maxRow = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
            if (sum > maxSum) {
                maxSum = sum;
                maxRow = i;
            }
        }

        System.out.println("Row " + maxRow + " (sum=" + maxSum + ")");
    }
}
