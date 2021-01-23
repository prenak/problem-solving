package in.vb.ds.list;

public class L4_Merge2SortedList {

    public static void main(String[] args) {
        SingleLinkedList<Integer> l1 = new SingleLinkedList<>();
        l1.add(5);
        l1.add(10);
        l1.add(15);
        l1.add(40);
        l1.prettyPrint();

        SingleLinkedList<Integer> l2 = new SingleLinkedList<>();
        l2.add(2);
        l2.add(3);
        l2.add(20);
        l2.prettyPrint();

        prettyPrint(sortedMerge(l1.head, l2.head));
    }

    private static SingleLinkedList.Node<Integer> sortedMerge(SingleLinkedList.Node<Integer> headA, SingleLinkedList.Node<Integer> headB) {
        if (headA == null && headB == null) return null;
        if (headA == null) return headB;
        if (headB == null) return headA;


        SingleLinkedList.Node<Integer> n1 = headA;
        SingleLinkedList.Node<Integer> n2 = headB;

        if (n1.data > n2.data){
            SingleLinkedList.Node<Integer> tempNode = n1;
            n1 = n2;
            n2 = tempNode;
        }

        SingleLinkedList.Node<Integer> newHead = n1;
        while (n1.next != null && n2 != null){
            if ((Integer)n1.next.data > (Integer)n2.data){
                SingleLinkedList.Node<Integer> newNode = new SingleLinkedList.Node<>(n2.data);
                newNode.next = n1.next;
                n1.next = newNode;
                n2 = n2.next;
            }
            n1 = n1.next;
        }

        if (n2 != null) n1.next = n2;
        return newHead;
    }

    public static void prettyPrint(SingleLinkedList.Node<Integer> res){
        StringBuilder sb = new StringBuilder();
        SingleLinkedList.Node curr = res;
        while (curr != null){
            sb.append(curr.data).append(" -> ");
            curr = curr.next;
        }
        System.out.println(sb.toString());
    }
}
