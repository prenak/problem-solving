package in.vb.ds.list;

public class L1_SingleLinkedList {

    Node head;

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public int getMiddle(Node head){
        Node p1 = head, p2 = head;
        int count = 0;
        while (p1.next != null){
            count++;
            if (count%2 == 0){
                p2 = p2.next;
            }
            p1 = p1.next;
        }

        if (count%2==0){
            return p2.data;
        } else{
            return p2.next.data;
        }

    }

    public Node reverseList(Node head) {
        if (head == null || head.next == null) return head;

        Node prev = null, next = null;
        Node curr = head;

        while (curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        this.head = prev;
        return prev;
    }


    public Node rotate(Node head, int k) {

        Node curr = head;
        while (curr.next != null){
            curr = curr.next;
        }

        Node prev = curr;
        prev.next = null;

        while(curr.next != null){
            curr = curr.next;
        }
        curr.next = head;

        for (int i=0;i<k;i++){
            curr = curr.next;
        }

        head = curr.next;
        curr.next = null;
        return head;
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
}
