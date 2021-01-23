package in.vb.ds.list;

public class Driver {

    public static void main(String[] args) {
        SingleLinkedList<Integer> list = new SingleLinkedList<>();
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(6);
        list.add(9);
        list.add(5);
        list.prettyPrint();

        L1_SingleLinkedList l1 = new L1_SingleLinkedList();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        l1.add(6);
        System.out.println(l1.getMiddle(l1.head));
        System.out.println(l1.reverseList(l1.head).data);
        l1.prettyPrint();

        L2_SingleLinkedList l2 = new L2_SingleLinkedList();
        l2.add(1);
        l2.add(2);
        l2.add(3);
        l2.add(4);
        l2.add(5);
        l2.add(6);
        l2.add(7);
        l2.add(8);
        l2.head = l2.reverseInGroups(l2.head, 4);
        l2.prettyPrint();

        L2_SingleLinkedList l3 = new L2_SingleLinkedList();
        l3.add(1);
        l3.add(2);
        l3.add(3);
        l3.add(4);
        l3.add(5);
        l3.head = l3.reverseInGroups(l3.head, 3);
        l3.prettyPrint();
    }


}
