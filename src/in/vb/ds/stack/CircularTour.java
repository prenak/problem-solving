package in.vb.ds.stack;

public class CircularTour {

    public static void main(String[] args) {

        int[] p1 = {4,6,7,4};
        int[] d1 = {6,5,3,5};
        System.out.println(tour(p1, d1));
    }

    private static int tour(int petrol[], int distance[]) {
        int n = petrol.length;

        for (int start=0; start<n; start++){
            int t = start, totalP = 0, totalD = 0;
            while (true){
                totalP += petrol[t];
                totalD += distance[t];
                if (totalD > totalP){
                    break;
                }

                t = getNextIndex(t, n);
                if (t == start){
                    return start+1;
                }
            }
        }
        return -1;
    }

    private static int getNextIndex(int i, int n){
        return (i+1)%n;
    }
}
