//二叉树--递归实现前中后序遍历
class Node{
    char val;
    Node left;
    Node right;
    public Node(char val){
        this.val = val;
        left = right = null;
    }
}
public class BinaryTree {
    public static int size = 0;
    public static int leafSize = 0;

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

    //中序遍历--左根右
    public void inOrder(Node root) {
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.val);
            inOrder(root.right);
        }
    }

    //后序遍历--左右根
    public void postOrder(Node root) {
        if (root != null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.val);
        }

    }

    //遍历--求节点个数
    public void getSize1(Node root){
        if(root != null){
            getSize1(root.left);
            getSize1(root.right);
            size++;
        }
    }

    //子问题--求节点个数
    public int getSize2(Node root){
        if(root == null)
            return 0;
        if(root.left == null && root.right == null)
            return 1;
        //整棵树节点等于：左右节点加上当前节点
        return getSize2(root.left) + getSize2(root.right) + 1;
    }

    //求叶子节点的个数--遍历思路
    public void getLeafSize1(Node root){
        if(root == null){
            return;
        }
        if(root.right == null && root.left == null){
            leafSize++;
            return;
        }
        getLeafSize1(root.right);
        getLeafSize1(root.left);
    }

    //求叶子节点个数--子问题思路
    public int getLeafSize2(Node root){
        if(root == null)
            return 0;
        if(root.left == null && root.right == null)
            return 1;
        return getLeafSize2(root.left) + getLeafSize2(root.right);
    }

    //求第K层节点个数
    public int getKSize(Node root,int k){
        if(root == null)
            return 0;
        if(k == 1)
            return 1;
        return getKSize(root.left, k - 1) + getKSize(root.right, k - 1);
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
            bTree.inOrder(root);   //DBEHAFCG
            System.out.println();
            bTree.postOrder(root);  //DHEBFGCA
            System.out.println();

            bTree.getSize1(root);
            System.out.println(BinaryTree.size);            // 8
            System.out.println(bTree.getSize2(root));       // 8

            bTree.getLeafSize1(root);
            System.out.println(BinaryTree.leafSize);         // 4
            System.out.println(bTree.getLeafSize2(root));    // 4

            System.out.println(bTree.getKSize(root, 2));  // 2
            System.out.println(bTree.getKSize(root, 3));  // 4
          
        }
}
