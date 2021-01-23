package in.vb.ds.array;

import java.util.Arrays;

public class A22_MajorityElement {

    public static void main(String[] args) {
        int[] a = {1,2,3};
        System.out.println(findMajorityEle(a));

        int[] b = {3,1,3,3,2,2,3};
        System.out.println(findMajorityEle(b));
    }

    private static int findMajorityEle(int[] a){
        int n = a.length;
        // 2 step process

        int candidate = findCandidate(a, n);
        return checkMajorityElelmentForCandidate(a, n, candidate);
    }

    private static int checkMajorityElelmentForCandidate(int[] a, int n, int candidate) {
        int count = 0;
        for(int i=0; i<n; i++){
            if (a[i] == candidate){
                count++;
                if (count > n/2) return candidate;
            }
        }
        return -1;
    }

    private static int findCandidate(int[] a, int n) {

        int m=0, count=1;
        for (int i=1; i<n; i++){
            if (a[m] == a[i]){
                count++;
            } else {
                count--;
            }

            if (count == 0){
                m = i; count = 1;
            }
        }
        return a[m];
    }
}
