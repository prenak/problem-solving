package in.vb.ds.array;

import java.util.Arrays;

public class A17_ArrangeArrayInZigZagFashion {

    public static void main(String[] args) {
        int[] a = {4,3,7,8,6,2,1};
        arrangeZigzag(a);

        int[] b = {1,4,3,2};
        arrangeZigzag(b);

        int[] c = {3,1,5,9,2,4,6};
        arrangeZigzag(c);
    }

    private static void arrangeZigzag(int[] a) {

        int n = a.length;
        for (int i=0; i<n-1; i++){
            if (i % 2 == 0){
                // even index
                if (a[i] > a[i+1]) swap(a, i, i+1);

            } else{
                //odd index
                if (a[i] < a[i+1]) swap(a, i, i+1);
            }
        }
        System.out.println(Arrays.toString(a));
    }

    private static void swap(int[] a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
