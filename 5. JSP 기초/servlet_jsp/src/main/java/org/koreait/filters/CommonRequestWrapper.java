package org.koreait.filters;

import jakarta.servlet.ServletRequest;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletRequestWrapper;

/**
 * 상위클래스에 생성자가 정의되어있지 않으므로
 * 해당 클래스에 super 사용하여 정의해줘야 오류 발생하지 않음
 */
public class CommonRequestWrapper extends HttpServletRequestWrapper {
    public CommonRequestWrapper(ServletRequest request) {
        super((HttpServletRequest) request);

        // 요청 시 공통 코드 ...

        System.out.println("요청 공통 코드 처리...");
    }
/*
    @Override
    public String getParameter(String name) {

        String value = super.getParameter(name);

        if(value != null && value.isBlank()) {
            value = String.format("**%s**", value);
        }

        return value;
    }*/
}

