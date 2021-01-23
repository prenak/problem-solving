package in.vb.ds.array;

import in.vb.algo.array.MergeSort;

public class A16_PythagoreanTriplets {

    public static void main(String[] args) {
        int[] a = {3, 2, 4, 6, 5};
        check(a);

        int[] b = {3, 8, 5};
        check(b);
    }

    private static void check(int[] a){
        int n = a.length;

        for (int i=0; i<n; i++){
            a[i] = a[i]*a[i];
        }

        MergeSort.mergeSort(a);

        boolean found = false;
        int k = n-1;
        while (k > 1){
            int i=0, j=k-1, checkSum = a[k];
            while (i<j){
                int sum = a[i] + a[j];
                if (sum == checkSum){
                    found = true;
                    break;
                }
                if (sum > checkSum){
                    j--;
                } else {
                    i++;
                }
            }
            k--;
        }
        System.out.println(found ? "Yes" : "No");
    }
}
