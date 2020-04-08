<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form method="post" action="chongwu?opr=xinzeng">
名字：<input type="text" name="name" required ><br>
<select name="xiala">
<option value="请选择">请选择</option>
<option value="狗">狗</option>
<option value="猫">猫</option>
<option value="老鼠">老鼠</option>
<option value="鸟">鸟</option>
</select>
<input type="radio" name="sex" value="雄" checked="checked">雄<input type="radio" name="sex" value="雌">雌<br>
<input type="text" name="date" required   pattern ="(([0-9]{3}[1-9]|[0-9]{2}[1-9][0-9]{1}|[0-9]{1}[1-9][0-9]{2}|[1-9][0-9]{3})-(((0[13578]|1[02])-(0[1-9]|[12][0-9]|3[01]))|((0[469]|11)-(0[1-9]|[12][0-9]|30))|(02-(0[1-9]|[1][0-9]|2[0-8]))))|((([0-9]{2})(0[48]|[2468][048]|[13579][26])|((0[48]|[2468][048]|[3579][26])00))-02-29)" >
<textarea rows="5" cols="60" name="miaoshu"></textarea>
<input type="submit" name="Submit" value="新增">
</form>
</body>
</html>