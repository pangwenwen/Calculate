import java.awt.*;
import java.util.*;
import java.util.List;

public class Todo {

    public static void main(String[] args) {
//        Node list1 = new Node(1);
//        list1.next = new Node(2);
//        list1.next.next = new Node(3);
//        list1.next.next.next = new Node(4);

//        Node rN = ListRevert.revert(list1);
//        while (rN != null){
//            System.out.println(rN.value);
//            rN = rN.next;
//        }

//        Node eN = ListOp.exchangeN(list1);
//        while (eN != null){
//            System.out.println(eN.value);
//            eN = eN.next;
//        }

//        Node node1 = new Node(1);
//        Node node2 = new Node(2);
//        Node node3 = new Node(3);
//        Node node4 = new Node(4);
//        Node node5 = new Node(5);
//
//        node1.next = node2;
//        node2.next = node3;
//        node3.next = node4;
//        node4.next = node5;
//        node5.next = node2;
//        ListOp.isCircle(node1);
//
//        ListOp.EntranceCircle(node1);

        // 判断括号
//        String test = "){}]";
//        StringOp.isvalid(test);

        // 矩阵顺时针访问
//        int[][] mat = {{1,2,3,0},
//                       {4,5,6,0},
//                       {7,8,9,0},
//                      {10,11,12,0},
//                {14,15,16,0}};
//        int[][] mat = {
//                {1},
//                {2},
//                {3}
//        };
//        List<Integer> list = MatrixOp.spiralOrder(mat);
//        int len = list.size();
//        for (int i = 0;i<len;i++){
//            System.out.print(list.get(i)+" ");
//        }

//        int[] nums = {3,5,7,3,6,3,9,5,8,3,6,9};
//        PriorityOp.getKMax(3,nums);

//        int[] nums = {-1, 0, 1, 2, -1, -4};
//        System.out.println("haha");
//        System.out.println(ArrayOp.threeAdd(nums,0));

//        BTree root = new BTree(1);
//        root.lThree = new BTree(2);
//        root.lThree.lThree = new BTree(4);
//        root.lThree.rThree = new BTree(5);
//        BTree p = root.lThree.rThree;
//
//        root.rThree = new BTree(3);
//        root.rThree.rThree = new BTree(6);
//        BTree q = root.rThree.rThree;
//
//        BTree anc = BSTreeOp.ancestorF(root,p,q);
//        System.out.println(String.format("ancer is %d",anc.val));

//        System.out.println(PowOp.myPow(2,4));

        // 二叉树遍历
//        BTree node1 = new BTree(1);
//        BTree node2 = new BTree(2);
//        BTree node3 = new BTree(3);
//        BTree node4 = new BTree(4);
//        BTree node5 = new BTree(5);
//        BTree node6 = new BTree(6);
//        BTree node7 = new BTree(7);
//        BTree node8 = new BTree(8);
//        node1.lThree = node2;
//        node1.rThree = node3;
//        node2.lThree = node4;
//        node2.rThree = node5;
//        node5.lThree = node7;
//        node5.rThree = node8;
//        node3.rThree = node6;
//
//        BSTreeOp.BFS_T(node1);
//        System.out.println("\n===============================");
//        BSTreeOp.DPS_T(node1);
//        System.out.println("\n===============================");
//        BSTreeOp.BFS_T_M(node1);

//        double result = mathOp.sqrt(20);

        // 字典树操作
//        Trie trie = new Trie();
//
//        trie.insertNode("apple");
//        boolean b1 = trie.searchAll("apple");   // 返回 true
//        System.out.println("b1 = "+b1);
//        boolean b2 =  trie.searchAll("app");     // 返回 false
//        System.out.println("b2 = "+b2);
//        boolean b3 = trie.startWith("app"); // 返回 true
//        System.out.println("b3 = "+b3);
//        trie.insertNode("app");
//        boolean b4 = trie.searchAll("app");     // 返回 true
//        System.out.println("b4 = "+b4);

//        int sum = BitOp.hammingWeight(8);
//        System.out.println(sum);

//          boolean isPowerOfTwo = BitOp.isPowerOfTwo(9);
//          System.out.println(isPowerOfTwo);
//        int n = 7;
//        int[] memo = new int[n+1];
//        int fibNum = DynamicTrain.fibE(n,memo);
//        System.out.println(fibNum);

        // 走迷宫
//        int[][] mat = {{0, 0, 0, 0, 0, 0, 0, 0},
//                {0, 0, 1, 0, 0, 0, 1, 0},
//        {0, 0, 0, 0, 1, 0, 0, 0},
//            {1, 0, 1, 0, 0, 1, 0, 0},
//                {0, 0, 1, 0, 0, 0, 0, 0},
//                    {0, 0, 0, 1, 1, 0, 1, 0},
//                        {0, 1, 0, 0, 0, 1, 0, 0},
//                            {0, 0, 0, 0, 0, 0, 0, 0}};
//
//        int[][] opt = DynamicTrain.Labyrinth(mat);
//        int r = opt.length;
//        int l = opt[0].length;
//        for (int i = 0;i<r;i++){
//            for (int j = 0;j<l;j++){
//              System.out.print(opt[i][j]+" ");
//            }
//            System.out.println();
//        }

        // Max train
//        int[] nums = {10,9,2,5,3,7,101,18};
//        DynamicTrain.lengthOfLIS(nums);

//        int[] array = {10,9,2,5,3,7,101,18};
////        SortBasic.insertD(array);
////        SortBasic.sortBub(array);
//        SortBasic.quick_sort(array,0,array.length-1);
//        //打印
//        for (int m = 0;m<array.length;m++){
//            System.out.print(array[m]);
//            System.out.print(" ");
//        }

//        int[] array2 = {10,11,14,15,17,18};
//        SearchBasic.searchB(array2,10);
//        SearchBasic.searchB(array2,18);
//        SearchBasic.searchB(array2,13);
//        SearchBasic.searchB(array2,15);

//       Thread thread1 = new Thread(new Runnable() {
//           @Override
//           public void run() {
//               try {
//                   Thread.sleep(30000);
//               } catch (InterruptedException e) {
//                   e.printStackTrace();
//               }
//               System.out.println("aaaaa");
//           }
//       });
//        Thread thread2 =new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("bbbb");
//            }
//        });
//        thread1.start();
//        thread2.start();
//
//        thread1.interrupt();
//
//
//        try {
//            thread1.join();
//            thread2.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        System.out.println("cccc");
//        System.out.println(addBinary("11","1"));

//        int[] array = new int[]{2,5,5,11};
//        int[] result = twoSum(array,10);
//        for (int a:result){
//            System.out.print(a+" ");
//        }
//        Node node = new Node(1);
////        Node node1 = new Node(2);
////        Node node2 = new Node(3);
////        Node node3= new Node(3);
////        Node node4= new Node(2);
////        Node node5 = new Node(1);
////        node.next = node1;
////        node1.next = node2;
////        node2.next = node3;
////        node3.next = node4;
////        node4.next = node5;
//////        while (node!= null){
//////            System.out.print(node.value + "  ");
//////            node = node.next;
//////        }
//////        Node t = removeDuplicateNodes(node);
//////        while (t!=null){
//////            System.out.println(t.value);
//////            t = t.next;
//////        }
////
//////
//////        Node node3 = new Node(5);
//////        Node node4 = new Node(6);
//////        Node node5 = new Node(4);
//////        node3.next = node4;
//////        node4.next = node5;
//////        addTwoNumbers(node,node3);
//////        ArrayList list = new ArrayList();
//////        list.add("leet");
//////        list.add("code");
//////
//////        System.out.println(WorldSplit_139.wordBreak("leetcode", list));
////
//////        List<List<Integer>> total = new ArrayList<>();
//////        List list = new ArrayList();
//////        list.add(2);
//////        List list1 = new ArrayList();
//////        list1.add(3);
//////        list1.add(4);
//////        List list2 = new ArrayList();
//////        list2.add(6);
//////        list2.add(5);
//////        list2.add(7);
//////        List list3 = new ArrayList();
//////        list3.add(4);
//////        list3.add(1);
//////        list3.add(8);
//////        list3.add(3);
//////
//////        total.add(list);
//////        total.add(list1);
//////        total.add(list2);
//////        total.add(list3);
//////
//////        minimumTotal(total);
////
////        int[][] mm ={
////            {1, 3, 1},
////            {1, 5, 1},
////            {4, 2, 1}
////        };
////        System.out.println(minimumTotal(mm));
//        int[] nums = new int[]{3,2,1,5,6,4};
//        System.out.print(findKthLargest(nums,2));

//        CQueueI queue = new CQueueI();
//        System.out.println(queue.deleteHead());
//        queue.appendTail(12);
//        System.out.println(queue.deleteHead());
//        queue.appendTail(10);
//        queue.appendTail(9);
//        System.out.println(queue.deleteHead());
//        System.out.println(queue.deleteHead());
//        System.out.println(queue.deleteHead());
//        queue.appendTail(20);
//        System.out.println(queue.deleteHead());
//        queue.appendTail(1);
//        queue.appendTail(8);
//        queue.appendTail(20);
//        queue.appendTail(1);
//        queue.appendTail(11);
//        queue.appendTail(2);
//        System.out.println(queue.deleteHead());
//        System.out.println(queue.deleteHead());
//        System.out.println(queue.deleteHead());

//        int[][] array = {{1,5,9},{10,11,13},{12,13,15}};
//        int[][] array = {{1,2},{1,3}};
//        System.out.println( kthSmallest(array,3));
//        int[][] array  = {{0,0,0},{0,1,0},{0,0,0}};
//        uniquePathsWithObstacles(array);
//        lengthOfLongestSubstring("avniaj");
        int[] nums = new int[]{2,0,1,1,0,0};
        sortColors(nums);
    }

    public static void sortColors(int[] nums) {
        if (nums == null || nums.length == 0){
            return;
        }
        int i = 0;
        int j = nums.length;

        for(int m = 0;m<j;){
            if (nums[m] == 1){
                m++;
            }else if (nums[m] == 0){
                int temp = nums[i];
                nums[m++] = temp;
                nums[i++] =  0;
            }else if (nums[m] == 2){
                int temp = nums[--j];
                nums[j] = 2;
                nums[m] = temp;
            }
        }

        for (int k = 0;k<nums.length;k++){
            System.out.println(nums[k]+" ");
        }
    }

    public static int lengthOfLongestSubstring(String s) {
        int len = -1;
        if (s == null ){
            return len;
        }

        if (s.length() == 1){
            return 1;
        }

        Set<Character> set = new HashSet<>();

        int max = 0;
        for (int i = 0;i<s.length();i++){
            set.clear();
            set.add(s.charAt(i));
            int temp = 1;
            int j = i+1;
            while (j<s.length() && !set.contains(s.charAt(j)) ){
                set.add(s.charAt(j++));
                temp++;
            }
            max = Math.max(max,temp);
        }

        System.out.println(max);
        return max;

    }

    public static int kthSmallest(int[][] matrix, int k) {
        if (matrix == null || k < 1 || k>(matrix.length)*(matrix[0].length)){
            return -1;
        }

        if (k == 1){
            return matrix[0][0];
        }

        int len = matrix.length;

        int i = 0; //从左向右第几个元素
        int j = 1; //中上向下第几个元素

        int m = 1; // 行
        int n = 0; // 列

        int index = 1;
        int sum = (len-1) *(len-1);

        int nMin = 0;

        while (i*j <= sum && m*n <= sum){
            System.out.println("i = "+i+", j = "+j+"; m = "+m+", n = "+n+"; index = "+index);

            int rT = matrix[i][j];
            int lT = matrix[m][n];

            index++;

            if (rT >= lT){
                if (lT != matrix[0][0]-1){
                    nMin = lT;
                    matrix[m][n] = matrix[0][0]-1;
                }else {
                    nMin = rT;
                }

                if (m >= n-1){
                    n++;
                    m = i+1;
                }else {
                    m++;
                }
            }else if (rT < lT){
                if (rT != matrix[0][0]-1){
                    nMin = rT;
                    matrix[i][j] = matrix[0][0]-1;
                }else {
                    nMin = lT;
                }


                if (j >= len-1){
                    i++;
                    j = n+1;
                }else {
                    j++;
                }
            }

            if (i > len-1){
                i = len-1;
            }
            if (j > len-1){
                j = len-1;
            }
            if (m > len-1){
                m = len-1;
            }
            if (n > len-1){
                n = len-1;
            }

            if (index == k){
                break;
            }
        }
        return nMin;
    }

    //////////////////////////
    static class CQueueI {
        Stack<Integer> stack1;
        Stack<Integer> stack2;

        public CQueueI() {
            stack1 = new Stack<>();
            stack2 = new Stack<>();
        }

        public void appendTail(int value) {
            if (stack1 == null || stack2 == null){
                return;
            }
            if (stack2 != null && stack2.size()>0){
                int len = stack2.size();
                for (int i = 0;i<=len;i++){
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
                // 注意判断边界,注意在pop之后数组的长度会变化
                int len = stack1.size();
                for (int i= 0;i<=len;i++){
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



    //////////////////////////


    public static int findKthLargest(int[] nums, int k) {
        if (nums == null || k<0 || nums.length<k){
            return Integer.MIN_VALUE;
        }

       return quick(nums,0,nums.length-1,nums.length - k);
//        return nums[nums.length - k];
    }

    public static int quick(int[] array,int low,int heigh,int expect){
        if (array == null || low>=heigh){
            return array[expect];
        }
        int temp = array[low];
        int i = low;
        int j = heigh;

        while (i != j){
            while (i<j && array[j] >= temp){
                j--;
            }
            if (i<j){
                array[i] = array[j];
                i++;
            }

            while (i<j && array[i]<=temp){
                i++;
            }
            if (i<j){
                array[j] = array[i];
                j--;
            }
        }
        array[i] = temp;
        if (i == expect){
            return array[i];
        }

        quick(array,low,i-1,expect);
        quick(array,i+1,heigh,expect);

        return array[expect];

    }

    public static int minimumTotal(int[][] grid) {
        if (grid == null ){
            return 0;
        }

        int row = grid.length;
        int h = grid[0].length;
        int[][] rout = new int[row][h];

        // 状态转移方程
        //c[i][j] = Math.min(rout[i-i][j],rout[i][j-1])+grid[i][j];

        for(int i = 0;i<row;i++){
            for (int j = 0;j<h;j++){
                if (i == 0 && j == 0){
                    rout[i][j] = grid[i][j];
                }else if (j == 0){
                    rout[i][j] = rout[i-1][j] + grid[i][j];
                }else if (i == 0){
                    rout[i][j] = rout[i][j-1] + grid[i][j];
                } else {
                    rout[i][j] = Math.min(rout[i-1][j],rout[i][j-1])+grid[i][j];
                }

            }
        }

        return rout[row-1][h-1];
    }

    public static Node removeDuplicateNodes(Node head) {
        TreeSet set = new TreeSet();
        Node nextN = head.next;
        Node pre = head;
        pre.next = null;
        Node tempPre = pre;
        set.add(head.value);
        while (nextN != null){
            if (set.contains(nextN.value)){
                System.out.println(nextN.value);
                nextN = nextN.next;
                continue;
            }
            set.add(nextN.value);
            pre.next = nextN;
            pre = nextN;
            nextN = nextN.next;
            pre.next = null;

        }
        return head;
    }

    public static Node addTwoNumbers(Node l1, Node l2) {
        if (l1 == null && l2 == null){
            return null;
        }

        Node temp1 = l1;
        Node temp2 = l2;
        Node head = new Node(0);
        Node r = head;
        int p = 0;
        while (temp1!= null || temp2!=null){
            int sub = p;
            if (temp1 != null){
                sub += temp1.value;
                temp1 = temp1.next;
            }
            if (temp2!= null){
                sub+=temp2.value;
                temp2 = temp2.next;
            }

            p = sub/10;
            r.next = new Node(sub%10);
            r = r.next;
        }
        if (p >0){
            r.next = new Node(p);
        }
        return head.next;

    }

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0;i<nums.length-1;i++){
            for (int j = i+1;j<nums.length;j++){
                if (nums[i]+nums[j] == target){
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }

    public static int threeSumClosest(int[] nums, int target) {
        int len  = nums.length;
        int result = (int)Math.pow(10,3);
        Arrays.sort(nums);

        System.out.println(nums);

        for (int i=0;i<len-2;i++){
            if (i-1>0 && nums[i] == nums[i-1]){
                continue;
            }

            int temp2 = i+1;
            int temp3 = len-1;
            int subR = nums[i] + nums[temp2] + nums[temp3];

            while (temp3 > temp2){
                System.out.println(result);
                if (subR == target){
                    return target;
                }else if (subR > target){
                    if (Math.abs(subR-target)<Math.abs(result-target)){
                        result = subR;
                    }
                    subR = nums[i] + nums[temp2] + nums[--temp3] ;
                    continue;
                }else {
                    if (Math.abs(subR-target)<Math.abs(result-target)){
                        result = subR;
                    }
                    subR = nums[i] + nums[++temp2] + nums[temp3] ;
                    continue;
                }
            }
        }
        return result;
    }

    public static String addBinary(String a, String b) {
        if (a == null & b == null) {
            return null;
        }

        char[] aChar = a.toCharArray();
        char[] bChar = b.toCharArray();
        int al = aChar.length;
        int bl = bChar.length;
        int macL = Math.max(al, bl);

        StringBuilder resultStr = new StringBuilder();

        char temp = '0';
        char aI;
        char bI;
        for (int i = 1; i <= macL; i++) {
            if (i <= al) {
                aI = aChar[al - i];
            } else {
                aI = '0';
            }

            if (i <= bl) {
                bI = bChar[bl - i];
            } else {
                bI = '0';
            }

            if (aI == '1' && bI == '1') {
                if (temp == '1') {
                    resultStr.append("1");
                } else {
                    resultStr.append("0");
                }
                temp = '1';
                continue;
            } else if (aI == '0' && bI == '0') {
                if (temp == '1') {
                    resultStr.append("1");
                } else {
                    resultStr.append("0");
                }
                temp = '0';
                continue;
            } else {
                if (temp == '1') {
                    temp = '1';
                    resultStr.append("0");
                } else {
                    resultStr.append("1");
                    temp = '0';
                }
                continue;
            }
        }
        if (temp == '1'){
            resultStr.append(temp);
        }
        return resultStr.reverse().toString();
    }


}

