<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<table border="2" width="300" align="center">
		<tr align="center">
			<td>${detailItem.itemId }</td>
			<td>${detailItem.itemName }</td>
			<td>${detailItem.price }</td>
			<td>${detailItem.description}</td>
			<td>${detailItem.pictureUrl}</td>
		</tr>
		<tr align="center">
			<td colspan="5"><a href="">�ֹ��ϱ�</a></td>
		</tr>
	</table>
</body>
</html>