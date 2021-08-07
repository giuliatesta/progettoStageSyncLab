<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Amministratore</title>
    </head>
    <body>
        <h1>Amministratore</h1>
        <br>
        <form action="homeAmministratoreProcess.jsp" method="post" >
            <input type="submit" value="Aggiungi medico" name="aggiungi_medico">
            <br/><input type="submit" value="Rimuovi medico" name="rimuovi_medico">
        </form>
        <br/><br/><br/><br/><br/>
        <a href="logout.jsp">Logout</a>
    </body>
</html>
