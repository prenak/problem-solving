package in.vb.ds.tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class SpiralTraversal {

    ArrayList<Integer> findSpiral(Node root)
    {
        if (root == null) return new ArrayList<>();

        ArrayList<Integer> l = new ArrayList<>();
        Deque<Node> dq1 = new ArrayDeque<>();
        Deque<Node> dq2 = new ArrayDeque<>();
        int level = 0;
        dq2.addFirst(root);

        while(!getQtoTraverse(level, dq1, dq2).isEmpty()){

            int n = getQtoTraverse(level, dq1, dq2).size();

            for (int i=0; i<n; i++){
                Node node = getQtoTraverse(level, dq1, dq2).poll();
                l.add(node.data);

                if (level%2 == 0){
                    if (node.right!=null) getQtoAdd(level, dq1, dq2).addFirst(node.right);
                    if (node.left!=null) getQtoAdd(level, dq1, dq2).addFirst(node.left);

                } else {
                    if (node.left!=null) getQtoAdd(level, dq1, dq2).addFirst(node.left);
                    if (node.right!=null) getQtoAdd(level, dq1, dq2).addFirst(node.right);
                }
            }

            level++;
        }
        return l;

    }

    private static Deque<Node> getQtoAdd(int level, Deque<Node> dq1, Deque<Node> dq2){
        return level%2 == 0 ?  dq1 : dq2;
    }

    private static Deque<Node> getQtoTraverse(int level, Deque<Node> dq1, Deque<Node> dq2){
        return level%2 == 0 ?  dq2 : dq1;
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
