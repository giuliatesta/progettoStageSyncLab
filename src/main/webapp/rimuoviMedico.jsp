<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Rimuovi Medico</title>
</head>
<body>
    <h2>Cartella Clinica Virtuale</h2>
    <h3>Form per rimuovere un medico</h3>
    <form method="post" action="rimuoviMedicoProcess.jsp">
        Codice Fiscale*:<label> <br/>
        <input type="text" name="codice_fiscale_medico" minlength="16" maxlength="16" required>
        </label><br/><br/>
        <input type="submit" value="Conferma" name = "conferma_aggiungi_medico"/>
    </form>

    <a href="homeAmministratore.jsp">Home amministratore</a>
    <a href="logout.jsp">Logout</a>
</body>
</html>
