public class MagicalStaircase {
    public static void main(String[] args) {
        int n = 4; 
        System.out.println("Number of ways: " + countWays(n));
    }

    public static int countWays(int n) {
        if (n == 0 || n == 1) return 1;

        int a = 1; 
        int b = 1; 
        int c = 0;

        for (int i = 2; i <= n; i++) {
            c = a + b; 
            a = b;
            b = c;
        }

        return c;
    }
}
