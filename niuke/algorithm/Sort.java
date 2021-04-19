package nowcoder.algorithm;

/**
 * @author Chenger
 * @description 牛客 - 数组排序
 * @date 2021/4/16 17:18
 */
public class Sort {

    public static void main(String[] args) {
        final int[] sort = new Sort().quickSort(new int[]{3, 1, 4, 2, 10, 8});
        for (int i = 0; i < sort.length; i++) {
            System.out.print(sort[i] + " ");
        }
        System.out.println();
        final int[] sort2 = new Sort().quickSort(new int[]{5, 2, 3, 1, 4});
        for (int i = 0; i < sort2.length; i++) {
            System.out.print(sort2[i] + " ");
        }
        System.out.println();
        final int[] sort3 = new Sort().quickSort(new int[]{5, 1, 6, 2, 5});
        for (int i = 0; i < sort3.length; i++) {
            System.out.print(sort3[i] + " ");
        }
    }

    /**
     * 快排 - 递归实现   非递归方法采用栈来存储left、right
     * @param array
     * @return
     */
    public int[] quickSort(int[] array) {
        if(array != null && array.length > 0) {
            int length = array.length;
            // 递归实现
            recursion(array, 0, length - 1);
        }
        return array;
    }

    public void recursion(int[] array, int left, int right) {
        if(left >= right) {
            return;
        }
        int temp = array[left], low = left, high = right;
        while (left < right) {
            while (left < right && temp <= array[right]) {
                right--;
            }
            if (left < right) {
                array[left++] = array[right];
            }
            while (left < right && temp >= array[left]) {
                left++;
            }
            if (left < right) {
                array[right--] = array[left];
            }

        }
        array[left] = temp;
        recursion(array, low, left - 1);
        recursion(array, right + 1, high);
    }
}
