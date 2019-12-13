//二叉树--递归实现前中后序遍历
class Node{
    char val;
    Node left;
    Node right;
    public Node(char val){
        this.val = val;
    }
}
public class BinaryTree {

    //前序遍历--根左右
    public void preOrder(Node root) {
        //递归终止条件：空树
        if (root == null) {
            return;
        } else {
            //递推
            System.out.print(root.val); //根的值
            preOrder(root.left);     //递归
            preOrder(root.right);    //递归
        }
    }
    
    //建树
    public Node bulidTree() {
        Node root = new Node('A');
        Node node2 = new Node('B');
        Node node3 = new Node('C');
        Node node4 = new Node('D');
        Node node5 = new Node('E');
        Node node6 = new Node('F');
        Node node7 = new Node('G');
        Node node8 = new Node('H');
        root.left = node2;
        root.right = node3;
        node2.left = node4;
        node2.right = node5;
        node3.left = node6;
        node3.right = node7;
        node5.right = node8;
        return root;
    }

   
        public static void main (String[]args){
            BinaryTree bTree = new BinaryTree();
            Node root = bTree.bulidTree();
            bTree.preOrder(root);  //ABDEHCFG
            System.out.println();
           
          
        }
}
