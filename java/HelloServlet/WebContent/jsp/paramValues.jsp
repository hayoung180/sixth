<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<div>
		<ul>
			<c:forEach items="${paramValues.animal}" var="eachAnimal">
				<li>${eachAnimal}</li>
			</c:forEach>
		</ul>
	</div>
</body>
</html>