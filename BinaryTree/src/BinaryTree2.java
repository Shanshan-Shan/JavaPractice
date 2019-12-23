// 查找 val 所在结点，没有找到返回 null
// 按照 根 -> 左子树 -> 右子树的顺序进行查找
// 一旦找到，立即返回，不需要继续在其他位置查找
// Node find(Node root, int val);

class Node{
    Node left;
    Node right;
    int val;
}

public class BinaryTree2 {
    public Node find(Node root, int val){
        if(root == null)
            return root;
        if(root.val == val){
            return root;
        }
        Node node = find(root.left, val);
        if(node != null){
            return node;
        }
        return find(root.right, val);
    }
}

//Oj练习--中序遍历
//class Solution {
//    public void _inorderTraversal(TreeNode root, List<Integer> list) {
//        if(root != null){
//            _inorderTraversal(root.left,list);
//            list.add(root.val);
//            _inorderTraversal(root.right,list);
//        }
//    }
//
//    public List<Integer>inorderTraversal(TreeNode root){
//        List <Integer> list = new ArrayList<>();
//        _inorderTraversal(root,list);
//        return list;
//    }
//}


 //检查两颗树是否相同。OJ练习
// class Solution {
//     public boolean isSameTree(TreeNode p, TreeNode q) {
//         if(p == null && q == null){
//             return true;
//         }
//         if(p == null || q == null){
//             return false;
//         }
//         if(p.val == q.val){
//             return isSameTree(p.left,q.left) && isSameTree(p.right, q.right);
//         }
//         else
//             return false;
//     }
// }


//另一颗树的子树。OJ练习
//遍历每个节点，每个节点为根的树是否和给定的树相等

//class Solution {
//    public boolean isSameTree(TreeNode p, TreeNode q) {
//        if(p == null && q == null){
//            return true;
//        }
//        if(p == null || q == null){
//            return false;
//        }
//        if(p.val == q.val){
//            return isSameTree(p.left,q.left) && isSameTree(p.right, q.right);
//        }
//        else
//            return false;
//    }
//
//    public boolean isSubtree(TreeNode s, TreeNode t) {
//        if(s == null)
//            return false;
//        if(isSameTree(s, t)){
//            return true;
//        }
//        if (isSubtree(s.left, t)) {
//            return true;
//        }
//        return isSubtree(s.right, t);
//
//    }
//}

//给定一个二叉树，判断它是否是高度平衡的二叉树。
//本题中，一棵高度平衡二叉树定义为：
//一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过1。

//class Solution {
//    public int getHeight(TreeNode root){
//        return root == null ? 0 : Math.max(getHeight(root.left), getHeight(root.right)) + 1;
//    }
//
//    public boolean isBalanced(TreeNode root) {
//        if(root == null){
//            return true;
//        }
//
//        int left = getHeight(root.left);
//        int right = getHeight(root.right);
//        return Math.abs(left - right) < 2   //abs--绝对值
//                && isBalanced(root.left)
//                && isBalanced(root.right);
//    }
//}

//给定一个二叉树，检查它是否是镜像对称的。
//class Solution {
//    public boolean _isSymmetric(TreeNode left, TreeNode right){
//        if(left == null && right == null){
//            return true;
//        }
//        if(left == null || right == null){
//            return false;
//        }
//        return left.val == right.val
//                && _isSymmetric(left.left, right.right)
//                && _isSymmetric(left.right, right.left);
//    }
//    public boolean isSymmetric(TreeNode root) {
//        if(root == null){
//            return true;
//        }
//        return _isSymmetric(root.left, root.right);
//    }
//}
