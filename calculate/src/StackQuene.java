import java.util.PriorityQueue;
import java.util.Stack;

public class StackQuene<T> {
    private Stack<T> inStack = new Stack<T>();
    private Stack<T> outStack = new Stack<T>();

    public void push(T value){
        inStack.push(value);

    }

    public T pop(){
        if (!outStack.isEmpty()){
            return outStack.pop();
        }else if(!inStack.isEmpty()){
            while (!inStack.isEmpty()){
                outStack.push(inStack.pop());
            }
            return outStack.pop();
        }
        return null;
    }
}
