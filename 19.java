public class ArchersRange {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 3};
        int key = 2;

        int index = firstOccurrence(arr, key);
        System.out.println(index);
    }

    public static int firstOccurrence(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) return i; 
        }
        return -1; 
    }
}
