package in.vb.ds.array;

public class A21_CountingNonConsec1InBinary {

    public static void main(String[] args) {
        countNonConsec1(2);
        countNonConsec1(3);
        countNonConsec1(43); //- GFG fails
    }

    private static int countNonConsec1(int n) {
        int[] a = new int[n];
        int[] b = new int[n];
        a[0] = b[0] = 1;

        for (int i=1; i<n; i++) {
            a[i] = a[i-1] + b[i-1];
            b[i] = a[i-1];
        }
        int res = a[n - 1] + b[n - 1];
        System.out.println(res);
        return res;
    }
}
