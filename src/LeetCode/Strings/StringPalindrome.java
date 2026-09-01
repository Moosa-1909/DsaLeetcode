package LeetCode.Strings;

public class StringPalindrome {
    public static void main(String[] args) {
        String str = "abbabba";
        String str2= "aaaaabbbbbaaaaaa";
        System.out.println(checkpallindrome(str));
        System.out.println(checkpallindrome(str2));
    }

    public static boolean checkpallindrome(String str) {
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}