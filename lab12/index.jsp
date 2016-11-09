<%--
  Created by IntelliJ IDEA.
  User: saikumar
  Date: 3/11/16
  Time: 1:49 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Employees</title>
</head>
<body>
<h1>Welcome Employees</h1>
<p>This is the page to check your details.</p>
<p>Please Enter Your Name in the input box</p>
<%@ page import="java.io.BufferedReader" %>
<%@ page import="java.io.FileReader" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.PreparedStatement" %>
<%@ page import="java.sql.Statement" %>

<%
    String dbString = "jdbc:mysql://localhost:3306/lab12db?user=root&password=mysql&useSSL=false";
    try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection(dbString);
        Statement statement = connection.createStatement();
        String jspPath=session.getServletContext().getRealPath("/");
        String filePath=jspPath+"/Employee";
        FileReader fr = new FileReader(filePath);
        BufferedReader br = new BufferedReader(fr);
        statement.executeUpdate("CREATE TABLE employees(id INTEGER,name TEXT,salary INTEGER)");
        PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO employees values(?,?,?)");
        String line = "";
        String[] lineArr;
        while ((line = br.readLine()) != null) {
            lineArr = line.split(" ");
            preparedStatement.setInt(1, Integer.valueOf(lineArr[0]));
            preparedStatement.setString(2, lineArr[1]);
            preparedStatement.setInt(3, Integer.valueOf(lineArr[2]));
            preparedStatement.executeUpdate();
        }
%>
<form action="employee.jsp">
    Name:<input type="text" name="name">
    <input type="submit" value="submit">
</form>
<%
        connection.close();
    } catch (Exception e) {
        System.out.println(e);
    }
%>
</body>
</html>
