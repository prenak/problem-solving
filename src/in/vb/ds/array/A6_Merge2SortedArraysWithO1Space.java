package in.vb.ds.array;

import java.util.Arrays;

public class A6_Merge2SortedArraysWithO1Space {

    public static void main(String[] args) {

        int[] a = {1, 5, 9, 10, 15, 20};
        int[] b = {2, 3, 8, 13};
        merge(a,b);

        int[] c = {10};
        int[] d = {2, 3};
        merge(c,d);

    }

    private static void merge(int[] a, int[] b){
        int m = a.length, n = b.length;

        // start from the last element of b
        for (int j=n-1; j>=0; j--){

            int last = a[m-1];
            // make space for the last element of b in a[]
            int i;
            for (i=m-2; i>=0 && a[i] > b[j]; i--){ // important
                // check if the element previous to last is greater than last element of b
                // move it to next index as we already have a backup of last
                a[i+1] = a[i];
            }

            if (i!= m-2 || last > b[j]){
                a[i+1] = b[j];
                b[j] = last;
            }
        }
        System.out.println(Arrays.toString(a) + " " + Arrays.toString(b));
    }
}
