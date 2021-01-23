package in.vb.ds.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LeftViewOfBinTree {

    public static void main(String[] args) {
        Node r = new Node(1);
        r.left = new Node(2);
        r.right = new Node(3);

        r.left.left = new Node(4);
        r.left.right = new Node(5);

        r.right.right = new Node(6);
        r.left.left.right = new Node(7);

        LeftViewOfBinTree lv = new LeftViewOfBinTree();
        System.out.println(lv.leftView(r));
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

    public ArrayList<Integer> leftView(Node root){
        if (root == null) return null;

        ArrayList<Integer> l = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()){
            int n = q.size();

            for (int i=0; i<n; i++){
                Node temp = q.poll();

                if (i==0) l.add(temp.data);

                if (temp.left != null) q.add(temp.left);
                if (temp.right != null) q.add(temp.right);
            }
        }

        return l;
    }
}
