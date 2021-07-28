<%@page contentType="text/html" pageEncoding="UTF-8" errorPage="error.jsp"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home page</title>
    </head>
    <body>
        <br/><br/><br/><br/><br/>
        <h2>Amministratore</h2>
        <form action="homeAmministratoreProcess.jsp" method="post">
            <input type="submit" value="Aggiungi nuovo medico">
            <br/><input type="submit" value="Rimuovi medico">
        </form>
        <br/><br/><br/><br/><br/>
        <a href="logout.jsp">Logout</a>
    </body>
</html>
