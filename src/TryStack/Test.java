package TryStack;

import java.util.Stack;
// принцип LIFO : last in first out

public class Test {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(5);
        stack.push(3);
        stack.push(1);

        while (!stack.empty()) {
            System.out.println(stack.pop());
        }
    }
}
