package 二叉树遍历;

import java.util.Stack;

public class BinaryTree {
    class TreeNode{
        TreeNode left;
        TreeNode right;
        int value;
        public TreeNode(int value){
            this.value = value;
        }
    }

    //非递归中序遍历
    public static void inorderTraversal(TreeNode root) {
        Stack<TreeNode> st = new Stack<>();
        TreeNode curNode = root;
        while (curNode != null || st.isEmpty()){
            while (curNode != null){
                //访问左子树
                st.push(curNode);
                curNode = curNode.left;
            }

        //访问根
        curNode = st.pop();
        System.out.println(curNode.value);
        //访问右子树
        curNode = curNode.right;
        }
    }

    //后序遍历
    public static void  postorderTraversal(TreeNode root) {

    }
    public   TreeNode buildTree(){
        TreeNode root = new TreeNode(1);
        TreeNode left = new TreeNode(2);
        TreeNode right = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(6);
        TreeNode node7 = new TreeNode(7);
        TreeNode node8 = new TreeNode(8);
        root.left = left;
        root.right = right;
        left.left = node4;
        left.right = node5;
        right.left = node6;
        right.right = node7;
        left.left.left = node8;
        return root;
    }

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        TreeNode root = binaryTree.buildTree();
        inorderTraversal(root);
        postorderTraversal(root);
    }
}
