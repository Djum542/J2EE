<%@ page pageEncoding = "utf-8" %>
<%@ page isELIgnored = "false"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <title>Spring MVC</title>
        <base href="${pageContext.servletContext.contextPath}/">
    </head>
    <body>
        <h2>Sinh vien Po</h2>
        <form action="save-" method="post">
            <div>Ho ten</div>
            <input type="text" name="name">
            <div>Diem trung binh</div>
            <input type="text" name="mark">
            <div>chuyen nganh</div>
            <label for="#">
                <input type="radio" name="major" value="APP">
                Ung dung phan mem
            </label>
            <label for="#">
                <input type="radio" name="majors" value="WEB">Thiet ke trang web
            </label>
            <hr>
            <button>Luu</button>
        </form>
        <!-- <form action="${pageContext.servletContext.contextPath}/update" method="post">
            <div>Ho va ten </div>
            <input value="${student.name}" name="name">
            <div>Diem trung binh</div>
            <input value="${student.mark}" name="mark">
            <div>Chuyen nganh</div>
            <label for="#">
            <input type="radio" value="APP" ${student.major} name="major"> ung dung phan mem
            </label>
            <label for="#">
                <input type="radio" value="WEB" name="major" ${student.major}> web thiet ke
            </label>
            <hr>
            <button> Cap nhat</button>
        </form> -->
    </body>
</html>