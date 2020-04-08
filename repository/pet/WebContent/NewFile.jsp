<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>


<form action="chongwu?opr=xuanze" method="post" >
<select name="xiala">
<option value="请选择">请选择</option>
<option value="狗"<c:if test="${requestScope.zhong=='狗' }">selected</c:if>  >狗</option>
<option value="猫"<c:if test="${requestScope.zhong=='猫' }">selected</c:if> >猫</option>
<option value="老鼠"<c:if test="${requestScope.zhong=='老鼠' }">selected</c:if> >老鼠</option>
<option value="鸟"<c:if test="${requestScope.zhong=='鸟' }">selected</c:if> >鸟</option>
</select>
<input type="submit" name="Submit" value="查询">
</form>
<a href="NewFile1.jsp">新增宠物</a>
<table border="1">
<c:forEach var="n" items="${requestScope.list }">

<tr>
<td>${n.petName }</td>
<td>${n.petBreed }</td>
<td>${n.petSex }</td>
<td>${n.birthday }</td>
<td><a href="NewFile2.jsp?id=${n.petId }&name=${n.petName }&breed=${n.petBreed}&sex=${n.petSex}&birthday=${n.birthday}&txt=${n.desc}">修改</a></td>
<td><a href="NewFile3.jsp?id=${n.petId }">删除</a></td>
</tr>
</c:forEach>



</table>
</body>
</html>