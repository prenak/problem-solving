package in.vb.ds.array;

import in.vb.algo.array.MergeSort;

public class A12_MinimumPlatforms {

    public static void main(String[] args) {

        int[] a = {900,940,950,1100,1500,1800};
        int[] d = {910,1200,1120,1130,1900,2000};
        findMinimumPlatforms(a, d);

    }

    private static void findMinimumPlatforms(int[] a, int[] d){

        MergeSort.mergeSort(a);
        MergeSort.mergeSort(d);

        int i=0, j=0, n=a.length, count=0;
        while (i < n){
            if (a[i] < d[j]){
                count++;
                i++;
            } else {
                count--;
                j++;
            }
        }
        System.out.println("No of platform: " + count);
    }
}
