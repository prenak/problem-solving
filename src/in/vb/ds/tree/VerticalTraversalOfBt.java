package in.vb.ds.tree;

import java.util.*;

public class VerticalTraversalOfBt {

    public static void main(String[] args) {
        Node r = new Node(1);
        r.left = new Node(2);
        r.right = new Node(3);

        r.left.left = new Node(4);
        r.left.right = new Node(5);

        r.right.right = new Node(6);
        r.left.left.right = new Node(7);

        System.out.println(verticalOrder(r));
    }

    private static ArrayList<Integer> verticalOrder(Node root) {
        ArrayList<Integer> vo = new ArrayList<>();
        Map<Integer, List<Pair>> tm = new TreeMap<>();

        traverse(root, tm, 0, 0);

        tm.forEach((hd, l) -> {
            Collections.sort(l, (a,b) -> {
                if (a.level < b.level) return -1;
                if (a.level > b.level) return 1;
                return 0;
            });

            l.forEach(pair -> vo.add(pair.data));
        });
        return vo;
    }

    private static void traverse(Node node, Map<Integer, List<Pair>> tm, int hd, int level){
        if (node == null) return;

        addToMap(tm, hd, level, node.data);

        traverse(node.left, tm, hd-1, level+1);
        traverse(node.right, tm, hd+1, level+1);
    }

    private static void addToMap(Map<Integer, List<Pair>> tm, int hd, int level, int data){
        if (tm.containsKey(hd)){
            tm.get(hd).add(new Pair(data, level));

        } else{
            List<Pair> l = new ArrayList<>();
            l.add(new Pair(data, level));
            tm.put(hd, l);
        }
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
}
