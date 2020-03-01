package 二叉树;

//二叉树类
public class Tree {
    //根节点
    private Node root;

    //插入节点
    public void insert(int val){
        Node newNode = new Node(val);//封装节点
        Node cur = root;//引用当前节点
        Node parent;    //引用父节点

        if(root == null){        //插入第一个节点，root 为空
            root = newNode;
            return;
        }else {

        }



    }

    //查找节点
    public void find(int val){

    }

    //删除节点
    public void remove(int val){

    }


}
