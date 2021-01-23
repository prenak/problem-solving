package in.vb.ds.array;

import java.util.Arrays;

public class A1_RotateArray {

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7};
        rotateSimple(a, 2);

        int[] b = {1,2,3,4,5,6,7,8,9,10,11,12};
        rotateThroughJugglingAlgo(b, 3);

        int[] c = {1,2,3,4,5,6,7,8,9};
        int[] d = Arrays.copyOf(c, c.length);
        rotateSimple(d, 5);
        rotateThroughJugglingAlgo(c, 5);
    }

    // Faulty when GCD is 1
    private static void rotateThroughJugglingAlgo(int[] a, int noOfRotation){
        System.out.println("Array to rotate: " + Arrays.toString(a));
        int n = a.length;
        noOfRotation = noOfRotation % n;

        int gcd = findGcd(n, noOfRotation);
        System.out.println("GCD: " + gcd);

        int i, j, k, temp;
        for (i = 0; i < gcd; i++) {
            /* move i-th values of blocks */
            temp = a[i];
            j = i;
            while (true) {
                k = j + noOfRotation;
                if (k >= n)
                    k = k - n;
                if (k == i)
                    break;
                a[j] = a[k];
                j = k;
            }
            a[j] = temp;
        }
        System.out.println("Rotated array: " + Arrays.toString(a));
    }


    // Assuming a > b
    private static int findGcd(int a, int b){
        if (b == 0) return a;
        if (a % b == 0) return b;
        return findGcd(b, a % b);
    }


    private static void rotateSimple(int[] a, int noOfRotation){
        System.out.println("Array to rotate: " + Arrays.toString(a));
        int n = a.length;
        noOfRotation = noOfRotation % n;
        for (int i=0; i<noOfRotation; i++){
            int temp = a[n-1];

            for (int k=n-1; k>0; k--){
                a[k] = a[k-1];
            }
            a[0] = temp;
        }
        System.out.println("Rotated array: " + Arrays.toString(a));
    }

    private static void rotateByReversing(int[] a, int noOfRotation){

    }
}
