package nowcoder.algorithm;

/**
 * @author Chenger
 * @description 牛客 反转链表
 * @date 2021/4/9 17:36
 */
public class RevertList {

    public static void main(String[] args) {
        new RevertList().reverseList(new ListNode(1, new ListNode(2, new ListNode(3, null))));
    }

    private static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode node = null;
        while (head != null) {
            ListNode temp = head.next;
            head.next = node;
            node = head;
            head = temp;
        }
        return node;
    }

}
