package org.koreait.exam02;

public class ImplCalculator implements Calculator {
    @Override
    public long factorial(long num) {
        long result = 1L;
        // 반복문
        for (long i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }
}
