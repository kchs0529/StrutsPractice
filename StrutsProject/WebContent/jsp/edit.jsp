<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib uri="/struts-tags" prefix="s" %>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <title>수정하기</title>
</head>
<body>
    <h1>수정하기</h1>
    <s:form action="update" method="post">
        <input type="hidden" name="id" value="<s:property value='board.id'/>" />
        <label>제목: </label><s:textfield name="title" value="%{board.title}"/>
        <br/>
        <label>내용: </label><s:textarea name="content" value="%{board.content}"/>
        <br/>
        <s:submit value="수정" />
    </s:form>
</body>
</html>