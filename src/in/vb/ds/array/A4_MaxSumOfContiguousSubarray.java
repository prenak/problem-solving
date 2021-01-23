package in.vb.ds.array;

public class A4_MaxSumOfContiguousSubarray {

    public static void main(String[] args) {
        int[] a = {1,-9,3,7,5};
        findMaxSumOfContiguousSubArray(a);

        int[] b = {1,2,3,4,5,6,7,8,9,10};
        findMaxSumOfContiguousSubArray(b);

        int[] c = {1,2,3,-2,5};
        findMaxSumOfContiguousSubArray(c);

        int[] d = {-1,-2,-3,-4};
        findMaxSumOfContiguousSubArray(d);

        int[] e = {1,2,3,-6,5,4};
        findMaxSumOfContiguousSubArray(e);
    }

    // this works better with dynamic programing
    private static void findMaxSumOfContiguousSubArray(int[] arr){
        int n = arr.length;
        int maxTillHere = arr[0], max = arr[0];
        for (int i=1; i<n; i++){
            max += arr[i];
            if (max < 0) {
                max = 0;
            }
            maxTillHere = Math.max(max, maxTillHere);
        }
        if (maxTillHere == 0) maxTillHere = arr[0];
        System.out.println("Max sum: " + maxTillHere);
    }
}
