<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글쓰기</title>
</head>
<body>
	<form action="writeC.do" method="post">
		<label for="title">글 제목</label> <input type="text" id="title"
			name="title" autocomplete="off" required="required" /> <br /> <label
			for="content">글 본문</label>
		<textarea name="content" id="content" cols="30" rows="10"></textarea>
		<br /> <input type="submit" value="글 작성" />
	</form>
</body>
</html>