package in.vb.ds.tree;

public class DiameterOfATree {

    public static void main(String[] args) {
        Node r = new Node(1);
        r.left = new Node(2);
        r.right = new Node(3);

        r.left.left = new Node(4);
        r.left.right = new Node(5);

        r.right.right = new Node(6);
        r.left.left.right = new Node(7);

        System.out.println(diameter(r));
    }

    private static int diameter(Node root) {
        if (root == null) return 0;

        int lh = height(root.left);
        int rh = height(root.right);

        return Math.max((1+lh+rh), Math.max(diameter(root.left), diameter(root.right)));
    }

    private static int height(Node node){
        if (node == null) return 0;
        return 1 + Math.max(height(node.left), height(node.right));
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
}
