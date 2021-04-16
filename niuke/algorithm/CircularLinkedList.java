package nowcoder.algorithm;

/**
 * @author Chenger
 * @description 牛客 - 链表中环的入口节点
 * @date 2021/4/16 09:45
 */
public class CircularLinkedList {

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(0);
        ListNode listNode2 = new ListNode(1);
        ListNode listNode3 = new ListNode(2);
        ListNode listNode4 = new ListNode(3);
        listNode1.addNext(listNode2).addNext(listNode3).addNext(listNode4).addNext(listNode2);
        new CircularLinkedList().detectCycle(listNode1);
        new CircularLinkedList().detectCycle(new ListNode(4, new ListNode(5, new ListNode(6, null))));
    }

     static class ListNode {
         int val;
         ListNode next;
         ListNode(int x) {
             val = x;
             next = null;
         }

         public ListNode addNext(ListNode next) {
             return this.next = next;
         }

         ListNode(int val, ListNode next) {
             this.val = val;
             this.next = next;
         }
     }

    /**
     * 环节点 可以是任意节点
     * *******
     *   *     *
     *  *       *
     *   *     *
     *     *  *
     * @param head
     * @return
     */
    public ListNode detectCycle(ListNode head) {
        if (null == head) {
            return null;
        }
        ListNode slowNode = head, quickNode = head;
        while ((slowNode = slowNode.next) != null && quickNode.next != null && (quickNode = quickNode.next.next) != null) {
            if(slowNode == quickNode) {
                // 从开始节点再出发
                while (head != slowNode) {
                    head = head.next;
                    slowNode = slowNode.next;
                }
                return head;
            }
        }
        return null;
    }
}
