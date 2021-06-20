package leetcode.algorithm;

/**
 * @author Chenger
 * @description 最长回文串
 * @date 2021/3/31 15:42
 * @url
 */
public class Main5 {
    public static void main(String[] args) {
        new Main5().longestPalindrome("aba");
        new Main5().longestPalindrome("abba");
        new Main5().longestPalindrome("babad");
        new Main5().longestPalindrome("cbbd");
        new Main5().longestPalindrome("a");
        new Main5().longestPalindrome("ac");
    }

    int min = 1, max = 1, sum = 1;

    public String longestPalindrome(String s) {
        int length = s.length();
        if(length == 1) {
            return s;
        }
        for (int i = 0; i < length - 1; i++) {
            cal(s, i, i);
            cal(s, i, i + 1);
        }
        return s.substring(min, max + 1);
    }

    public void cal(String s, int beginIndex, int endIndex) {
        for (; beginIndex >= 0 && endIndex < s.length(); beginIndex--, endIndex++) {
            if (s.charAt(beginIndex) == s.charAt(endIndex)) {
                if((endIndex - beginIndex + 1) > sum) {
                    sum = endIndex - beginIndex + 1;
                    min = beginIndex; max = endIndex;
                }
            } else {
                break;
            }
        }
    }
}
