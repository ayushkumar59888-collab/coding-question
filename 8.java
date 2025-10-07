public class RoyalDiagonal {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int n = arr.length;
        int primarySum = 0;
        int secondarySum = 0;

        for (int i = 0; i < n; i++) {
            primarySum += arr[i][i];           
            secondarySum += arr[i][n - 1 - i];
        }

        System.out.println("Primary diagonal sum = " + primarySum);
        System.out.println("Secondary diagonal sum = " + secondarySum);
    }
}
