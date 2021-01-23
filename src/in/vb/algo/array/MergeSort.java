package in.vb.algo.array;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] a = {3,6,4,1,8,2,7,9,5};
        mergeSort(a);
        System.out.println(Arrays.toString(a));

        int[] b = {1,2,3,4,5,6,7};
        mergeSort(b);
        System.out.println(Arrays.toString(b));
    }

    public static void mergeSort(int[] a) {
        int l = a.length;
        if (l == 1) return;

        int mid = l/2;
        int[] lhs = new int[mid];
        int[] rhs = new int[l-mid];

        for (int i=0; i<mid; i++){
            lhs[i] = a[i];
        }
        for (int i=mid; i<l; i++){
            rhs[i-mid] = a[i];
        }

        mergeSort(lhs);
        mergeSort(rhs);

        merge(a, lhs, rhs);
    }

    private static void merge(int[] a, int[] lhs, int[] rhs) {
        int i=0, j=0, k=0;
        while (i < lhs.length && j < rhs.length){
            if (lhs[i] <= rhs[j]){
                a[k++] = lhs[i++];
            } else {
                a[k++] = rhs[j++];
            }
        }
        while (i < lhs.length){
            a[k++] = lhs[i++];
        }
        while (j < rhs.length){
            a[k++] = rhs[j++];
        }
    }
}
