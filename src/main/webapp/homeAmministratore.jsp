<%@page contentType="text/html" pageEncoding="UTF-8" errorPage="Error.jsp"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home page</title>
    </head>
    <body>
        <br/><br/><br/><br/><br/>
        <h2>
            <%

                out.println("Hello "+a);
            %>
        </h2>
        <br/>
        <br/>
        <br/><br/><br/><br/><br/>
        <a href="logout.jsp">Logout</a>
    </body>
</html>
