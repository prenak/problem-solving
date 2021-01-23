package in.vb.ds.stack;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

public class RottenOranges {

    public static void main(String[] args) {
        int[][] a = {{2,1,0,2,1},{0,0,1,2,1},{1,0,0,2,1}};
        System.out.println(rotOranges(a, 3, 5));

        int[][] b = {{2,1,0,2,1},{1,0,1,2,1},{1,0,0,2,1}};
        System.out.println(rotOranges(b, 3, 5));

        int[][] c = {{1,1,1,1,1},{0,2,1,1,1}};
        System.out.println(rotOranges(c, 2, 5));
    }

    public static int rotOranges(int a[][], int r, int c) {

        Queue<Data> q = new LinkedList<>();
        for (int i=0; i<r; i++){
            for (int j=0; j<c; j++){
                if (a[i][j] == 2){
                    Data d = new Data(i,j);
                    q.add(d);
                }
            }
        }
        q.add(new Data(true));


        int count = 0;
        boolean changed = false;

        while(!q.isEmpty()) {

            changed = false;
            while (! q.peek().dilimiter) {
                Data d = q.peek();
                int i = d.r-1, j = d.c;
                if (isValidIndex(i,j,r,c) && a[i][j]==1){
                    a[i][j] = 2;
                    changed = true;
                    q.add(new Data(i,j));
                }

                i = d.r; j=d.c+1;
                if (isValidIndex(i,j,r,c) && a[i][j]==1){
                    a[i][j] = 2;
                    changed = true;
                    q.add(new Data(i,j));
                }

                i = d.r+1; j=d.c;
                if (isValidIndex(i,j,r,c) && a[i][j]==1){
                    a[i][j] = 2;
                    changed = true;
                    q.add(new Data(i,j));
                }

                i = d.r; j=d.c-1;
                if (isValidIndex(i,j,r,c) && a[i][j]==1){
                    a[i][j] = 2;
                    changed = true;
                    q.add(new Data(i,j));
                }
                q.remove();
            }

            q.remove();
            if (changed) count++;
            if (!q.isEmpty()) q.add(new Data(true));
        }

        return checkIfGoodOrangeExists(a, r, c) ? -1: count;
    }

    private static boolean checkIfGoodOrangeExists(int a[][], int r, int c){
        for (int i=0; i<r; i++){
            for (int j=0; j<c; j++){
                if (a[i][j] == 1){
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean isValidIndex(int i, int j, int r, int c){
        return i >= 0 && i < r && j >= 0 && j < c;
    }

    private static class Data {
        int r;
        int c;
        boolean dilimiter;

        public Data(int r, int c) {
            this.r = r;
            this.c = c;
        }

        public Data(boolean dilimiter) {
            this.dilimiter = dilimiter;
        }
    }
}
