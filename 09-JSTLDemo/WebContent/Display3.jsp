<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border='1'>
<c:forEach begin="1" end="10" step="1" var="x"> 
<tr>
<td><c:out value="${x}"></c:out></td>
<td>*</td>
<td>5</td>
<td>=</td>
<td><c:out value="${x*5}"/></td>
</tr>

</c:forEach>


</table>
</body>
</html>