package in.vb.ds.array;

import in.vb.algo.array.MergeSort;

import java.util.Arrays;

public class A23_TwoNumberSumCloserToZero {

    public static void main(String[] args) {

        int[] a = {-8,-66,-60};
        System.out.println(sumOfTwoNumbers(a));

        int[] b = {-21,-67,-37,-18, 4,-65, 0};
        System.out.println(sumOfTwoNumbers(b));

        int[] c = {49,6,30,1,-2};
        System.out.println(sumOfTwoNumbers(c));
    }

    private static int sumOfTwoNumbers(int[] a){

        MergeSort.mergeSort(a);

        int n = a.length;
        if (n == 1) return a[0];

        if (n == 2) return a[0] + a[1];

        int l=0, h=n-1, sum =0, minSum = Integer.MAX_VALUE;
        while (l<h){
            sum = a[l] + a[h];
            minSum = getMin(minSum, sum);
            if (sum > 0){
                h--;
            } else {
                l++;
            }
        }

        return minSum;
    }

    private static int getMin(int a, int b) {
        if (Math.abs(a) > Math.abs(b)) return b;
        return a;
    }
}
