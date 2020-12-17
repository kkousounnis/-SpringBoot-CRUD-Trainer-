<%-- 
    Document   : newstudent
    Created on : 07-May-2020, 16:45:23
    Author     : mac
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update Trainer</title>
        <link href="<c:url value="/resources/bootstrap.min.css" />" rel="stylesheet">
    </head>
    <body>
        <div class="container">
            <%@ include file="../mymenu.jsp" %> 
            <h1>Update a Trainer</h1>

            <%
                String updateUrlFINAL = request.getContextPath() + "/" + request.getAttribute("updateurl");
                session.setAttribute("updateUrlFINAL", updateUrlFINAL);
            %>
            <form:form method="POST" action="${updateUrlFINAL}" modelAttribute="trainer">
                <form:input type="hidden" path="id" id="id"/>
                First Name: <form:input path="firstName"  /><br />
                Last Name: <form:input path="lastName" /><br />
                Subject: <form:input path="subject" /><br />             
                <input type="submit" value="Update">
            </form:form>
            <div id="msg">${message}</div>
            <div id="list"><a href="<c:url value='/${listurl}' />">Back to the list of trainers</a></div>
        </div>
    </body>
</html>
