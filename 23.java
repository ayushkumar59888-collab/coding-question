public class CeilValue {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 6, 8};
        int target1 = 5;
        int target2 = 9;

        System.out.println("Ceil of 5: " + ceil(arr, target1));
        System.out.println("Ceil of 9: " + ceil(arr, target2));
    }

    public static int ceil(int[] arr, int target) {
        int left = 0;
        int right = arr.length;
        int n = arr.length;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        if (left < n) return arr[left]; 
        return -1;
    }
}
