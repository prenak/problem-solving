package in.vb.ds.array;

import java.util.Scanner;

public class A26_JumpingCaterpillars {

    public static void main(String[] args) {
        // Driver
        Scanner scanner = new Scanner(System.in);
        int noOfTests = Integer.parseInt(scanner.nextLine());
        int noOfLeaves=0, noOfC=0;
        int[] jFactor = null;
        for (int t = 0; t < noOfTests; t++) {
            String[] srr1 = scanner.nextLine().trim().split(" ");
            noOfLeaves = Integer.parseInt(srr1[0]);
            noOfC = Integer.parseInt(srr1[1]);

            String[] srr = scanner.nextLine().trim().split(" ");
            jFactor = new int[srr.length];
            for (int i = 0; i < srr.length; i++) {
                jFactor[i] = Integer.parseInt(srr[i]);
            }
        }

        System.out.println(countUneatenLeaves(noOfLeaves, noOfC, jFactor));
    }

    private static int countUneatenLeaves(int noOfLeaves, int noOfC, int[] jFactor) {

        boolean[] leavesVisited = new boolean[noOfLeaves];
        for (int j=0; j<noOfC; j++){
            int jump = jFactor[j];
            if (jump == 1) {
                return 0;
            }

            for (int i=2; i<=noOfLeaves; i++){
                if (!leavesVisited[i-1] && i%jump == 0){
                    leavesVisited[i-1] = true;
                }
            }
        }

        int n=0;
        for (boolean visited : leavesVisited){
            if (!visited) n++;
        }
        return n;
    }
}
