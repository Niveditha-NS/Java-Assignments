import java.util.Stack;
public class StackExample {
    public static void main(String[] args) {
        Stack<String> m = new Stack<>();
        m.push("Dog");
        m.push("Cat");
        System.out.println("Stack: "+m);
        m.pop();
        System.out.println(m);

        Stack<Integer> i = new Stack<>();
        i.push(6);
        i.push(12);
        i.push(18);
        System.out.println("Stack: "+i);
        i.pop();
        System.out.println(i);
    }
}
