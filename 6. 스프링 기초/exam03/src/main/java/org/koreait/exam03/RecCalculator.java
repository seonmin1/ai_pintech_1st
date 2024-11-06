package org.koreait.exam03;

public class RecCalculator implements Calculator {
    @Override
    public long factorial(long num) {
        if (num < 1) {
            return 1L;
        }
        // 재귀 방식
        return num * factorial(num - 1L);
    }
}
