package BinaryTree;
//查找节点
//查找value所在的节点，找到返回，没找到返回null

////二叉树表示--节点值，左子树，右子树
//class Node{
//    int val;
//    Node left;
//    Node right;
//    public Node(int val){
//        this.val = val;
//        left = right = null;
//    }
//}

public class BinaryTree {
    //查找值为val的节点，从根节点root开始，
    public Node find(Node root, int val) {
        if (root == null)
            return root;
        if (root.val == val) {
            return root; //根节点即为要找的值
        }
        //根节点不是要找的值，则看左子树
        Node node = find(root.left, val); //递归
        if (node != null) {
            return node;   //不为null，说明找到了
        }
        //走到这里，说明左子树没找到，，要找右子树
        return find(root.right, val);
    }

    //建树
    public Node bulidTree() {
        Node root = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        Node node7 = new Node(7);
        Node node8 = new Node(8);
        root.left = node2;
        root.right = node3;
        node2.left = node4;
        node2.right = node5;
        node3.left = node6;
        node3.right = node7;
        node5.right = node8;
        return root;
    }



    public static void main(String[] args) {
        BinaryTree bTree = new BinaryTree();
        Node root = bTree.bulidTree();
        System.out.println(bTree.find(root,2));
    }
}
