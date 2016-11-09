<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.Statement" %>
<%--
  Created by IntelliJ IDEA.
  User: saikumar
  Date: 3/11/16
  Time: 2:35 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Employee Details</title>
</head>
<body>
<%
    String name = request.getParameter("name");
%>
<p>The Name Entered is <b><%= name %>
</b></p>
<%
    String dbString = "jdbc:mysql://localhost:3306/lab12db?user=root&password=mysql&useSSL=false";
    try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection(dbString);
        Statement statement = connection.createStatement();
        ResultSet resultSet;
        resultSet = statement.executeQuery("SELECT * FROM employees WHERE name='" + name+"'");
%>
<%
    if (!resultSet.next()) {
%>
<h4>Details Not Found.</h4>
<%
} else {
%>
<h2>ID : <%=resultSet.getInt("id")%>
</h2>
<h3>Name : <%=resultSet.getString("name")%>
</h3>
<h3>Salary : <%=resultSet.getInt("salary")%>
</h3>
<%
        }
        connection.close();
    } catch (Exception e) {
        System.out.println(e);
    }
%>
<p>Have a Good Day :-)</p>
</body>
</html>
