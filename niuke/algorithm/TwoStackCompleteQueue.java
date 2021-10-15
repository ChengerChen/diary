package nowcoder.algorithm;

import java.util.Stack;

/**
 * @author Chenger
 * @description NC76 用两个栈实现队列
 * https://www.nowcoder.com/practice/54275ddae22f475981afa2244dd448c6?tpId=188&&tqId=38552&rp=1&ru=/ta/job-code-high-week&qru=/ta/job-code-high-week/question-ranking
 * @date 2021/9/23 下午6:04
 */
public class TwoStackCompleteQueue {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public static void main(String[] args) {
        // ["PSH1","PSH2","PSH3","POP","POP","PSH4","POP","PSH5","POP","POP"]
        // 1 2 3 4 5
        TwoStackCompleteQueue queue = new TwoStackCompleteQueue();
        queue.push(1);
        queue.push(2);
        queue.push(3);
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        queue.push(4);
        System.out.println(queue.pop());
        queue.push(5);
        System.out.println(queue.pop());
        System.out.println(queue.pop());

    }

    public void push(int node) {
        stack1.push(node);

    }

    public int pop() {
        // 判空
        if(stack1.isEmpty() && stack2.isEmpty()) {
            return -1;
        }
        if(stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }
}
