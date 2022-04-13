import java.util.Stack;
public class Stackk {
    public static void main(String[] args) {

        Stack<String> stack = new Stack<String>();
        System.out.println(stack.empty());

        stack.push("Minecraft");
        stack.push("COD");
        stack.push("Warface");

        stack.pop();

        System.out.println(stack);

    }
}
