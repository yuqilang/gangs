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
<form method="post" action="chongwu?opr=xiugai&id=${param.id }">
名字：<input type="text" name="name"  value="${param.name }" required><br>
<select name="xiala">
<option value="狗"<c:if test="${param.breed=='狗' }">selected</c:if>>狗</option>
<option value="猫"<c:if test="${param.breed=='猫'	 }">selected</c:if>>猫</option>
<option value="老鼠" <c:if test="${param.breed=='老鼠' }">selected</c:if>   >老鼠</option>
<option value="鸟"<c:if test="${param.breed=='鸟' }">selected</c:if>>鸟</option>
</select>
<input type="radio" name="sex" value="雄"  <c:if test="${param.sex=='雄' }">  checked </c:if> >雄<input type="radio" name="sex" value="雌" <c:if test="${param.sex=='雌' }">  checked </c:if> >雌<br>
<input type="text" name="date" value="${param.birthday }" required  pattern ="(([0-9]{3}[1-9]|[0-9]{2}[1-9][0-9]{1}|[0-9]{1}[1-9][0-9]{2}|[1-9][0-9]{3})-(((0[13578]|1[02])-(0[1-9]|[12][0-9]|3[01]))|((0[469]|11)-(0[1-9]|[12][0-9]|30))|(02-(0[1-9]|[1][0-9]|2[0-8]))))|((([0-9]{2})(0[48]|[2468][048]|[13579][26])|((0[48]|[2468][048]|[3579][26])00))-02-29)">
<textarea rows="5" cols="60" name="miaoshu"></textarea>
<input type="submit" name="Submit" value="保存">
</form>
</body>
</html>