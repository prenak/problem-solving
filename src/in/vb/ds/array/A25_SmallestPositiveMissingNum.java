package in.vb.ds.array;

import java.util.Arrays;
import java.util.Scanner;

public class A25_SmallestPositiveMissingNum {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        find(clean(a));

        int[] b = {0, -10, 1, 3, -20};
        find(clean(b));

        int[] c = {36, 27, -35, 43, -15, 36, 42, -1, -29, 12, -23, 40, 9, 13, -24, -10, -24, 22, -14, -39, 18, 17, -21, 32, -20, 12, -27, 17, -15, -21, -48, -28, 8, 19, 17, 43, 6, -39, -8, -21, 23, -29, -31, 34, -13, 48, -26, -35, 20, -37, -24, 41, 30, 6, 23, 12, 20, 46, 31, -45, -25, 34, -23, -14, -45, -4, -21, -37, 7, -26, 45, 32, -5, -36, 17, -16, 14, -7, 0, 37, -42, 26, 28, 38};
        find(clean(c));

        // Driver
        Scanner scanner = new Scanner(System.in);
        int noOfTests = Integer.parseInt(scanner.nextLine());
        for (int t = 0; t < noOfTests; t++) {
            int n = Integer.parseInt(scanner.nextLine());

            String[] srr = scanner.nextLine().trim().split(" ");
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(srr[i]);
            }

            find(clean(arr));
        }
    }

    // cleaning is not really required
    private static int[] clean(int[] a) {
        int j = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] <= 0) {
                if (i != j) {
                    swap(a, i, j);
                }
                j++;
            }
        }

        int[] a2 = new int[a.length-j];
        int i =0;
        while (j < a.length){
            a2[i++] = a[j];
            j++;
        }
        return a2;
    }

    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }


    private static void find(int[] a) {
        int n = a.length;
        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            // if (a[i] > 0 && a[i] <= n){ use this if cleaning not done
            if (a[i] <= n) {
                visited[a[i] - 1] = true;
            }
        }

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                System.out.println(i + 1);
                return;
            }
        }
        System.out.println(n + 1);
    }
}
