package in.vb.ds.array;

public class A20_MaxIndex {

    public static void main(String[] args) {

        int[] a = {34,8,10,3,2,80,30,33,1};
        findMaxIndex(a);
    }

    private static void findMaxIndex(int[] a) {

        int maxIndex=0, n=a.length;
        for (int i=0; i <n; i++){
            int j = n-1;
            while (j > i+maxIndex){
                if (a[i] <= a[j]){
                    maxIndex = Math.max(j-i, maxIndex);
                }
                j--;
            }
        }
        System.out.println(maxIndex);
    }
}
