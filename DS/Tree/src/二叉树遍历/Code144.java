package 二叉树遍历;

//二叉树的前序遍历--根左右
//给定一个二叉树，返回它的 前序 遍历。
public class Code144 {
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

}
