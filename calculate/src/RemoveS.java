import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class RemoveS {
    public Node removeDuplicateNodes(Node head) {
        TreeSet set = new TreeSet();
        Node next = head.next;
        Node pre = head;
        pre.next = null;
        Node tempPre = pre;
        set.add(head.value);
        while (next != null){
            if (set.contains(next.value)){
                next = next.next;
                break;
            }
            set.add(next.value);
            pre.next = next;
            pre = next;
            pre.next = null;
            next = next.next;
        }
        return tempPre;
    }
}
