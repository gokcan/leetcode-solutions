package com.gokcan;

import java.util.HashMap;
import java.util.Map;

/**
 * @author gokcan on 8.02.2018.
 * @description: The question is like classic 2Sum but in this one we also need to handle duplicates 
 * and also return a pair [i, j] of the indices of the item weights, ordered such that i > j. 
 * Also you can use one for loop instead of two. (its runtime complexity is still O(2N) ==> O(N) with two for loops)
 * However, I choose to commit this solution as the way I solved it in 30min mock-interview.
 */
 
public class MergingPackages {
    static int[] getIndicesOfItemWeights(int[] arr, int limit) {
        if (arr.length < 2) return new int[]{};

        Map<Integer, Integer> hmap = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            hmap.put(arr[i], i); // [4,4,1] => [4,0] => [4,1] => [1,3]
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            int key = limit - arr[i]; // arr[1] = 4 , key = 7-4 =>> 3
            int min, max;

            if (hmap.containsKey(key) && hmap.get(key) != i) {
                max = hmap.get(key) > i ? hmap.get(key) : i;
                min = hmap.get(key) < i ? hmap.get(key) : i;

                return new int[]{max, min};
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] in = {4, 4};
        getIndicesOfItemWeights(in, 8);
    }
}
