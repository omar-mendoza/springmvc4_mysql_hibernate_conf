<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<meta name="viewport" content="width=device-width, initial-scale=1">

<title>Hola Mundo</title>

<script type="text/javascript" src="<c:url value="/resources/js/lib/jquery-3.2.1.min.js" />"></script>
<script type="text/javascript" src="<c:url value="/resources/js/ui/test.js" />"></script>

<link href="<c:url value="/resources/css/bootstrap-3.3.7/css/bootstrap.min.css" />" rel="stylesheet" />


</head>
<body>

<jsp:include page="main.jsp"></jsp:include>

<div class="container">
<button id="getData" class="btn btn-primary">Click</button>
</div>


</body>
</html>