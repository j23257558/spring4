<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>helloResult.jsp페이지 입니다.</title>
</head>
<body>
<%
	List<String> nameList = 
		(List<String>)request.getAttribute("nameList");
	out.print("한사람 - 이성계 :"+nameList.size());
%>
</body>
</html>