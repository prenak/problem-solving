package in.vb.ds.array;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int noOfTests = Integer.parseInt(scanner.nextLine());
        for (int t=0; t<noOfTests; t++){
            String[] vals = scanner.nextLine().split(" ");
            int sum = Integer.parseInt(vals[1]);
            int n = Integer.parseInt(vals[0]);

            String[] srr = scanner.nextLine().trim().split(" ");
            int[] arr = new int[n];
            for (int i=0; i<n; i++){
                arr[i] = Integer.parseInt(srr[i]);
            }
        }
    }
}
