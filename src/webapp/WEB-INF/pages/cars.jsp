<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page session="false"%>

<!DOCTYPE html>

<html>
<head>
    <meta charset="UTF-8">
    <title><spring:message code="label.title" /></title>
</head>
<body>

<div style="text-align: right;padding:5px;margin:5px 0px;background:#ccc;">
    <a href="${pageContext.request.contextPath}/cars?lang=en">Login (English)</a>
    &nbsp;&nbsp;
    <a href="${pageContext.request.contextPath}/cars?lang=ru">Login (Russia)</a>
    &nbsp;&nbsp;
</div>
<h1><spring:message code="label.title" /></h1>
<table border="1" cellspacing="0" cellpadding="2">
    <c:forEach items="${cars}" var="car">
        <tr>
            <td>
                <input type="text" value="${car.name}">
            </td>
            <td>
                <input type="number" value="${car.series}">
            </td>
            <td>
                <input type="text" value="${car.status}">
            </td>
        </tr>
    </c:forEach>
</table>
Current Locale : ${pageContext.response.locale}
</body>
</html>