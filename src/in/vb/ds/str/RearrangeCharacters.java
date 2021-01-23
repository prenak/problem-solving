package in.vb.ds.str;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class RearrangeCharacters {

    public static void main(String[] args) {
        System.out.println(canRearrangeChars("geeksforgeeks".toCharArray()));
    }

    private static int canRearrangeChars(char[] c){
        Map<Character, Integer> om = new HashMap<>();
        for (char ch : c){
            if (om.containsKey(ch)){
                om.put(ch, om.get(ch)+1);
            } else {
                om.put(ch, 1);
            }
        }

        Queue<Data> pq = new PriorityQueue<Data>((d1, d2) -> {
            return Integer.compare(d2.priority, d1.priority);
        });

        om.forEach((k,v) -> {
            pq.add(new Data(k,v));
        });

        Data temp = pq.poll();
        while (!pq.isEmpty()){
            System.out.println(temp.c);
            Data temp2 = pq.poll();
            temp.priority -= 1;
            if (temp.priority > 0){
                pq.add(temp);
            }
            temp = temp2;
        }

        return temp.priority > 1 ? 0 : 1;
    }




    private static class Data {
        char c;
        int priority;

        public Data(char c, int priority) {
            this.c = c;
            this.priority = priority;
        }
    }
}
