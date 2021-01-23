package in.vb.ds.array;

import java.util.Arrays;
import java.util.Scanner;

public class A3_SubArrayWithGivenSum {

    public static void main(String[] args) {

        int[] a = {1,2,3,7,5};
        findSubArrayWithGivenSum(a, 12);

        int[] b = {1,2,3,4,5,6,7,8,9,10};
        findSubArrayWithGivenSum(b, 15);
    }

    private static void findSubArrayWithGivenSum(int[] arr, int sum){
        System.out.println("Array to find a sub array in " + Arrays.toString(arr));
        int from = 0, sumTillNow = 0;
        for (int i=0; i< arr.length; i++){
            sumTillNow += arr[i];

            while(sumTillNow > sum){
                sumTillNow -= arr[from++];
            }

            if (sumTillNow == sum){
                printFromAndTo(from, i);
                break;
            }
        }
    }

    private static void printFromAndTo(int from, int to){
        System.out.println("Subarray found from "+(from+1)+ " to "+(to+1));
    }

    private static void scannerCode(){
        Scanner scanner = new Scanner(System.in);
        int noOfTests = Integer.parseInt(scanner.nextLine());
        for (int t=0; t<noOfTests; t++){
            String[] vals = scanner.nextLine().split(",");
            int sum = Integer.parseInt(vals[0]);
            int n = Integer.parseInt(vals[1]);

            String[] srr = scanner.nextLine().split(",");
            int[] arr = new int[n];
            for (int i=0; i<n; i++){
                arr[i] = Integer.parseInt(srr[i]);
            }
        }
    }
}
