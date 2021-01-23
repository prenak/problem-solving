package in.vb.algo.array;

import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9};
        search(a, 1);
        search(a, 5);
        search(a, 7);
        search(a, 11);
        search(a, 9);
    }

    public static void search(int[] a, int key){
        System.out.println("Searching " + key + " in " + Arrays.toString(a));
        int n = a.length;

        if (n==0) System.out.println("Not found");

        int index = binarySearch(a, 0, a.length-1, key);
        System.out.println(index >= 0 ? "Found at " + index : "Not found");
    }

    // l = 0
    // h = array length - 1
    public static int binarySearch(int[] a, int low, int high, int key){
        if (low > high) return -1;

        int mid = (low+high)/2;

        if (key == a[mid]){
            return mid;

        } else if (key < a[mid]){
            return binarySearch(a, low, mid-1, key);
        } else {
            return binarySearch(a, mid+1, high, key);
        }
    }
}
