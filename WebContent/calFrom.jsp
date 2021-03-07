<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<link rel="stylesheet" href="style.css">
<head>
<meta charset="UTF-8">
<title>Calculator</title>
</head>
<body>

<div class="header">
	<h3>Simple Calculator</h3>
</div>

<div class="content">
<form action ="Result" method="GET">
	<input type="number" name="left">
	<select name="op">
		<option value="add"> + </option>
		<option value="subtract"> - </option>
		<option value="multiply"> * </option>
		<option value="divide"> / </option>
	</select>
	<input type = "number" name="right">
	<input type="submit" id="btn" value="calculate">
</form>
</div>
</body>
</html>