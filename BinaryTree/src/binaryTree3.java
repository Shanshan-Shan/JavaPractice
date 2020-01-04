/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
 
 //OJ练习--给定一个二叉树，找到该树中两个指定节点的最近公共祖先
 
class Solution {
    
    public boolean find(TreeNode root, TreeNode node){
        if(root == null)
            return false;
        if(root == node)
            return true;
        if(find(root.left, node))
            return true;
        return find(root.right, node);
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null)
            return root;
        boolean pL = false, pR = false, qL = false, qR = false;
        //某一个节点为当前树的根
        if(root == p || root == q){
            return root;
        }
        //同一边
        if(find(root.left, p)){
            pL = true;
            pR = false;
        }else{
            pR = true;
            pL = false;
        }
        if(find(root.left, q)){
            qL = true;
            qR = false;
        }else{
            qR = true;
            qL = false;
        }
        //同一边
        if(pL && qL){
            return lowestCommonAncestor(root.left, p, q);
        }
        else if(pR && qR){
            return lowestCommonAncestor(root.right, p, q);
        }else{
            //两边
            return root;
        }

    }
 