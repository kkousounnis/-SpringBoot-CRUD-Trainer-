<%-- 
    Document   : studentlist
    Created on : 07-May-2020, 13:37:33
    Author     : mac
--%>

<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Trainer's List</title>
        <link href="<c:url value="/resources/bootstrap.min.css" />" rel="stylesheet">
    </head>
    <body>
        <div class="container">
            <%@ include file="../mymenu.jsp" %> 
            <h1>Trainer's List</h1>
            <table class="table table-hover">
                <tr>
                    <td>Update</td><td>FIRST NAME</td><td>LAST NAME</td><td>Subject</td><td>Delete</td>
                </tr>
                <c:forEach items="${trainers}" var="trainer">
                    <tr>
                        <!-- edit: http://localhost:8081/edit/{id} -->
                        
                        <td><a href=" <c:url value='${editurl}/${trainer.id}' />">update</a></td>
                        <td>${trainer.firstName}</td>
                        <td>${trainer.lastName}</td>
                        <td>${trainer.subject}</td>
                        <td><a href="<c:url value='${deleteurl}/${trainer.id}' />">delete</a></td>
                    </tr>
                </c:forEach>
            </table>
            <div id="msg">${msg}</div>
        </div>
    </body>
</html>
