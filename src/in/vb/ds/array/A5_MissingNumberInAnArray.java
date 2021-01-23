package in.vb.ds.array;

public class A5_MissingNumberInAnArray {

    public static void main(String[] args) {
        int[] a = {1,2,3,5};
        findMissingNumberInArray(a, 5);

        int[] b = {1,2,3,4,5,6,7,8,10};
        findMissingNumberInArray(b, 10);
    }

    private static void findMissingNumberInArray(int a[], int n){
        int sumSupposedToBe = (n * (n+1))/2;
        int sumActual = 0;
        for (Integer i : a){
            sumActual+=i;
        }
        System.out.println("Missing number: "+ (sumSupposedToBe-sumActual));
    }
}
