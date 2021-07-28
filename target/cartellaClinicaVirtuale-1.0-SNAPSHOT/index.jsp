<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Form for Cartella Clinica Virtuale</title>
    </head>
    <body>
        <h1>Cartella Clinica Virtuale</h1>
        <h2>Login Form</h2>
        <form action="loginProcess.jsp" method="post">
            Codice Fiscale:<label>
            <input type="text" name="codiceFiscale" maxlength="16" minlength="16">
        </label>
            <br/>Password:<label>
            <input type="password" name="password" minlength="8">
        </label>
            <br/><br/><input type="submit" value="Conferma">
        </form>
    </body>
</html>

