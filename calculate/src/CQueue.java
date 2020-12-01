import java.util.Stack;

public class CQueue {
    Stack<Integer> stack1;
    Stack<Integer> stack2;

    public CQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void appendTail(int value) {
        if (stack1 == null || stack2 == null){
            return;
        }
        if (stack2 != null && stack2.size()>0){
            for (int i = 0;i<=stack2.size();i++){
                stack1.push(stack2.pop());
            }
        }
        stack1.push(value);
    }

    public int deleteHead() {
        if (stack1 == null || stack2==null){
            return -1;
        }

        if (stack1.size() != 0){
            // 注意判断边界
            for (int i= 0;i<=stack1.size();i++){
                int value = stack1.pop();
               stack2.push(value);
           }
        }
        if(stack2.size() == 0){
            return -1;
        }
       return stack2.pop();
    }
}
