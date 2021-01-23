package in.vb.ds.stack;

import java.util.Arrays;
import java.util.Stack;

public class S1_LargerElement {

    public static void main(String[] args) {
        int[] a = {6,8,0,1,3};
        findLargerElement(a);

        int[] b = {1,2,3,4};
        findLargerElement(b);

        int[] c = {1,3,2,4};
        findLargerElement(c);
    }


    private static void findLargerElement(int[] a){
        int n = a.length;
        Stack<Integer> stack = new Stack<>();

        for (int i=n-1; i>=0; i--){
            int e = a[i];
            while (!stack.empty() && stack.peek() <= e) {
                stack.pop();
            }
            a[i] = stack.empty() ? -1 : stack.peek();
            stack.push(e);
        }
        System.out.println(Arrays.toString(a));
    }
}
