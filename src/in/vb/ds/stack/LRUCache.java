package in.vb.ds.stack;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {

    private static Map<Integer, Integer> cache = new HashMap<>();
    private static int[] keys = null;
    private static int front=-1, rear=-1, maxSize;

    LRUCache(int cap) {
        maxSize = cap;
        keys = new int[cap];
    }

    // This method works in O(1)
    public static int get(int key) {
        // your code here
        return 0;
    }

    // This method works in O(1)
    public static void set(int key, int value) {
        if (keys.length == maxSize){
            if (keyAlreadyExists(key)){

            }
        }

    }

    private static void reArrangeForLru(int key){
        int n = keys.length;
        for (int i=0; i<n; i++){

        }
    }

    private static boolean keyAlreadyExists(int key){
        int n = keys.length;
        for (int i=0; i<n; i++){
            if (keys[i] == key){
                return true;
            }
        }
        return false;
    }
}
