package nowcoder.algorithm;

/**
 * @author Chenger
 * @description 牛客 - 合并两个有序链表
 * @date 2021/4/16 20:47
 */
public class MergeTwoLists {

    public static void main(String[] args) {
        new MergeTwoLists().mergeTwoLists(new ListNode(1), new ListNode(2));
    }

    private static class ListNode {
        int val;
        ListNode next = null;

        public ListNode(int val) {
            this.val = val;
        }
    }

    /**
     *
     * @param l1 ListNode类
     * @param l2 ListNode类
     * @return ListNode类
     */
    public ListNode mergeTwoLists (ListNode l1, ListNode l2) {
        // write code here
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        ListNode head = new ListNode(0);
        ListNode temp = head;
        while(l1 != null && l2 != null) {
            if(l1.val < l2.val) {
                temp.next = l1;
                l1 = l1.next;
            } else {
                temp.next = l2;
                l2 = l2.next;
            }
            temp = temp.next;
        }
        if(l1 != null) {
            temp.next = l1;
        } else if(l2 != null) {
            temp.next = l2;
        }
        return head.next;
    }
}
