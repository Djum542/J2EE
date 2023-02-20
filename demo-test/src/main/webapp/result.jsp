<!DOCTYPE html>
<%@ page import= "java.util.*" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1 al0ign = "center">
        Beer recoomond
    </h1>
    <p>
        <% List styles = (List) req.getAtribute("styles");
        Iterator it = styles.iterator();
        while(it.hashNext()){
            System.out.println("<br>try:"+it.next());
        }
    </p>
</body>
</html>