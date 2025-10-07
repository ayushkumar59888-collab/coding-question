public class TreasureChest {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 3};
        int key = 2;

        int index = lastOccurrence(arr, key);
        System.out.println(index);
    }

    public static int lastOccurrence
