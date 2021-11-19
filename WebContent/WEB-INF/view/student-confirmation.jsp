<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
  <title>Student Confirmation Form</title>
</head>
<body>
  Student Confirmed : ${student.firstName} ${student.lastName}
  <br><br>
  Country : ${student.country}
  <br><br>
  ${student.firstName} 's Favorite Language is : ${student.favoriteLanguage}
  <br><br>
  Operating Systems:
  <ul>
    <c:forEach var="temp" items="${student.operatingSystems}">   
    <li>${temp}</li>
    </c:forEach>
  </ul>
</body>
</html>