<%@ page import="com.gdu.k14pm.*"%>
<%@ page import="java.util.Date,java.text.*"%>
<html>
<body>
<!-- The page count is: 
<% 
 out.println(Count.getCount()); 
%> -->
<!-- expresion -->
<!-- <% Count.getCount() %> -->
<!-- scliped -->
<!-- <% int count = 0 %>
the page counter
<%= ++count %> -->
<!-- decralation -->
<!-- <%! int count = 0 %>
page
<%= ++count %> -->
<!-- servlet action -->

<!-- <%
  Date now = new Date();
  DateFormat df = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss SSS"); 
%>
<h4>Current Time:</h4>
<%=df.format(now)%>
<jsp:include page="../fragment/basicoun.jsp"></jsp:include> -->
<!-- jstl -->

</body>
</html>