package in.vb.ds.list;

public class L2_SingleLinkedList {

    Node head;

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void add(int data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            return;
        }

        Node curr = head;
        while (curr.next != null){
            curr = curr.next;
        }
        curr.next = newNode;
    }

    public void prettyPrint(){
        StringBuilder sb = new StringBuilder();
        Node curr = head;
        while (curr != null){
            sb.append(curr.data).append(" -> ");
            curr = curr.next;
        }
        System.out.println(sb.toString());
    }

    public Node reverseInGroups(Node head, int k) {
        if (head == null || head.next == null){
            return head;
        }
        int i=0;
        Node curr = head, prev = null, next = null;
        while (i<k && curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            i++;
        }
        head.next = reverseInGroups(curr, k);
        return prev;
    }


}
