public class LowerBound {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 6, 8};
        int target1 = 6;
        int target2 = 5;

        System.out.println("Lower bound for 6: " + lowerBound(arr, target1));
        System.out.println("Lower bound for 5: " + lowerBound(arr, target2));
    }

    public static int lowerBound(int[] arr, int target) {
        int left = 0;
        int right = arr.length;
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left; 
    }
}
