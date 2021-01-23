package in.vb.ds.array;

import java.util.Collections;
import java.util.PriorityQueue;

public class A14_KthSmallestElement {

    public static void main(String[] args) {
        int[] a = {7,10,4,3,20,15};
        find(a, 3);

        int[] b = {7,10,4,20,15};
        find(b, 4);
    }

    public static void find(int a[], int k){
        k = Math.min(a.length, k);
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(k, Collections.reverseOrder());

        for (int i=0; i<a.length; i++) {
            if (i < k ) {
                maxHeap.add(a[i]);
            }
            else{
                if (a[i] < maxHeap.peek()){
                    maxHeap.poll();
                    maxHeap.add(a[i]);
                }
            }
        }
         System.out.println("" + k + "th smallest element is " + maxHeap.peek());
    }
}
