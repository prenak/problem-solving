package in.vb.ds.array;

import java.util.Arrays;

public class A18_LargestNumberFromArray {

    public static void main(String[] args) {
        Integer[] a = {3, 30, 34, 5, 9};
        arrange(a);

        Integer[] b = {54, 546, 548, 60};
        arrange(b);
    }

    private static void arrange(Integer[] a){
        Arrays.sort(a, (n1,n2) -> {
            if (Integer.parseInt(String.format("%s%s", n1,n2)) >= Integer.parseInt(String.format("%s%s", n2,n1))){
                return -1;
            } else {
                return 1;
            }
        });
        System.out.println(Arrays.toString(a));
    }
}
