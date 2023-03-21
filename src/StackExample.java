import java.util.Stack;

public class StackExample {
    //Last In first OUT

    public static void main(String[] args) {
        Stack<String>animals=new Stack<>();
        animals.push("Lion");
        animals.push("Cat");
        animals.push("Dog");
        animals.push("Cheetah");
        System.out.println("Stack: "+animals);
        System.out.println("Peek: "+ animals.peek());
        animals.pop();
        System.out.println(animals);

    }
}
