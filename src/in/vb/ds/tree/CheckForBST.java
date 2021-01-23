package in.vb.ds.tree;

public class CheckForBST {

    public static void main(String[] args) {
        Node r = new Node(1);
        r.left = new Node(2);
        r.right = new Node(3);

        r.left.left = new Node(4);
        r.left.right = new Node(5);

        r.right.right = new Node(6);
        r.left.left.right = new Node(7);

        System.out.println(isBST(r));
    }

    private static class Node {
        int data;
        Node left, right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    private static boolean isBST(Node root) {
        return checkBst(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private static boolean checkBst(Node node, int min, int max) {
        if (node == null) return true;

        if (node.data < min || node.data > max) return false;

        return checkBst(node.left, min, node.data-1) && checkBst(node.right, node.data+1, max);
    }
}
