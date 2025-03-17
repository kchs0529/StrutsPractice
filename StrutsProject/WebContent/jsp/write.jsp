<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib uri="/struts-tags" prefix="s" %>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <title>글쓰기</title>
</head>
<body>
    <h1>글쓰기</h1>
    <s:form action="save" method="post">
        <label>제목: </label><s:textfield name="title" />
        <br/>
        <label>내용: </label><s:textarea name="content" />
        <br/>
        <s:submit value="저장" />
    </s:form>
</body>
</html>