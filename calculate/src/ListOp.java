
public class ListOp {

    /**
     * 链表反转
     * @param no
     * @return
     */
    public static Node revert(Node no){
        if (no == null || no.next == null){
            return no;
        }

        Node previous = null;
        Node cur = no;
        while (cur != null){
            Node temp = cur.next;
            cur.next = previous;
            previous = cur;
            cur = temp;
        }
        return  previous;
    }

    /**
     * 两两反转
     * @param no
     * @return
     */
    public static Node exchangeN(Node no){
        if (no == null || no.next == null){
            return no;
        }

        Node pre = new Node(0);
        pre.next = no;
        Node temp = pre;
        while (temp.next != null && temp.next.next != null){
            Node start = temp.next;
            Node end = temp.next.next;
            temp.next = end;
            start.next = end.next;
            end.next = start;
            temp = start;
        }
        return pre.next;
    }

    public static Node xRevert(Node node,int k){
        if (node == null || node.next == null){
            return node;
        }

        Node dummy = new Node(0);
        dummy.next = node;

        Node pre = dummy;
        Node end = dummy;

        while (end.next != null){
            for (int i = 0;i<k && end != null;i++){
                end = end.next;
            }
            if (end == null){
                break;
            }

            Node start = pre.next;
            Node next = end.next;
            end.next = null;
            pre.next = revert(start);
            start.next = next;
            pre = start;
            end = pre;
        }
        return dummy.next;
    }

    /**
     * 判断链表是否有环
     *  1. 0.5-1s 判断是否null
     *  2. set 直接判重
     *  3. 快慢指针
     * @param no
     * @return
     */
    public static Node isCircle(Node no) {
        if(no == null || no.next == null){
            return null;
        }
        Node slow = no;
        Node fast = no;

        while (no.next!=null && no.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast){
                System.out.println("======有环");
                return slow;
            }
        }

        System.out.println("======无环");
        return slow;
    }

    /**
     * 判断有环链表的入口
     *  1. 使用set
     *  2. 使用快慢指针
     *     a: 非环部分长度
     *     b: 环部长度
     *     f = 2s
     *     f = s+nb
     *     ==> s = nb
     *     从头部到环的入口需要走的步数：
     *     k = a+nb
     *     ==> 从相遇点到入口需要走 a 步，则可以定义一个指针从头开始遍历，慢指针同时遍历，相遇时即环的入口
     * @param no
     * @return
     */
    public static Node EntranceCircle(Node no){
        Node meetN = isCircle(no);
        if (meetN == null){
            return null;
        }

        while (no != meetN){
            no = no.next;
            meetN = meetN.next;
        }
        System.out.print("环的入口=>");
        System.out.println(no.value);
        return no;
    }
}
