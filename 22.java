public class UpperBound {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 6, 8};
        int target1 = 6;
        int target2 = 7;

        System.out.println("Upper bound for 6: " + upperBound(arr, target1));
        System.out.println("Upper bound for 7: " + upperBound(arr, target2));
    }

    public static int upperBound(int[] arr, int target) {
        int left = 0;
        int right = arr.length;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left; 
    }
}
