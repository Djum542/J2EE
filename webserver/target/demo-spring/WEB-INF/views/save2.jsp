<%@ page pageEncoding = "utf-8"%>
<%@ page isELIgnored = "false"%>
<html>
    <head>
        <meta charset="utf-8">
        <title>Spring MVC</title>
        <base href="${pageContext.servletContext.contextPath}/">
    </head>
    <body>
        <h3>Thongtin sinh vien</h3>
        <ul>
            <li>Ho va ten: ${student.name}</li>
            <li>Diem TB: ${student.mark}</li>
            <li>Chuyen nghanh:${student.major}</li>
        </ul>
    </body>
</html>