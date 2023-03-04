<%@page content="text/html" pageEncoding="UTF-8"%>
<%@page uri="hhtp://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page uri="hhtp://java.sun.com/jsp/jstl/fmt" prefix="f"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Manager buiseness</title>
</head>
<body>
    <c:set var="mangongu" value="${pagram.radio_manfonfu}"/>
    <c:if test="$(not empty mangongu)">
        <f:setlocale value="${mangongu}" scope= "session"/>
    </c:if>
    <br>
    <f:setBundle basename="resource" scope = "session"/>
    <form action="index.jsp" method="post">
        <br>
        <f:message key="vn"
    </form>
</body>
</html>