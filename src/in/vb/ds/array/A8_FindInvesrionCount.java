package in.vb.ds.array;

import java.util.Arrays;

public class A8_FindInvesrionCount {

    static int inversionCount = 0;

    public static void main(String[] args) {
        inversionCount = 0;
        int[] a = {2,4,1,3,5};
        mergeSort(a);
        System.out.println(Arrays.toString(a));
        System.out.println("Inversion count: " + inversionCount);

        inversionCount = 0;
        int[] b = {1,2,3,4,5,6,7};
        mergeSort(b);
        System.out.println(Arrays.toString(b));
        System.out.println("Inversion count: " + inversionCount);

        inversionCount = 0;
        int[] c = {8, 4, 2, 1};
        mergeSort(c);
        System.out.println(Arrays.toString(c));
        System.out.println("Inversion count: " + inversionCount);

        inversionCount = 0;
        int[] d = {3, 1, 2};
        mergeSort(d);
        System.out.println(Arrays.toString(d));
        System.out.println("Inversion count: " + inversionCount);
    }

    private static void mergeSort(int[] a) {
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
                inversionCount++;
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
