package in.vb.ds.array;

import java.util.Arrays;

public class A7_RearrangeAlternatively {

    public static void main(String[] args) {

        int[] a = {1,2,3,4,5,6};
        rearrangeAlternatively(a);

        int[] b = {10,20,30,40,50,60,70,80,90,100,110};
        rearrangeAlternatively(b);
    }

    private static void rearrangeAlternatively(int[] a){
        int n = a.length;
        int i = 0;
        while (i < n){
            int last = a[n-1];
            for (int j=n-1; j>i; j--){
                a[j] = a[j-1];
            }
            a[i] = last;
            i+=2;
        }
        System.out.println(Arrays.toString(a));
    }
}
