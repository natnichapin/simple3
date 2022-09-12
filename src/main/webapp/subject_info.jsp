<%--
  Created by IntelliJ IDEA.
  User: Natnicha
  Date: 8/22/2022
  Time: 11:41 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Subject Information</title>
</head>
<body>
    <h3>Your new Subject has been Added </h3>
    <hr/>
<h4>Subject Information :: </h4>
    <p> Subject ID: ${s.id}     <!-- it will call getId method automatically --></p>
    <p> Subject Title: ${s.title}</p>
    <p> Subject Credit: ${s.credit}</p>
<hr/>
<a href="index.jsp" > [ Back ] </a>
</body>
</html>

<!-- html that can take java for convert code by used EL (we  haven't learned )-->