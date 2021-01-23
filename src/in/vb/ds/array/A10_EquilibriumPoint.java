package in.vb.ds.array;

public class A10_EquilibriumPoint {

    public static void main(String[] args) {

        int[] a = {1,3,5,2,2};
        findEquilibriumPoint(a);

        int[] b = {-7, 1, 5, 2, -4, 3, 0};
        findEquilibriumPoint(b);

        int[] c = {1,2,3};
        findEquilibriumPoint(c);

    }

    private static void findEquilibriumPoint(int[] a){

        int n = a.length;
        int leftSum = 0, rightSum = 0;
        int i;
        for (i=0; i<=n-2; i++){
            leftSum += a[i];
        }

        i = n-2;
        while (i > 0){
            leftSum -= a[i];
            rightSum += a[i+1];
            if (leftSum == rightSum){
                System.out.println("Equilibrium point: " + i);
                return;
            }
            i--;
        }
        System.out.println("No equilibrium point");

    }
}
