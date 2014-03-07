<%-- 
    Document   : ChoiseRound1
    Created on : 04-03-2014, 12:48:21
    Author     : Thomas
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Round 1 selection</title>
    </head>
    <body>
        <h1 style="color: red">First round</h1>
        <div id="subjects">
            <h2>Choose 2 first and 2 second priorities</h2>
    <c:forEach items="${subjects}" var="subject">
        <p>Subject name: ${subject.name}. Subject id: ${subject.id}</p>
    </c:forEach>
        </br><p>Write the subjects id you wish in the boxes below:</p>
        <form name="selectSubjects" method="post" action="FrontController">
            <input type="hidden" name="command" value="makeChoises_command">
            <p style="display: inline">First priority</p>
            <input type="text" name="firstpri1">
            <p style="display: inline">First priority</p>
            <input type="text" name="firstpri2">
            <p style="display: inline">Second priority</p>
            <input type="text" name="secondpri1">
            <p style="display: inline">Second priority</p>
            <input type="text" name="secondpri2"></br>
            <input type="submit" name="makeChoises" value="Make choises">
        </form>
        </div>
    </body>
</html>
