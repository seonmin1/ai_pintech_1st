package org.koreait.global.validators;

/**
 * 인터페이스에 공통적인 틀 정의
 * 공통적으로 정의해야하므로 어떤 자료형이 올지 모름 - 지네릭 클래스 사용 (추상화)
 */
public interface Validator<T> {
    void check(T form);
}
