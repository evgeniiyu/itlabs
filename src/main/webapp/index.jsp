<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h2>Please login</h2>
        <% boolean failed = Boolean.valueOf((String)session.getAttribute("failed"));
        if (failed) { %>
        <b>Authentication failed.</b>
        <% } %>
        <form name="loginForm" action="login" method="post">
            Login: <input type="text" name="user"><br/>
            Password: <input type="password" name="pass"><br/>
            <input type="submit" value="Login">
        </form>
    </body>
</html>
