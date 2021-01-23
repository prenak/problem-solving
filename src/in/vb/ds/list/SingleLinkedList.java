package in.vb.ds.list;

public class SingleLinkedList<T> {

    Node head;

    static class Node<T> {
        T data;
        Node next;

        public Node(){}

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    public void add(T data){
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

    public void append(Node anotherHead){
        if (head == null){
            head = anotherHead;
            return;
        }

        Node curr = head;
        while (curr.next != null){
            curr = curr.next;
        }
        curr.next = anotherHead;
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
