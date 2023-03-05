<%@ page pageEncoding = "utf-8"%>
<%@ page isELIgnored = "false"%>
<html>
    <head>
        <meta charset="utf-8">
        <title>Spring MVC</title>
        <base href="${pageContext.servletContext.contextPath}/">
    </head>
    <body>
        <jsp:include page="_menu.jsp"></jsp:include>
        <h3>Thong tin sinh vien</h3>
        <ul>
        <li> Ho va ten${name}</li>
        <li> Diem TB:${mark}</li>
        <li> Chuyen nganh:${major}</li>
    </ul>
    </body>
</html>