public class PotionMixing {
    public static void main(String[] args) {
        int n = 4;
        int[] arr = {3, 2, 4, 7};
        int target = 6;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("Indices (" + (i + 1) + ", " + (j + 1) + ")");
                    return; 
                }
            }
        }
    }
}
