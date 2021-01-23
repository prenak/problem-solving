package in.vb.ds.array;

import java.util.Arrays;

public class A9_SortArrayWith012 {

    public static void main(String[] args) {

        int[] a = {0, 1, 2, 0, 1, 2};
        do3WayPartition(a);

        int[] b = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
        do3WayPartition(b);
    }

    private static void do3WayPartition(int[] a){
        int l=0, mid=0, h=a.length-1;
        while(mid <= h){
            switch (a[mid]){
                case 0: swap(a, l, mid);
                        l++;
                        mid++;
                        break;

                case 1: mid++;
                        break;

                case 2: swap(a, mid, h);
                        // IMPORTANT: no mid++;
                        h--;
                        break;
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
