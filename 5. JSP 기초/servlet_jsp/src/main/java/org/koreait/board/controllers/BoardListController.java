package org.koreait.board.controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/board/list")
public class BoardListController extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("게시판 목록!");

        resp.setContentType("text/html; charset=UTF-8"); // 응답 데이터의 타입 설정

        PrintWriter out = resp.getWriter();
        out.write("<h1>게시판 목록!</h1>"); // h1 태그로 출력문구 추가
    }
}
