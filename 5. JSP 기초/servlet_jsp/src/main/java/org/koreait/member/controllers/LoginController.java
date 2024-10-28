package org.koreait.member.controllers;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * HttpServlet 클래스 상속받고 doGet 메서드 재정의
 * 이때 super가 자동으로 나타나는데 삭제해줘야 함.
 *
 * 요청 헤더, 바디 정보를 바탕으로 HttpServletRequest, HttpServletResponse 객체 생성
 * -> 요청이 유입될때마다 매번 다른 객체 생성 (싱글톤 패턴) -> 요청은 모두 다르기 때문
 */

public class LoginController extends HttpServlet {
    @Override
    public void init(ServletConfig config) throws ServletException {
        /**
         * ServletConfig의 주요 메서드 : 설정값 조회 메서드
         * String getInitParameter(String name);
         */
        String key1 = config.getInitParameter("key1"); // parameter의 key값으로 value값을 찾겠다
        String key2 = config.getInitParameter("key2");
        System.out.printf("key1 = %s%n", key1);
        System.out.printf("key2 = %s%n", key2);
    }

    /*public void init() throws ServletException {
        *//**
         * 설정값을 최초 한번 조회하고 서블릿 객체 내에서 유지
         *//*
        System.out.println("서블릿 객체가 생성되면 최초 1번 실행");
    }*/

    @Override
    public void destroy() {
        /**
         * 공통 자원 해제, 로그 기록
         */
        System.out.println("서블릿 객체가 소멸되기 직전에 1번만 실행");
    }


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doGet()!");

        /**
         * 응답 헤더의 ContentType을 text/html로 지정 (지정하지 않으면 서버가 알아듣지 못함)
         */
        /*resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");*/
        /**
         * 위 두개의 메서드 한번에 작성 (보통 아래와 같이 사용함)
         */
        resp.setContentType("text/html;charset=UTF-8");

        PrintWriter out = resp.getWriter();
        out.write("<h1>로그인</h1>");
    }
}
