package in.vb.ds.array;

public class A11_LeadersInArray {

    public static void main(String[] args) {

        int[] a = {16,17,4,3,5,2};
        printLeadersInArray(a);
    }

    private static void printLeadersInArray(int[] a){
        int n = a.length, max = a[n-1];
        System.out.print(a[n-1] + ", ");
        for (int i=n-2; i>=0; i--){
            if (a[i] >= max) {
                System.out.print(a[i] + ", ");
                max = a[i];
            }
        }
    }
}
