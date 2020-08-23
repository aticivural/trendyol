package com.vural.trendyol;

public class Q1 {

    public static void main(String[] args) {

        Q1 solution = new Q1();

        solution.solution("harder", "rather");
    }

    public int solution(String A, String B) {
        int[] array = new int[26];

        for (int i = 0; i < A.length(); i++) {
            int index = (int) A.charAt(i) - 97;
            array[index]++;
        }

        for (int i = 0; i < B.length(); i++) {
            int index = (int) B.charAt(i) - 97;

            int value = array[index];
            if (value == 0) {
                array[index]++;
            } else {
                array[index]--;
            }
        }

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;

    }
}