<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<th>ID</th>
			<th>姓名</th>
			<th>年龄</th>
			<th>性别</th>
		</tr>
		<c:forEach items="${list }" var="s">
			<tr>
				<th>${s.id }</th>
				<th>${s.name }</th>
				<th>${s.age }</th>
				<th>${s.sex }</th>
			</tr>
		</c:forEach>
	</table>
</body>
</html>