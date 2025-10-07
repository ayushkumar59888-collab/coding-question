public class LostSoldier {
    public static void main(String[] args) {
        int n = 5;
        int[] arr = {0, 1, 2, 4, 5};
        int totalSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }
        int missing = totalSum - actualSum;

        System.out.println("Missing soldier: " + missing);
    }
}
