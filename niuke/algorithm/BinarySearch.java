package nowcoder.algorithm;

/**
 * @author Chenger
 * @description 牛客 - 二分查找
 * @date 2021/4/15 15:37
 */
public class BinarySearch {

    public static void main(String[] args) {
        System.out.println(new BinarySearch().search(new int[] {1, 2, 4, 4, 5}, 4));
        System.out.println(new BinarySearch().search(new int[] {1, 2, 4, 4, 5}, 3));
        System.out.println(new BinarySearch().search(new int[] {1, 1, 1, 1, 1}, 1));
    }

    public int search(int[] nums, int target) {
        if(nums != null || nums.length == 0) {
            return -1;
        }
        int left = 0, right = nums.length - 1, mid;
        while (left <= right) {
            mid = (right + left) / 2;
            if(nums[mid] == target) {
                // 往前找
                while (mid > 0 && nums[mid-1] == target) {
                    mid--;
                }
                return mid;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
}
