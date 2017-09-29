<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>列表</title>
</head>
<body>

	商品列表：
	<table width="100%" border=1>
		<tr>
		    <td>id</td>
		    <td>名称</td>
		    <td>性别</td>
		    <td>年龄</td>
		    <td>操作</td>
		</tr>
		<c:forEach items="${itemsList}" var="item">
		<tr>
		    <td><input type="text" value="${item.testID}" /></td>
		    <td><input type="text" value="${item.testName}" /></td>
		    <td><input type="text" value="${item.testSex}" /></td>
		    <td><input type="text" value="${item.testAge}" /></td>
		    <td>修改</td>
		
		</tr>
		</c:forEach>
	</table>
</body>

</html>