package datastructure;
import java.util.*;

public class StackTask {
    public static void main(String[] args) {
        Stack <String> stack = new Stack <String>();

        stack.push("BMW");
        stack.push("Benz");
        stack.push("Lexus");
        stack.push("Lambo");
        System.out.println("peek : " + stack.peek());
        System.out.println("pop : " + stack.pop());
    }
}
