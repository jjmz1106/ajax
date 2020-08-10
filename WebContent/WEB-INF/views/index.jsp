<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	ajax index화면<br>
<c:if test="${sessionScope.id == null}">
<button>로그인</button>
</c:if>
<c:if test="${sessionScope.id != null}">
<button>로그아웃</button>
</c:if>
</body>
</html>