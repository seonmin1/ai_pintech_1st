package org.koreait.exam02;

import org.springframework.aop.scope.ScopedProxyUtils;

import java.util.HashMap;
import java.util.Map;

public class CachedCalculator implements Calculator {

    private Map<Long, Long> cache = new HashMap<>();

    // 다형성
    private Calculator cal;

    // 여러가지 Calculator가 올 수 있도록 열어두는 방식
    public CachedCalculator(Calculator cal) {
        this.cal = cal;
    }

    @Override
    public long factorial(long num) {
        if(cache.containsKey(num)) { // 공통 기능
            System.out.println("캐시에 저장된 값 사용!");
            return cache.get(num);
        }
        long result = cal.factorial(num); // 핵심 기능 대신 수행
        cache.put(num, result); // 공통 기능
        System.out.println("캐시에 값을 저장!");
        return result;
    }
}
