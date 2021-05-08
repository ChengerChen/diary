package leetcode.algorithm;

/**
 * @author Chenger
 * @description 两数相加
 * @date 2021/2/26 14:21
 * @url
 */
public class Main2 {

    public static void main(String[] args) {
        Main2 main = new Main2();
        ListNode head1 = main.addTwoNumbers(new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))))))), new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9)))));
        ListNode head2 = main.addTwoNumbers(new ListNode(2, new ListNode(4, new ListNode(3))), new ListNode(5, new ListNode(6, new ListNode(4))));

    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int highDigits = 0;
        ListNode head = new ListNode();
        ListNode p = head;
        while (l1 != null || l2 != null) {
            int val1 = l1 != null ? l1.val : 0;
            int val2 = l2 != null ? l2.val : 0;
            p.next = new ListNode((val1 + val2 + highDigits) % 10);
            p = p.next;
            highDigits = (val1 + val2 + highDigits) / 10;
            if(l1 != null) {
                l1 = l1.next;
            }
            if(l2 != null) {
                l2 = l2.next;
            }
        }
        if(highDigits == 1) {
            p.next = new ListNode(1);
        }
        return head.next;
    }
}
