<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="style.css" />
<title>Insert title here</title>
</head>
<body>
	<div class="header">
		<label class="login">login</label>
		<%@ page import="java.util.*,java.text.SimpleDateFormat"%>
		<div class="date">
   <% Calendar calender = Calendar.getInstance();
      SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
      out.println(sdf.format(calender.getTime()));
      %>
		</div>
	</div>

</body>
</html>