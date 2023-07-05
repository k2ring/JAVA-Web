<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"></c:set>
		<!DOCTYPE html>
		<html>

		<head>
			<meta charset="UTF-8">
			<title>Insert title here</title>

			<script src="http://code.jquery.com/jquery-latest.min.js"></script>


			<script>

				$(function () {

					$('#checkJson').click(function () {
						let _jsonInfo = '{"name":"박지성","age":"25","gender":"남자","nickname":"날센돌이"}';
						$.ajax({
							type: "post",
							async: "true",
							url: "${contextPath}/json",
							data: { jsonInfo: _jsonInfo },
							success : function (data, textStatus) {
								console.log(data);
							},
							error: function (data, textStatus) {
								alert("에러");
							},
							complete: function (data, textStatus) {
								
							},


						});

					});

				});


			</script>




		</head>





		<body>


			<a id="checkJson" style="cursor:pointer">전송</a><br><br>
			<div id="output"></div>

		</body>

		</html>