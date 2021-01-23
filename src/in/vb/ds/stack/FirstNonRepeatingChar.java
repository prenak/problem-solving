package in.vb.ds.stack;

import java.util.*;

public class FirstNonRepeatingChar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int noOfTestCases = Integer.parseInt(scanner.nextLine());
        for (int i=0; i<noOfTestCases; i++){
            System.out.println("Enter the number of chars in the stream");
            int n = Integer.parseInt(scanner.nextLine());
            String[] vals = scanner.nextLine().split(" ");
            Queue<Character> q = new LinkedList<>();
            Set<Character> h = new HashSet<>();
            StringBuffer sb = new StringBuffer();
            for (String s : vals){
                Character val = s.charAt(0);
                if (h.contains(val)){
                    q.remove(val);
                } else {
                    h.add(val);
                    q.add(val);
                }

                sb.append(q.isEmpty() ? "-1" : q.peek()).append(" ");
            }
            System.out.println(sb.toString().trim());
        }
    }



}
