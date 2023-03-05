<%@ page language = "java" contextType = "text/html; charset=UTF-8" isELIgnored="false"%>
<%@ page url = "http//java.sum.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML PUBLIC ".//w3c//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="contextType" content="text/html; charset=UTF-8" >
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Product List</title>
    <style>
    .a{
        width:160px; height: 200px; border: 1px solid black;
        padding: 5px; margin: 10px; 
        float: left; text-align: center;
    }
    .hinh{
        width: 80px; height: 100px; 
    }
</style>
</head>
<body>
    <p>
        <a href="/WEB-INF/views/cartview.jsp">View cart</a>
    </p>
    <c:foreach items = "${list}" var = "sp">
        <div class="a">
            <form action="com/gdu/k14dcpm01/CartController" method="post" name="modeldetail">
                $(sp.model) <br>
                <img src="${sp.imgage}" alt="hinh">
                Price: ${sp.price}
                <br>
                <input type="text" size="2" value="1" name="quantity">
                <br>
                <input type="text" name="model" value="${sp.cart_id}">
                <input type="text" name="productid" value="${sp.product_id}">
                <input type="text" name="name" value="${sp.product_name}">
                <input type="text" name="image" value="${sp.product_image}">
                <input type="text" name="price" value="${sp.product_price}">
                <input type="text" name="decription" value="${sp.product_description}">
                <input type="submit" name="addtocart" value="Add to cart">
            </form>
        </div>
    </c:foreach>
</body>
</html>