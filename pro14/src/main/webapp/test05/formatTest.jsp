<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*"%>
    
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>


<c:set var="money" value="1000000000"></c:set>
<c:set var="now" value="<%=new Date() %>"></c:set>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<fmt:formatNumber type="number" value="${money}"/><br>
	통화로 표현 시 : 
	<fmt:formatNumber type="currency" currencySymbol="" value = "${money}" /><br>
	퍼센트로 표현 시 : 
	<fmt:formatNumber type="percent" value="${money}" groupingUsed="false"/><br>

<hr>

	<fmt:formatDate value="${now}" dateStyle="full"/><br>
	<fmt:formatDate value="${now}" dateStyle="short"/><br>
	<fmt:formatDate value="${now}" type="time"/><br>

<hr>

	<c:set var="title1" value="hello world!"></c:set>
	<c:set var="title2" value="쇼핑몰 중심 JSP입니다!"></c:set>
	<c:set var="str1" value="중심"></c:set>

	${fn:length(title1)}<br>
	<br>
	${fn:toUpperCase(title1)}<br>
	${fn:toLowerCase(title1)}<br>
	<br>
	${fn:substring(title1,3,6)}<br>
	hi${fn:trim(title1)}nice<br>
	${fn:replace(title1," ","/")}<br>
	${fn:indexOf(title2,str1)}<br>
	${fn:contains(title2,str1)}<br>
	

</body>
</html>