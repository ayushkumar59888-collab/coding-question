public class TowerOfTemples {
    public static void main(String[] args) {
        int n = 3;

        int moves = hanoiMoves(n);
        System.out.println(moves);
    }
  public static int hanoiMoves(int n) {
        if (n == 0) return 0;
        return 2 * hanoiMoves(n - 1) + 1;
    }
}
