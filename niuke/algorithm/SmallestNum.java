package nowcoder.algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Chenger
 * @description 最小的k个数 - 解法：使用选择插入排序/冒泡，找出前k个数
 * @date 2021/4/12 18:11
 */
public class SmallestNum {

    public static void main(String[] args) {
        System.out.println();
        new SmallestNum().GetLeastNumbers_Solution(new int[] {4,5,1,6,2,7,3,8}, 4).forEach(System.out::println);
    }

    public List<Integer> getLeastNumbersSolution(int [] input, int k) {
        List<Integer> list = new ArrayList();
        int length = input.length;
        if(k > length) {
            return list;
        }
        for (int i = 0; i < k; i++) {
            int temp = input[i];
            for (int j = i + 1; j < length; j++) {
                if(input[j] < input[temp]) {
                    temp = j;
                }
            }
            list.add(input[temp]);
            input[temp] = input[i];
        }
        return list;
    }
}
