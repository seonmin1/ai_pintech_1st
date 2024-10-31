<%@ page contentType='text/html; charset=UTF-8' %>
<%
    String key1 = (String)session.getAttribute("key1"); // 세션 조회 - 반환값이 Object 이므로 String 으로 형변환
    String key2 = (String)session.getAttribute("key2");
%>
key1=<%=key1%>, key2=<%=key2%>