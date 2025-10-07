public class FloorValue {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 6, 8};
        int target1 = 5;
        int target2 = 0;

        System.out.println("Floor of 5: " + floor(arr, target1));
        System.out.println("Floor of 0: " + floor(arr, target2));
    }

    public static int floor(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] <= target) {
                result = arr[mid];   
                left = mid + 1;      
            } else {
                right = mid - 1;    
            }
        }

        return result;
    }
}
