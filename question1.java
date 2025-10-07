public class KingsFeast {
    public static void main(String[] args) {
        int n = 5;
        int[] arr = {2, 7, 1, 9, 5};
         int maxFood = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > maxFood) {
                maxFood = arr[i];
            }
        }
        System.out.println("Maximum food plate: " + maxFood);
    }
}
