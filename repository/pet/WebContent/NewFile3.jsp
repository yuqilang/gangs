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
<script src="JS/jquery-1.12.4.js"></script>

<script type="text/javascript">
$(function() {
	if(confirm("确认要删除吗")){
		location="chongwu?opr=shan&id="+${param.id};
		
	}else{   
		location="chongwu";
	}
})
</script>
</body>
</html>