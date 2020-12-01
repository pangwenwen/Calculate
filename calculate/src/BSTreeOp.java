import java.util.*;

public class BSTreeOp {

    public static void main(String[] args) {
        // 二叉树遍历
        //            1
        //        2         3
        //     4     5         6
        //         7   8

        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(6);
        TreeNode node7 = new TreeNode(7);
        TreeNode node8 = new TreeNode(8);
        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;
        node5.left = node7;
        node5.right = node8;
        node3.right = node6;

//        BFS_T_M(node1);
//        DPS_T(node1);
//        BFS_T_M(node1);
//        inOrderTraverses(node1);
        System.out.print(depthBt(node1));
    }

    //====================== 判断是否为二叉排序树
    public static boolean isBSTree(TreeNode tree) {
        addList(tree);
        int len = sList.size();
        for (int i = 0; i < len - 1; i++) {
            if (sList.get(i) >= sList.get(i + 1)) {
                return false;
            }
        }
        return true;
    }
    private static ArrayList<Integer> sList = new ArrayList<Integer>();
    private static void addList(TreeNode tree) {
        if (tree == null) {
            return;
        }
        addList(tree.left);
        sList.add(tree.val);
        addList(tree.right);
    }

    public static TreeNode ancestorF(TreeNode root, TreeNode p, TreeNode q) {
        System.out.println(String.format("=====  root = %d", root == null ? -1 : root.val));
        if (root == null || root == p || root == q) {
            return root;
        }
        System.out.println(String.format("leftup  root = %d", root.val));
        TreeNode left = ancestorF(root.left, p, q);
        TreeNode right = ancestorF(root.right, p, q);
        System.out.println(String.format("rightbelow  root = %d,left = %d,right = %d", root == null ? -1 : root.val, left == null ? -1 : left.val, right == null ? -1 : right.val));
        return left == null ? right : right == null ? left : root;
        //        System.out.println(String.format("rightbelow  root = %d,left = %d,right = %d",root==null?-1:root.val,left==null?-1:left.val,right==null?-1:right.val));
    }

    //============================= 二叉排序树找最近祖先算法
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        // Value of p
        int pVal = p.val;

        // Value of q;
        int qVal = q.val;

        // Start from the root node of the tree
        TreeNode node = root;

        // Traverse the tree
        while (node != null) {

            // Value of ancestor/parent node.
            int parentVal = node.val;

            if (pVal > parentVal && qVal > parentVal) {
                // If both p and q are greater than parent
                node = node.right;
            } else if (pVal < parentVal && qVal < parentVal) {
                // If both p and q are lesser than parent
                node = node.left;
            } else {
                // We have found the split point, i.e. the LCA node.
                return node;
            }
        }
        return null;
    }

    // ========================= 广度优先遍历，按层次遍历
    public static void BFS_T(TreeNode root){
        if (root == null){
            return;
        }
        ArrayList list = new ArrayList();
        list.add(root);

        while (!list.isEmpty()){
            TreeNode node = (TreeNode) list.remove(0);
            System.out.print(node.val);
            if (node.left != null){
                list.add(node.left);
            }
            if (node.right != null){
                list.add(node.right);
            }
        }
    }

    // =========================  按层次打印出二叉二叉树
    public static void BFS_T_M(TreeNode root){
        if (root == null){
            return;
        }
        ArrayList<TreeNode> nodeList = new ArrayList();
        ArrayList<Integer> layerList = new ArrayList<>();
        int layer = 1;
        nodeList.add(root);
        layerList.add(layer);
        while (!nodeList.isEmpty()){
            TreeNode node = nodeList.remove(0);
            int l = layerList.remove(0);
            if (l != layer){
                System.out.println();
                layer = l;
            }

            System.out.print(node.val);
            if (node.left!= null){
                nodeList.add(node.left);
                layerList.add(l+1);
            }
            if (node.right != null){
                nodeList.add(node.right);
                layerList.add(l+1);
            }
        }
    }

    // ===========================  深度优先遍历  先序遍历
    public static void DPS_T(TreeNode root){
        if (root == null){
            return;
        }
        Stack stack = new Stack();
        stack.add(root);
        while (!stack.isEmpty()){
            TreeNode node = (TreeNode) stack.pop();
            System.out.print(node.val);
            if (node.right!=null){
                stack.push(node.right);
            }
            if (node.left != null){
                stack.push(node.left);
            }
        }
    }

    // 前序遍历=============================================
    public void preOrderTraverse1(TreeNode root) {
        if (root != null) {
            System.out.print(root.val + "->");
            preOrderTraverse1(root.left);
            preOrderTraverse1(root.right);
        }
    }

    //中序遍历============================================
    public void inOrderTraverse(TreeNode root) {
        if (root != null) {
            inOrderTraverse(root.left);
            System.out.print(root.val + "->");
            inOrderTraverse(root.right);
        }
    }

    public static void inOrderTraverses(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root;
        while (node != null || !stack.isEmpty()) {
            if (node != null) {
                stack.push(node);
                node = node.left;
            } else {
                TreeNode tem = stack.pop();
                System.out.print(tem.val + "->");
                node = tem.right;
            }
        }
    }

    //后续遍历=======================
    public void oOrderTraverse(TreeNode root) {
        if (root != null) {
            inOrderTraverse(root.left);
            inOrderTraverse(root.right);
            System.out.print(root.val + "->");
        }
    }
    //树的深度
    public static int depthBt(TreeNode root){
        if (root == null){
            return 0;
        }
        int l = depthBt(root.left)+1;
        int r = depthBt(root.right)+1;
        return l>r?l:r;
    }

}

