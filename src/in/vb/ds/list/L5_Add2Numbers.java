package in.vb.ds.list;

public class L5_Add2Numbers {

    public static void main(String[] args) {
        SingleLinkedList<Integer> l1 = new SingleLinkedList<>();
        l1.add(5);
        l1.add(6);
        l1.add(3);
        l1.prettyPrint();

        SingleLinkedList<Integer> l2 = new SingleLinkedList<>();
        l2.add(8);
        l2.add(4);
        l2.add(2);
        l2.prettyPrint();

        L4_Merge2SortedList.prettyPrint(addLists(l1.head, l2.head));
    }



    private static SingleLinkedList.Node<Integer> addLists(SingleLinkedList.Node<Integer> first, SingleLinkedList.Node<Integer> second){

        int n1 = 0, n2 = 0;
        SingleLinkedList.Node<Integer> curr = first;
        while (curr != null){
            curr = curr.next;
            n1++;
        }

        curr = second;
        while (curr != null){
            curr = curr.next;
            n2++;
        }

        SingleLinkedList.Node<Integer> xNode = new SingleLinkedList.Node<>();
        if (n1 > n2){
            xNode = first;
            while (n1 == n2){
                first = first.next;
                n1--;
            }

        }

        SingleLinkedList.Node<Integer> head = add(first, second);
        if (head.data == 0){
            head = head.next;
        }
        return head;
    }

    private static SingleLinkedList.Node<Integer> add(SingleLinkedList.Node<Integer> first, SingleLinkedList.Node<Integer> second){
        if (first == null || second == null) return null;

        SingleLinkedList.Node<Integer> sumNode = add(first.next, second.next);
        int sum = first.data + second.data + (sumNode != null ? sumNode.data : 0);
        int carry = sum / 10;
        sum = sum % 10;

        if (sumNode == null) sumNode = new SingleLinkedList.Node<>();
        sumNode.data = sum;
        SingleLinkedList.Node<Integer> carryNode = new SingleLinkedList.Node<>();
        carryNode.data = carry;
        carryNode.next = sumNode;
        return carryNode;
    }
}
