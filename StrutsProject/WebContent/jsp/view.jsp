<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib uri="/struts-tags" prefix="s" %>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <title>상세보기</title>
</head>
<body>
    <h1>제목 :<s:property value="board.title"/></h1>
    <p>내용 : <s:property value="board.content"/></p>
    
    <!-- 홈으로 돌아가는 버튼 추가 -->
    <a href="<s:url action='list'/>">
        <button>목록으로 돌아가기</button>
    </a>
</body>
</html>