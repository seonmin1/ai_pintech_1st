package org.koreait.member.controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

public class JoinController extends HttpServlet {

    /*@Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String key1 = req.getParameter("key1"); // 요청 데이터 조회
        String key2 = req.getParameter("key2"); // 요청 데이터 조회
        System.out.printf("key1=%s%n", key1);
        System.out.printf("key2=%s%n", key2);
    }*/

    /**
     * 접근제어자는 public으로 하는 것이 관례
     * (여러 곳에서 요청이 올 수 있기 때문에)
     */
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html; charset=UTF-8");

        PrintWriter out = resp.getWriter();
        out.write("<form method='POST' action='join'>"); // 작성 양식은 form 으로 시작, method 요청방식, action 제출처
        out.write("이메일: <input type='text' name='email'><br>");
        out.write("비밀번호: <input type='password' name='password'><br>");
        out.write("비밀번호 확인: <input type='password' name='confirmPassword'><br>");
        out.write("회원명: <input type='text' name='userName'><br>");
        out.write("취미: <label><input type='checkbox' name='hobby' value='취미1'>취미1</label>");
        out.write("<label><input type='checkbox' name='hobby' value='취미2'>취미2</label>");
        out.write("<label><input type='checkbox' name='hobby' value='취미3'>취미3</label>");
        out.write("<label><input type='checkbox' name='hobby' value='취미4'>취미4</label>");
        out.write("<label><input type='checkbox' name='hobby' value='취미5'>취미5</label><br>");
        out.write("<button type='submit'>가입하기</button>");
        out.write("</form>");
    }

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String email = req.getParameter("email");
        String password = req.getParameter("password");
        String confirmPassword = req.getParameter("confirmPassword");
        String userName = req.getParameter("userName");
        String hobby = req.getParameter("hobby"); // hobby로 요청한 값이 여러개더라도 처음 1개만 출력

        System.out.printf("email=%s, password=%s, confirmPassword=%s, userName=%s, hobby=%s%n",
                                email, password, confirmPassword, userName, hobby);

        String[] hobbies = req.getParameterValues("hobby"); // hpbby가 여러개일때 출력방법
        System.out.println(Arrays.toString(hobbies));
    }
}
