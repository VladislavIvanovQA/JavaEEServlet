<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<% List products = (List) session.getAttribute("products");%>
<body>
<div>

    <c:forEach items="${products}" var="product">
        <ul>
            <li>Product ID: <c:out value="${product.id}"/></li>
            <li>Product TITLE: <c:out value="${product.title}"/></li>
            <li>Product COST: <c:out value="${product.cost}"/></li>
        </ul>
    </c:forEach>
</div>
</body>
</html>
