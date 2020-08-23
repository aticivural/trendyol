package com.vural.trendyol;

class Q2 {

    public static void main(String[] args) {
        Q2 solution = new Q2();
        Integer fibRes = solution.solution(54);
        System.out.println(fibRes);

    }

    public int solution(int N) {


        Integer fibResult = fibonacci(N);
        String resultStr = fibResult.toString();
        int length = resultStr.length();

        if (length <= 6) {
            return fibResult;
        } else {
            String result = resultStr.substring(length - 6);
            return Integer.valueOf(result);
        }

    }


    public static int fibonacci(int n) {
        if ((n == 0) || (n == 1)) {
            return n;
        }
        return fibonacciAux(0, 1, n);
    }

    private static int fibonacciAux(int a, int b, int count) {
        if (count <= 0) {
            return a;
        }
        return fibonacciAux(b, a + b, count - 1);
    }
}



