<%@page import="kr.ex.lee.VO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	List<VO> lv = (List<VO>) request.getAttribute("lv");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>리스트</title>
</head>
<body>
	<table>
		<tr>
			<th>게시번호</th>
			<th>게시글</th>
		</tr>
		<%
			for (int i = 0; i < lv.size(); i++) {
		%>
		<tr>
			<td><%=lv.get(i).getBid()%></td>
			<td><a href="/lee/view.do?id=<%=i%>"><%=lv.get(i).getBtitle()%></a></td>
		</tr>
		<%
			}
		%>
	</table>

	<button onclick="location.href='write.do'">글쓰기</button>
</body>
</html>