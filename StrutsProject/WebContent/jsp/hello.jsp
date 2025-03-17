<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Struts2 테스트 페이지</title>
</head>
<body>
    <h1>Struts2 테스트 페이지</h1>
    <p>액션에서 전달된 메시지: <s:property value="message"/></p>
    <form action="hello.action">
        <input type="submit" value="Hello Action 실행"/>
    </form>
</body>
</html>