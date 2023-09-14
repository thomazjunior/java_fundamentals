package List;

import java.util.Stack;

public class _Stack {
    // we should favor the Deque instead of the Stack
    // double its size on resize, but dont

    public static void main(String[] args) throws Exception {
        Stack<Integer> intStack = new Stack<>();
        intStack.push(1);
        System.out.println(intStack.capacity());
        for (int i = 0; i < 10; i++)
            intStack.push(i);
        System.out.println(intStack.capacity());
        System.out.println(intStack.peek());
        intStack.search(1);
        intStack.removeElement(1);
        System.out.println(intStack.capacity());
    }
}
