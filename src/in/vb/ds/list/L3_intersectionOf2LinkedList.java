package in.vb.ds.list;

public class L3_intersectionOf2LinkedList {

    public static void main(String[] args) {
        SingleLinkedList<Integer> commonList = new SingleLinkedList<>();
        commonList.add(15);
        commonList.add(30);

        SingleLinkedList<Integer> l1 = new SingleLinkedList<>();
        l1.add(3);
        l1.add(6);
        l1.add(9);
        l1.append(commonList.head);
        l1.prettyPrint();

        SingleLinkedList<Integer> l2 = new SingleLinkedList<>();
        l2.add(10);
        l2.append(commonList.head);
        l2.prettyPrint();

        System.out.println(intersectPoint(l1.head, l2.head));
    }

    public static int intersectPoint(SingleLinkedList.Node<Integer> head1, SingleLinkedList.Node<Integer> head2) {

        int n1 = 0, n2 = 0;
        SingleLinkedList.Node<Integer> curr = head1;
        while (curr != null){
            curr = curr.next;
            n1++;
        }

        curr = head2;
        while (curr != null){
            curr = curr.next;
            n2++;
        }

        SingleLinkedList.Node<Integer> curr1 = head1;
        SingleLinkedList.Node<Integer> curr2 = head2;
        if (n1 > n2){
            while (n1 > n2){
                curr1 = curr1.next;
                n1--;
            }
        }

        if (n2 > n1){
            while (n2 > n1){
                curr2 = curr2.next;
                n2--;
            }
        }

        while (curr1 != null) {
            if (curr1 == curr2){
                return curr1.data;
            }
            curr1 = curr1.next;
            curr2 = curr2.next;
        }
        return -1;
    }
}
