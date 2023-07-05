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
						
						$.ajax({
							type: "post",
							async: "true",
							url: "${contextPath}/json",
							
							success : function (data, textStatus) {
								console.log("자료:",data);
								console.log("타입:",typeof(data));
								var jsonData=JSON.parse(data);
								console.log("자료:",jsonData);
								console.log("타입:",typeof(jsonData));
								
								
								var memberInfo ="회원 정보<br>";
								
								 memberInfo += "=======<br>";
								
								/*  for(var i in jsonData.member){
									 memberInfo += "이름: " + jsonData.member[i].name+"<br>";
									   memberInfo += "나이: " + jsonData.member[i].age+"<br>";
									   memberInfo += "성별: " + jsonData.member[i].gender+"<br>";
									   memberInfo += "별명: " + jsonData.member[i].nickname+"<br><br><br>";
								 } */
								 
								 
								 for(let item of jsonData.member){
									 memberInfo += "이름2: " + item.name+"<br>";
									   memberInfo += "나이2: " + item.age+"<br>";
									   memberInfo += "성별2: " + item.gender+"<br>";
									   memberInfo += "별명2: " + item.nickname+"<br><br><br>";
								 }
								
								 $("#output").html(memberInfo);
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


			<a id="checkJson" style="cursor:pointer">전송2</a><br><br>
			<div id="output"></div>

		</body>

		</html>