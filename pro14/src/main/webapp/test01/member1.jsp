<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<jsp:useBean id="member" class="sec01.ex01.MemberBean" />
<jsp:setProperty property="*" name="member" />

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 정보 출력창</title>
</head>
<body>
	<table border="1" align="center">
		<tr align="center" bgcolor="#99ccff">
			<td width="20%"><b>아이디</b></td>
			<td width="20%"><b>비밀번호</b></td>
			<td width="20%"><b>이름</b></td>
			<td width="20%"><b>이메일</b></td>
		</tr>

		<%-- 
		<tr align=center>
      		<td>${param.id } </td>
      		<td>${param.pwd } </td>
      		<td>${param.name } </td>
      		<td>${param.email }</td>
  		</tr>
  		 --%>

		<tr align=center>
			<td>${member.id }</td>
			<td>${member.pwd }</td>
			<td>${member.name }</td>
			<td>${member.email }</td>
		</tr>


	</table>

	${param}
	<hr>
	${member}

</body>
</html>
