<%@ page import="java.util.*"%>
<%@ page language="java" contentType = "Text/html;charset = ISO-8859-1" pageEndcoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC"--//W3C//DTD HTML 4.01 Transitional//EN"
             "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import="java.util.Random,java.text.*"%>
<html>
<head>
<meta http-equiv="Content-Type" content="Text/html;chrset="ISO-8859-1">
<title>Insert title here</title>
<body>
<h2>Hello World!</h2>
<%
out.println("<h1> Now is"+new Date()+"</h1>");
%>
<%
java.util.Date date = new java.util.Date();
%>
<h1>
Now is 
<%=date.toString()%>
</h1>
<%
Random random = new Random();
// Return a randum number(0,1)
int randomint = random.nextlnt(3);
if(randomint == 0){
    %>
    <h1>Random value = <%=randomint%></h1>
    <%
}else if(randomint == 1){
    %>
    <h2> Random value =<%=randomint%></h2>
    %>
}else{
    %>
    <h3>random value =<%=randomint%></h3>
    <%
}
%>
<a href="<%=request.getResquestURi()%>"> Try Again</a>
 <%-- JSP using <%! %> --%>
<%! public int sum(int a, int b){
    return a+b;
}
<h1>
1+2 = <%=sum(1,1)%>
</h1>
</body>
</html>