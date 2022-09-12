<%--
  Created by IntelliJ IDEA.
  User: Natnicha
  Date: 8/29/2022
  Time: 10:34 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Favorite Subject</title>
</head>
<body>
<h3>Your Favorite Subject</h3>
<hr>
<form action="TestRequestParameter" method="post">
    <!--When we call path of client must not have "/" -->
    <!-- บังคับกรอก ใส่ required -->
    Your name : <input type="text" name="name"/> <br>
    Your grade : <input type="number" name="grade"/> <br>
    Favorite Subjects : <br>
    <input type="checkbox" name="fav_subjects" value="INT100"/>INT100 - IT Fundamentals<br>
    <input type="checkbox" name="fav_subjects" value="INT102"/>INT102 - Web Technology<br>
    <input type="checkbox" name="fav_subjects" value="INT114"/>INT114 - Discrete Mathematics<br>
    <input type="checkbox" name="fav_subjects" value="INT101"/>INT101 - Physical Education<br>
    <input type="submit">
</form>
<hr/>
Favorite Subject for ${param.name} Grade: ${param.grade}:: <br>
<c:forEach items="${paramValues.fav_subjects}" var="paramValue">
   &nbsp; &nbsp; &nbsp; &nbsp; ${paramValue} <br>
</c:forEach>
<br> <hr>
<a href="index.jsp">[ Home ]</a>
</body>
</html>
<!--JSP คือไฟล์ที่ทำงานระหว่าง java และ html ใช้ $_{} เพื่อบอกว่าเปนจาวา -->