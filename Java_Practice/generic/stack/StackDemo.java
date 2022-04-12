package javapractice.generic.stack;

public class StackDemo {

    public static void main(String[] args) throws Exception {

        Stack<Integer> stack = new Stack<>();

        stack.push(5);
        stack.push(10);

        System.out.println(stack.peek());
        System.out.println(stack.pop());
    }
}
