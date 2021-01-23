package in.vb.ds.array;

public class A19_MissingNumberAndOneRepeating {

    public static void main(String[] args) {
        int[] a = {4, 3, 6, 2, 1, 1};
        findMissingNumber(a);

        int[] b = {3, 6, 5, 5, 8, 1, 2, 7};
        findMissingNumber(b);
    }

    private static void findMissingNumber(int[] a){
        int val, sum = 0, n = a.length;
        for (int i=0; i<n; i++){
            val = Math.abs(a[i]);
            if (a[val-1] > 0){
                sum += val;
                a[val-1] = -a[val-1];

            } else {
                System.out.println("Repeating number is: " + val);
            }
        }
        int expectedSum = (n * (n+1) )/2;
        System.out.println("Missing number is: "+ (expectedSum - sum));

    }
}
