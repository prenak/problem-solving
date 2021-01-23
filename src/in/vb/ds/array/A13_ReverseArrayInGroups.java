package in.vb.ds.array;

import java.util.Arrays;

public class A13_ReverseArrayInGroups {

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        reverseInGroups(a, 3);

        int[] b = {5,6,8,9};
        reverseInGroups(b, 3);
    }

    private static void reverseInGroups(int[] a, int k){
        for(int i=0; i<a.length; i=i+k){
            int l = i;
            int h = Math.min(i+k-1, a.length-1);

            while (l<h){
                int temp = a[l];
                a[l] = a[h];
                a[h] = temp;
                l++;
                h--;
            }
        }
        System.out.println("Reversed array: " + Arrays.toString(a));
    }
}
