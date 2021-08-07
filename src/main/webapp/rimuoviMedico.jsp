<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Rimuovi Medico</title>
</head>
<body>
    <h2>Cartella Clinica Virtuale</h2>
    <h3>Form per rimuovere un medico</h3>
    <form method="post" action="aggiungiMedicoProcess.jsp">
        Codice Fiscale*:<label> <br/>
        <input type="text" name="codice_fiscale_medico" minlength="16" maxlength="16" required>
        </label><br/><br/>
    </form>

    <a href="homeAmministratore.jsp">Home amministratore</a>
    <a href="logout.jsp">Logout</a>
</body>
</html>
