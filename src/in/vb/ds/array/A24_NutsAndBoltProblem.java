package in.vb.ds.array;

import java.util.Arrays;

public class A24_NutsAndBoltProblem {

    public static void main(String[] args) {
        char[] nuts = {'@', '%', '$', '#', '^'};
        char[] bolts = {'%', '@', '#', '$', '^'};
        match(nuts, bolts);

        System.out.println("Nuts: " + Arrays.toString(nuts) + ";  Bolts: " + Arrays.toString(bolts));
    }

    private static void match(char[] nuts, char[] bolts){
        mergeSort(nuts);
        mergeSort(bolts);
    }


    private static void mergeSort(char[] e){
        int n = e.length;
        if (n == 1) return;

        int mid = n/2;
        char[] a = new char[mid];
        char[] b = new char[n-mid];

        for (int i=0; i<mid; i++){
            a[i] = e[i];
        }

        for (int i=mid; i<n; i++){
            b[i-mid] = e[i];
        }

        mergeSort(a);
        mergeSort(b);

        merge(e, a, b);
    }

    private static void merge(char[] e, char[] a, char[] b) {
        int i=0, j=0, k=0;
        while(i<a.length && j<b.length){
            if (getOrder(a[i]) <= getOrder(b[j])){
                e[k++] = a[i++];
            } else {
                e[k++] = b[j++];
            }
        }

        while(i<a.length){
            e[k++] = a[i++];
        }

        while(j<b.length){
            e[k++] = b[j++];
        }
    }

    private static int getOrder(char c){
        switch (c){
            case '!': return 1;
            case '#': return 2;
            case '$': return 3;
            case '%': return 4;
            case '&': return 5;
            case '*': return 6;
            case '@': return 7;
            case '^': return 8;
            case '~': return 9;
            default: return -1;
        }
    }
}
