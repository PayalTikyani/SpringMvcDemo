<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
  <title>Customer Confirmation Form</title>
</head>
<body>
  Customer Confirmed : ${customer.firstName} ${customer.lastName}
  <br><br>
  FreePasses : ${customer.freePasses}
    <br><br>
  Postal Code : ${customer.postalCode}
</body>
</html>