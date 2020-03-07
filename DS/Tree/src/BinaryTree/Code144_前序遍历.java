package BinaryTree;
import java.util.ArrayList;
import java.util.List;

class Node{
    int val;
    Node left;
    Node right;
    public Node(int val){
        this.val = val;
        left = right = null;
    }
}
public class Code144_前序遍历 {
    public void preOrder(Node root,List<Integer> list){
        if(root != null){
            list.add(root.val);
            preOrder(root.left,list);
            preOrder(root.right,list);
        }
    }
    //前序遍历
    public List<Integer> preorderTraversal(Node root) {
        //放在一个容器里，返回容器
        List<Integer> list = new ArrayList<>();
        preOrder(root,list);
        return list;
    }

    //建树
    public Node bulidTree(){
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
        Code144_前序遍历 code144_前序遍历 = new Code144_前序遍历();
        Node root = code144_前序遍历.bulidTree();
        code144_前序遍历.preorderTraversal(root);
    }
}
