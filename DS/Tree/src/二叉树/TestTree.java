package 二叉树;

public class TestTree {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.insert(10);
        tree.insert(20);
        tree.insert(15);
        tree.insert(3);

        System.out.println(tree.root.data);
        System.out.println(tree.root.right.data);
        System.out.println(tree.root.right.left.data);
        System.out.println(tree.root.left.data);
    }
}
