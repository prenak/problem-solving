package in.vb.ds.tree;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class BottomViewOfTree {

    public static void main(String[] args) {
        Node r = new Node(1);
        r.left = new Node(2);
        r.right = new Node(3);

        r.left.left = new Node(4);
        r.left.right = new Node(5);

        r.right.right = new Node(6);
        r.left.left.right = new Node(7);

        System.out.println(bottomView(r));
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

    private static class Pair {
        int data;
        int level;

        public Pair(int data, int level){
            this.data = data;
            this.level = level;
        }
    }

    private static ArrayList<Integer> bottomView(Node root) {
        ArrayList<Integer> l = new ArrayList<>();
        Map<Integer, Pair> tm = new TreeMap<>();

        traverse(root, tm, 0, 0);

        tm.forEach((k,v) ->{
            l.add(v.data);
        });
        return l;
    }

    private static void traverse(Node node, Map<Integer, Pair> tm, int level, int hd){
        if (node == null) return;

        if (!tm.containsKey(hd) || tm.get(hd).level <= level){
            tm.put(hd, new Pair(node.data, level));
        }

        traverse(node.left, tm, level+1, hd-1);
        traverse(node.right, tm, level+1, hd+1);
    }
}
