<%-- 
    Document   : show_view
    Created on : May 16, 2019, 4:47:46 PM
    Author     : w.c
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>${teste}</h1>
        <c:forEach items="${list}" var="nome">
            ${nome}<br>
        </c:forEach>

    </body>
</html>
