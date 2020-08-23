package com.vural.trendyol;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Q3 {

    public static void main(String[] args) {
        int[] A = {1, 5, 6, 3, 3, 5, 1, 8, 9, 6, 3, 1};
        System.out.println(new Q3().solution(A));
    }

    public int solution(int[] A) {

        HashMap<Integer, List<Integer>> map = new HashMap<>();


        for (int i = 0; i < A.length; i++) {
            int value = A[i];

            List<Integer> indexList = map.computeIfAbsent(value, key -> new ArrayList<>());
            indexList.add(i);
            /*if (map.containsKey(value)) {
                List<Integer> indexList = map.get(value);
                indexList.add(i);

            }
            else{
                ArrayList<Integer> indexList = new ArrayList<>();
                indexList.add(i);
                map.put(value,indexList);
            }*/
        }

        int sum = 0;
        for (List<Integer> indexList : map.values()) {
            if (indexList.size() > 1) {
                int size = indexList.size();
                int pairSizes = size * (size - 1) / 2;
                sum += pairSizes;
                if (sum >= 1000000000) {
                    return 1000000000;
                }
            }
        }

        return sum;
    }


}
