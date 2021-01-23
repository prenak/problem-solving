package in.vb.ds.array;

import in.vb.algo.array.BinarySearch;

import java.util.Arrays;

public class A2_SearchElementInRotatedArray {

    public static void main(String[] args) {
        int[] a = {7,8,9,1,2,3,4,5,6};
        searchInRotatedButSortedArray(a, 8);
        System.out.println("------------------------------------------------\n");

        int[] b = {1,2,3,4,5,6,7,8,9};
        searchInRotatedButSortedArray(b, 8);
        System.out.println("------------------------------------------------\n");

        int[] c = {9,1,2,3,4,5,6,7,8};
        searchInRotatedButSortedArray(c, 8);
        System.out.println("------------------------------------------------\n");

        int[] d = {7,8,9,1,2,3,4,5,6};
        searchInRotatedButSortedArray(d, 7);
        System.out.println("------------------------------------------------\n");

        int[] e = {7,8,9,1,2,3,4,5,6};
        searchInRotatedButSortedArray(e, 9);
        System.out.println("------------------------------------------------\n");

        int[] f = {7,8,9,1,2,3,4,5,6};
        searchInRotatedButSortedArray(f, 1);
        System.out.println("------------------------------------------------\n");
    }

    private static void searchInRotatedButSortedArray(int[] a, int key){
        System.out.println("Searching " + key + " in " + Arrays.toString(a));
        int pivot = findPivot(a, 0, a.length-1);
        System.out.println("Pivot found at " + pivot);

        if (pivot == -1) BinarySearch.search(a, key);
        else if (a[pivot] == key) System.out.println("Found at " + pivot);
        else if (a[0] <= key) System.out.println("Found at " + BinarySearch.binarySearch(a, 0, pivot, key));
        else System.out.println("Found at " + BinarySearch.binarySearch(a, pivot+1, a.length-1, key));
    }

    private static int findPivot(int[] a, int low, int high){
        if (low > high) return -1;

        int mid = (low+high)/2;
        if (mid < high && a[mid] > a[mid+1]) return mid;

        if (mid > low && a[mid] < a[mid-1]) return mid-1;

        if (a[mid] > a[high]){
            return findPivot(a, mid, high);
        } else{
            return findPivot(a, low, mid-1);
        }
    }
}
