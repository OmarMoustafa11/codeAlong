package amigoscode;

import java.util.Stack;

public class WorkingWithStacks {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.peek());//top of the peek.
        System.out.println(stack.size());// size of stack
        System.out.println(stack.pop());// will pop out the number in the stack
        System.out.println(stack.empty());//gives back boolean if stack is empty


    }
}
