package in.vb.ds.array;

public class A15_TrappingRainWater {

    public static void main(String[] args) {
        int[] a = {3,0,0,2,0,4};
        findCap(a);

        int[] b = {3,0,0,2,0,4,2,0,1};
        findCap(b);

        int[] c = {7,4,0,9};
        findCap(c);

        int[] d = {6,9,9};
        findCap(d);
    }

    public static void findCap(int[] a){
        int sum = 0, n = a.length;
        int l=0, r=n-1;
        int lmax = a[0], rmax = a[n-1];

        while (l < r){
            if (lmax <= rmax){

                if (lmax > a[l+1]){
                    sum = sum + (lmax-a[l+1]);
                } else {
                    lmax = a[l+1];
                }
                l++;

            }
            else {

                if (rmax > a[r-1]){
                    sum = sum + (rmax-a[r-1]);
                } else {
                    rmax = a[r-1];
                }
                r--;

            }
        }
        System.out.println("Can hold " + sum + " units of water");
    }
}
