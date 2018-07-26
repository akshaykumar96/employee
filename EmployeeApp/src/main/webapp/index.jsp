<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home</title>
</head>
<link rel="stylesheet" href="Bootstrap/css/bootstrap.min.css"/>
<script src="Bootstrap/js/bootstrap.min.js"></script>
<script src="Bootstrap/jquery-3.3.1.js"></script>

<body>
<%@ include file ="Header.jsp" %>
<form action="departments" >
  <div class="form-group">
    <label for="loc">Location id:</label>
    <input type="number" class="form-control" id="loc" name="loc">
  </div>
  <button type="submit" class="btn btn-default">Get Location Details</button>
</form>
</body>
</html>