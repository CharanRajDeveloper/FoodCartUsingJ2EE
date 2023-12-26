<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
table {
	width: -webkit-fill-available;
	border-color: green;
}

th, td {
	padding: 15px;
}
</style>
<meta charset="ISO-8859-1">
<title>Food Court Details</title>
</head>
<body style="text-align: center;">
	<h1>Menu</h1>
	<table border="1" align="center">
		<tr>
			<th>Code</th>
			<th>Food Item</th>
			<th>Price</th>
		</tr>
		<c:forEach var="foodItems" items="${foodItems}">
			<tr>
				<td><input type="hidden" value=${foodItems.id}>${foodItems.id}</td>
				<td><input type="hidden" value=${foodItems.item
					} name="itemName_${count}" id="itemName_${count}">${foodItems.item}</a></td>
				<td><input type="hidden" value=${foodItems.price}>${foodItems.price}</td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>