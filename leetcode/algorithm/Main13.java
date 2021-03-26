package leetcode.algorithm;

/**
 * @author Chenger
 * @description 罗马数字转整数
 * @date 2021/3/25 15:21
 * @url https://leetcode-cn.com/problems/roman-to-integer/
 */
public class Main13 {

    public static void main(String[] args) {
        System.out.println(new Main13().romanToInt("III"));
        System.out.println(new Main13().romanToInt("IV"));
        System.out.println(new Main13().romanToInt("IX"));
        System.out.println(new Main13().romanToInt("LVIII"));
        System.out.println(new Main13().romanToInt("MCMXCIV"));
    }

    public int romanToInt(String s) {
        int sum = 0;
        int temp = getValue(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            int num = getValue(s.charAt(i));
            if(temp < num) {
                sum -= temp;
            } else {
                sum += temp;
            }
            temp = num;
        }
        sum += getValue(s.charAt(s.length() - 1));
        return sum;
    }

    public int getValue(char c) {
        switch (c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }
}
