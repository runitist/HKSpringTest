<%@page import="kr.ex.lee.VO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	VO vo = (VO) request.getAttribute("vo");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>뷰</title>
</head>
<body>
	<table>
		<tr>
			<th>게시 번호</th>
			<th>글 제목</th>
			<th>글 내용</th>
		</tr>
		<tr>
			<td><%=vo.getBid()%></td>
			<td><%=vo.getBtitle()%></td>
			<td><%=vo.getBcontent()%></td>
		</tr>
	</table>
</body>
</html>