<html>
<head>

</head>
<body>
<h2>Cartella Clinica Virtuale</h2>
<h3>Pagina di Login</h3>
<form action="loginProcess.jsp" method="post">
    Codice Fiscale:<label> <br/>
    <input type="text" name="codice_fiscale" maxlength="16" minlength="16" autofocus required/>
</label><br/><br/>
    Password:<label> <br/>
    <input type="password" name="password" required/>
</label><br/><br/>
    <input type="submit" value="Login" name = "login"/>
</form>
</body>
</html>
