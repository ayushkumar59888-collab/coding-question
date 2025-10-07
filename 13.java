public class SorcerersSpell {
    public static void main(String[] args) {
        String str = "abc";
        String reversed = reverse(str);
        System.out.println(reversed);
    }

    public static String reverse(String str) {
        if (str.isEmpty()) return ""; 
        return reverse(str.substring(1)) + str.charAt(0);
    }
}
