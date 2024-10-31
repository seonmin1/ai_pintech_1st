<%@ page contentType="text/html; charset=UTF-8" %>
<%
    Cookie cookie = new Cookie("key4", "value4");
    cookie.setMaxAge(60 * 60 * 24 * 7); // 7일을 초 단위로 계산 (곱하기로 나눠서 적는 것이 관례)
    cookie.setHttpOnly(true); // 서버쪽에서만 조회가능하도록 한정
    response.addCookie(cookie);
%>