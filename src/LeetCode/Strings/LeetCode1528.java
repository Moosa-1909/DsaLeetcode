package LeetCode.Strings;

public class LeetCode1528 {
    public static void main(String[] args) {
        String s = "codeleet";
        int[] arr = {4, 5, 6, 7, 0, 2, 1, 3};
        System.out.println(restoreString(s, arr));
    }

    public static String restoreString(String s, int[] indices) {
        char[] result = new char[s.length()];

        for (int i = 0; i < indices.length; i++) {
            // Place character at original index 'i' into its target position 'indices[i]'
            result[indices[i]] = s.charAt(i);
        }

        return new String(result);
    }
}