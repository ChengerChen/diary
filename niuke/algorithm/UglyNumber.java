package nowcoder.algorithm;

/**
 * @author Chenger
 * @description 牛客题 丑数 解法：通过前一个丑数 推导下一个丑数
 * @date 2021/3/1 15:58
 */
public class UglyNumber {

    public static void main(String[] args) {
        System.out.println(-2%2);
        System.out.println(-2/2);
        UglyNumber uglyNum = new UglyNumber();
        System.out.println(uglyNum.GetUglyNumber_Solution(7));
    }

    public int GetUglyNumber_Solution(int index) {
        if(index < 7) {
            return index;
        }
        int i2 = 0, i3 = 0, i5 = 0;
        int q = 1;
        int[] array = new int[index];
        array[0] = 1;
        for (int i = 1; i < index; i++) {
            q = array[i2]*2 < array[i3]*3 ? array[i2]*2 : array[i3]*3;
            array[i] = q < array[i5]*5 ? q : array[i5]*5;
            if(array[i] == array[i2]*2) {
                i2++;
            }
            if(array[i] == array[i3]*3) {
                i3++;
            }
            if(array[i] == array[i5]*5) {
                i5++;
            }
        }
        return array[index-1];
    }
}
