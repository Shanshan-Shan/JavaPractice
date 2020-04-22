package Day17_417.二叉树的镜像;

//重点--递归，交换左右子树
public class Main {
    public class TreeNode {
        int val;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }
    public static void Mirror(TreeNode root){  //递归，交换左右子树
        if(root == null){
            return;
        }
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;
        Mirror(root.left);
        Mirror(root.right);
    }

    public static void main(String[] args) {

    }

}
