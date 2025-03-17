<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib uri="/struts-tags" prefix="s" %>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <title>게시판 목록</title>
</head>
<body>
    <h1>게시판 목록</h1>
    <table border="1">
        <tr>
            <th>번호</th>
            <th>제목</th>
            <th>상세보기</th>
            <th>수정</th>
            <th>삭제</th>
        </tr>
        <s:if test="empty boards">
            <tr>
                <td colspan="5">게시글이 없습니다.</td>
            </tr>
        </s:if>
        <s:iterator value="boards">
            <tr>
                <td><s:property value="id"/></td>
                <td><s:property value="title"/></td>
                <td><a href="<s:url action='view'><s:param name='id' value='%{id}' /></s:url>">상세보기</a></td>
                <td><a href="<s:url action='edit'><s:param name='id' value='%{id}' /></s:url>">수정</a></td>
                <td><a href="<s:url action='delete'><s:param name='id' value='%{id}' /></s:url>">삭제</a></td>
            </tr>
        </s:iterator>
    </table>
    <a href="<s:url action='write'/>">글쓰기</a>
</body>
</html>